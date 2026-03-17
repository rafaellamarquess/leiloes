
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/leiloestdsat",
                "root",
                "cherrybomb"
            );
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
