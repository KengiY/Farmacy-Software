/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Prenotazione;

import com.mycompany.farmacysoftware.G_Prenotazione.GestionePrenotazione;
import com.mycompany.farmacysoftware.Home;
import javax.swing.JOptionPane;

/**
 *
 * @author manfr
 */
public class ModificaAnnullaOrdine extends javax.swing.JFrame {
    
   
    /**
     * Creates new form ModificaAnnullaOrdine
     */
    public ModificaAnnullaOrdine() {
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

        labelModificaAnnullaOrdine = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bottoneHome = new javax.swing.JButton();
        bottoneIndietro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bottoneModifica = new javax.swing.JButton();
        bottoneAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        labelModificaAnnullaOrdine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelModificaAnnullaOrdine.setText("Modifica / Annulla Ordine");

        bottoneHome.setText("Home");
        bottoneHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneHomeActionPerformed(evt);
            }
        });

        bottoneIndietro.setText("Indietro");
        bottoneIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneIndietroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Prova 1",  new Integer(2)},
                {"Prova 2 ",  new Integer(2)},
                {"Prova 3",  new Integer(32)},
                {"Prova 4",  new Integer(2)}
            },
            new String [] {
                "Nome", "Quantità"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bottoneModifica.setText("Modifica");
        bottoneModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneModificaActionPerformed(evt);
            }
        });

        bottoneAnnulla.setText("Annulla");
        bottoneAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAnnullaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottoneAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneModifica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottoneAnnulla)
                .addGap(18, 18, 18)
                .addComponent(bottoneModifica)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelModificaAnnullaOrdine)
                        .addGap(229, 229, 229)
                        .addComponent(bottoneIndietro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottoneHome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModificaAnnullaOrdine)
                    .addComponent(bottoneHome)
                    .addComponent(bottoneIndietro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneModificaActionPerformed
        // TODO add your handling code here:
        new ModificaQuantitàOrdine().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bottoneModificaActionPerformed

    private void bottoneAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAnnullaActionPerformed
        // TODO add your handling code here:
        String [] ArrayFarmaci = {"Stai annullando questo ordine: \nProva1 \nProva2 \nProva3 \nProva4 \nProva5"};
        JOptionPane.showMessageDialog(null,ArrayFarmaci);
    }//GEN-LAST:event_bottoneAnnullaActionPerformed

    private void bottoneIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneIndietroActionPerformed
        // TODO add your handling code here:
        new GestionePrenotazione().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottoneIndietroActionPerformed

    private void bottoneHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneHomeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottoneHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ModificaAnnullaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaAnnullaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaAnnullaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaAnnullaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        
        
        
        
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaAnnullaOrdine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneAnnulla;
    private javax.swing.JButton bottoneHome;
    private javax.swing.JButton bottoneIndietro;
    private javax.swing.JButton bottoneModifica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelModificaAnnullaOrdine;
    // End of variables declaration//GEN-END:variables
}
