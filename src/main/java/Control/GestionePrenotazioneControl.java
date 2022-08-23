/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.mycompany.farmacysoftware.G_OrdineCorriere.Ordine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class GestionePrenotazioneControl {
    
    public void AggiungiAlCarrello(String farmaco, int qt, String tipo){
        var qt= (String) qt;
        Connection conn= null;
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Manfro1234");
        if(conn!=null){
            System.out.println("connection done");
                    }
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select *from carrello ORDER BY Numero Ordine DESC LIMIT 1");
        int NumOrdine = (int ) rs.getString("Numero Ordine");
        NumOrdine++;
        String sql =  "INSERT INTO carrello(ID, Lista Farmaci, Quantità, Numero Ordine) VALUES (?, ?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,tipo);
        ps.setString(2,farmaco);
        ps.setString(3,qt);
        ps.setString(4,NumOrdine);
        ps.execute();
        
        }catch (Exception e){
            System.out.println("connection ha sucato");
         }
    }

}
