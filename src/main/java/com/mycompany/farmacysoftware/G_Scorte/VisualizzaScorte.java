/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Scorte;


import com.mycompany.farmacysoftware.Home;
import java.awt.event.ActionEvent;
import java.sql.*;

/**
 *
 * @author manfr
 */
public class VisualizzaScorte extends javax.swing.JFrame {




    /**
     * Creates new form VisualizzaScorte
     */
    public VisualizzaScorte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bottoneHome = new javax.swing.JButton();
        bottoneIndietro = new javax.swing.JButton();
        PannelloRicerca = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bottoneCerca = new javax.swing.JButton();
        bottoneVisualizza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Visualizza Scorte");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 27, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 59, 603, -1));

        bottoneHome.setText("Home");
        bottoneHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneHomeActionPerformed(evt);
            }
        });
        getContentPane().add(bottoneHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 31, -1, -1));

        bottoneIndietro.setText("Indietro");
        bottoneIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneIndietroActionPerformed(evt);
            }
        });
        getContentPane().add(bottoneIndietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 31, -1, -1));

        PannelloRicerca.setBackground(new java.awt.Color(0, 102, 102));
        PannelloRicerca.setForeground(new java.awt.Color(242, 242, 242));
        PannelloRicerca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Farmaco", "Tipo Farmaco", "Quantità"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nome Farmaco");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Tipo Farmaco");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Quantità");
        }

        PannelloRicerca.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 650, 380));

        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Cerca il Farmaco:");
        PannelloRicerca.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 30));
        PannelloRicerca.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 300, 30));

        bottoneCerca.setText("Cerca");
        bottoneCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneCercaActionPerformed(evt);
            }
        });
        PannelloRicerca.add(bottoneCerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 80, 30));

        bottoneVisualizza.setText("Visualizza");
        bottoneVisualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneVisualizzaActionPerformed(evt);
            }
        });
        PannelloRicerca.add(bottoneVisualizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        getContentPane().add(PannelloRicerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 64, 670, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneIndietroActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottoneIndietroActionPerformed

    private void bottoneHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneHomeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottoneHomeActionPerformed

    private void bottoneCercaActionPerformed(ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_bottoneCercaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bottoneCercaActionPerformed

    private void bottoneVisualizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneVisualizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottoneVisualizzaActionPerformed





    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizzaScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizzaScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizzaScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizzaScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>






        /*

        LinkedList<visualizzaScorteControl> linkedList = new LinkedList<visualizzaScorteControl>();
        visualizzaScorteControl vsc = new visualizzaScorteControl();





        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM `farmaci`;";
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData metaData = rs.getMetaData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String Nome;
        String Tipo;
        String Quantità;

        while (rs.next()==true) {

            model.addRow(new Object[]{rs.getString("Nome"), rs.getString("Tipo"), rs.getString("Quantità")});

        }
        conn.close();
        */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizzaScorte().setVisible(true);
            }
        });
    }













    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelloRicerca;
    private javax.swing.JButton bottoneCerca;
    private javax.swing.JButton bottoneHome;
    private javax.swing.JButton bottoneIndietro;
    private javax.swing.JButton bottoneVisualizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
