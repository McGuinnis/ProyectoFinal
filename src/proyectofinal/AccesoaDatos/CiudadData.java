/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.AccesoaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Ciudad;

/**
 *
 * @author Luis
 */
public class CiudadData {

    private PreparedStatement ps;

    private Connection con = null;

    public CiudadData() {

        con = Conexion.getConexion();
    }

//Insertando una Ciudad
    public void agregarCiudad(Ciudad ciudad) {

        String sql = "INSERT INTO ciudad (Nombre, Pais, Estado, Provincia)"
                + "VALUES(?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getProvincia());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudad Agregada con Exito");
            }
            ps.close();
        } catch (SQLException eq) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad y/o entrada duplicada");
        }

    }

    public void eliminarCiudad(int id) { // ****Eliminando Logicamente una Ciudad

        String sql = "UPDATE ciudad SET Estado = 0 WHERE idCiudad = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Ciudad eliminada con Exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
    }

    public void modificarCiudad(Ciudad ciudad) {
        String sql = "Update ciudad SET Nombre=?, Pais=?, Provincia=? "
                + "Where idCiudad=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setInt(4, ciudad.getIdCiudad());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ciudad actualizada con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
    }

    public Ciudad buscarCiudad(int id) {
        Ciudad ciudad = null;
        String sql = "SELECT Nombre, Pais, Estado, Provincia FROM ciudad WHERE idCiudad=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(id);
                ciudad.setNombre(rs.getString("Nombre"));
                ciudad.setPais(rs.getString("Pais"));
                ciudad.setEstado(rs.getBoolean("Estado"));
                ciudad.setProvincia(rs.getString("Provincia"));

            } else {
                JOptionPane.showMessageDialog(null, "Ciudad no Disponible");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        } catch (NullPointerException ex2) {

        }
        return ciudad;
    }
    //*************************************************
    public Ciudad buscarCiudadPorNombre(String nombre) {
        Ciudad ciudad = null;
        String sql = "SELECT Pais, Estado, Provincia, idCiudad FROM ciudad WHERE Nombre=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(nombre);
                ciudad.setPais(rs.getString("Pais"));
                ciudad.setEstado(rs.getBoolean("Estado"));
                ciudad.setProvincia(rs.getString("Provincia"));

            } else {
                JOptionPane.showMessageDialog(null, "Ciudad no encontrada");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        } catch (NullPointerException ex2) {

        }
        return ciudad;
    }
    //*************************************************
    

    public List<Ciudad> listarCiudadPorPais(String pais) {

        String sql = "SELECT `idCiudad`, `Nombre`, `Estado`, `Provincia` FROM `ciudad` WHERE estado=1 AND Pais=?";
        ArrayList<Ciudad> ciudadList = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pais);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();

                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("Nombre"));
                ciudad.setEstado(true);
                ciudad.setProvincia(rs.getString("Provincia"));
                ciudad.setPais(pais);
                ciudadList.add(ciudad);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ciudadList;
    }

    public List<String> listarPaises() {

        String sql = "SELECT DISTINCT pais FROM ciudad";
        List<String> listaPaises = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String pais = rs.getString("pais");
                listaPaises.add(pais);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }

        return listaPaises;

    }
    
    public List<String> listarProvinciasPorPaisC(String pais){
        
        String sql = "SELECT DISTINCT provincia FROM ciudad WHERE pais = ?";
        List<String> listaProvincias = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);           
            ps.setString(1, pais);            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                String provincia = rs.getString("provincia");
                listaProvincias.add(provincia);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
        return listaProvincias;
    }
    
    public List<Ciudad> listarProvinciasPorPaisCombo(String pais){
        
        String sql = "SELECT DISTINCT provincia FROM ciudad WHERE pais = ?";
        List<Ciudad> listaProvincias = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);           
            ps.setString(1, pais);            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                String newProvincia = rs.getString("provincia");
                Ciudad provincia = new Ciudad();
                provincia.setProvincia(newProvincia);
                listaProvincias.add(provincia);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
        return listaProvincias;
    }
    
     public List<Ciudad> listarCiudadPorProvinciaypais(String pais,String provincia ) {

        String sql = "SELECT `idCiudad`, `Nombre` FROM `ciudad` WHERE Provincia=? AND Pais=? ";
        ArrayList<Ciudad> ciudadList = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, provincia);
            ps.setString(2, pais);
            

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();

                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("Nombre"));
                ciudad.setEstado(true);
                ciudad.setProvincia(provincia);
                ciudad.setPais(pais);
                ciudadList.add(ciudad);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ciudadList;
    }
    
     public List<Ciudad> listarCiudad() {

        String sql = "SELECT * FROM `ciudad` WHERE estado=1 ";
        ArrayList<Ciudad> ciudadList = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
           

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();

                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("Nombre"));
                ciudad.setEstado(true);
                ciudad.setProvincia(rs.getString("Provincia"));
                ciudad.setPais(rs.getString("Pais"));
                ciudadList.add(ciudad);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ciudadList;
    }
}
