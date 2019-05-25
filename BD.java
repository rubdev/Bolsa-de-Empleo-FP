
package bolsaempleo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ruben
 */
public class BD {
    
    private final String nombreBD;
    private Connection conexion;
    public Statement consulta;

    public BD(String nombreBD) {
        this.nombreBD = nombreBD;
    }
    
    /**
     * Establece la conexión a la base de datos
     */
    public void conexionBD() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            this.conexion = DriverManager.getConnection("jdbc:sqlite:"+this.nombreBD);
            this.consulta = conexion.createStatement();
            String query = "select * from sqlite_master where name='ciclo'";
            ResultSet rs = this.consulta.executeQuery(query);
            if (rs.next()==false){
                 this.creaBBDD();
            }
            System.out.println("AVISO: Base de datos ok");
        } catch (SQLException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    
    /**
     * Crea la estructura de la base de datos, tablas y sus relaciones
     */
    private void creaBBDD() {
        try {
            System.out.println("Creando tablas de la BD");
            String creaTablaCiclo, creaTablaEmpresa, creaTablaAlumno, creaTablaOferta, datosEmail;
            creaTablaCiclo = "CREATE TABLE ciclo (" +
                                    "codigo_junta INTEGER PRIMARY KEY," +
                                    "nombre VARCHAR(100)," +
                                    "rama VARCHAR(100)," +
                                    "nivel VARCHAR(100)," +
                                    "impartido INTEGER" +
                              ")";
            creaTablaEmpresa = "CREATE TABLE empresa (" +
                                    "empresa_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                    "nombre VARCHAR(100)," +
                                    "email VARCHAR(100)," +
                                    "telefono VARCHAR(9)," +
                                    "persona_encargada VARCHAR(100)," +
                                    "sector VARCHAR(100)," +
                                    "acepta_practicas INTEGER," +
                                    "datos_adicionales VARCHAR(500)" +
                                ")";
            creaTablaAlumno = "CREATE TABLE alumno (" +
                                    "alumno_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                    "nombre VARCHAR(100)," +
                                    "email VARCHAR(100)," +
                                    "experiencia VARCHAR(500)," +
                                    "trabajando INTEGER,\n" +
                                    "ciclo_formativo INTEGER," +
                                    "CONSTRAINT fk_id_ciclo FOREIGN KEY (ciclo_formativo) REFERENCES ciclo(codigo_junta) ON DELETE CASCADE ON UPDATE CASCADE" +
                                ")";
            creaTablaOferta = "CREATE TABLE oferta (" +
                                    "fecha_publicacion VARCHAR(100) PRIMARY KEY," +
                                    "empresa INTEGER," +
                                    "ciclo_formativo INTEGER," +
                                    "activa INTEGER," +
                                    "tipo VARCHAR(50)," +
                                    "descripcion VARCHAR(500)," +
                                    "requisitos VARCHAR(500)," +
                                    "alumno_contratado INTEGER," +
                                    "CONSTRAINT fk_id_empresa FOREIGN KEY (empresa) REFERENCES empresa(empresa_id) ON DELETE CASCADE ON UPDATE CASCADE," +
                                    "CONSTRAINT fk_id_ciclo FOREIGN KEY (ciclo_formativo) REFERENCES ciclo(codigo_junta) ON DELETE CASCADE ON UPDATE CASCADE" +
                                ")";
            datosEmail = "CREATE TABLE infoemail (id INTEGER PRIMARY KEY AUTOINCREMENT, email VARCHAR(200), password VARCHAR(200))";
            
            this.consulta.executeUpdate(creaTablaCiclo);
            this.consulta.executeUpdate(creaTablaEmpresa);
            this.consulta.executeUpdate(creaTablaAlumno);
            this.consulta.executeUpdate(creaTablaOferta);
            this.consulta.executeUpdate(datosEmail);
         
            
            System.out.println("Base de datos creada");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }   
    
    /**
     * Devuelve el objeto para la conexion con la base de datos
     * @return conexion con bd
     */
    public Connection dameConexion(){
        System.out.println("MENSAJE: Conexión a bd recibida");
        return this.conexion;
    }   
    
    /**
     * Cierra la conexion con la base de datos
     */
    public void cerrarConexion(){
        System.out.println("AVISO: Base de datos cerrada");
            try {
              this.conexion.close();
            } catch (SQLException e) {
                System.out.println("ERROR: "+e.getMessage());
            }
     }
    
}
