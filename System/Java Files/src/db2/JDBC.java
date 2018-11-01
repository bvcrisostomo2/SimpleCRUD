/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;
import java.sql.*;

/**
 *
 * @author Brian
 */
public class JDBC {
    

   
    String driver ="org.sqlite.JDBC";
    String url = "jdbc:sqlite:EMPLOYEE.db";
    
    Connection getConnection() throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url);
        con.setAutoCommit(true);
        return con;
    }
    
    void putData(String sql) {
        try {
            Connection con=getConnection();
            Statement state = con.createStatement();
            state.executeUpdate(sql);
            state.close();
                    
        } catch (Exception ex) {
            
        }

    }
    public  Statement state;
    public ResultSet getData(String sql) throws Exception {
        Connection con=getConnection();
        state = con.createStatement();
        ResultSet rset = state.executeQuery(sql);
        return rset;
    }

}
