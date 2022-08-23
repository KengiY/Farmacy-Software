package Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;


public class ControlDiRicercaFarmaci {
    String barraDIRicerca;
    List<String> nome= new LinkedList<String>();
    List<String> id= new LinkedList<String>();
    
    List<String> quantità = new LinkedList<String>();
    List<String> numero_ordine = new LinkedList<String>();
    
    
    
    public List<String> getListN(){
    return  nome;
    }
    
    public List<String> getListI(){
    return  id;
    }
    
    public List<String> getListQ(){
    return  quantità;
    }
    
    public List<String> getListNO(){
    return  numero_ordine;
    }
    
    
    public void VIsualizzaFarmaci(){
        Connection conn= null;
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Bruno1234");
        if(conn!=null){
            System.out.println("connection done");
                    }
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from lista_farmaci");
        
        while(rs.next())
            {
                String name= rs.getString("Nome");
                String ad= String.valueOf(rs.getInt("ID"));
                nome.add(name);
                id.add(ad);



                }
        
        
        }catch (Exception e){
            System.out.println("connection ha sucato");
            }
    }
    
    
    public void VisualizzaCarrello(){
        Connection conn= null;
        try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Bruno1234");
        if(conn!=null){
            System.out.println("connection done");
                    }
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from carrello");
        
        
        while(rs.next()){
            
            String TipoID = String.valueOf(rs.getInt("ID"));
            String nomeFarmaco = rs.getString("Lista Farmaci");
            String qua = String.valueOf(rs.getInt("Quantità"));
            String nOrdine = String.valueOf(rs.getInt("Numero Ordine"));
            id.add(TipoID);
            nome.add(nomeFarmaco);
            quantità.add(qua);
            numero_ordine.add(nOrdine);  
        }
  
        }catch (Exception e){
            System.out.println("connection ha sucato");
            }
    
    
    

    }
}
