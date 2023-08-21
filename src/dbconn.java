

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJA MISHRA
 */
public class dbconn {
     public Statement st;
    public Connection con;
    public ResultSet rs;
    private String qry;
    
    public void loaddriver()
    {
    try{
            Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to load driver");
        }
    
    }
    public void conn()
            
    {
    try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            st=con.createStatement();
            }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
    
   }
}
    public void fetch(String qry)
    {
    try{
        rs=st.executeQuery(qry);
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());

    }
    
    
    }
    
    
    
}
