
package Ekranlar;

import Kutuphane.Firma;
import Kutuphane.Urun;
import VeriErisim.MyContext;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class FirmaEkle extends javax.swing.JFrame {

    Firma seciliFirma;

    public FirmaEkle() {
        initComponents();
        FirmaYukle();
    }

    private void FirmaYukle() {
        DefaultListModel<Firma> firmaModel = new DefaultListModel<>();
        MyContext.Firmalar.forEach((x) -> {
            firmaModel.addElement(x);
        });
        lstFirmalar.setModel(firmaModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtFirmaAdi = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFirmalar = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCiro = new javax.swing.JLabel();
        lblSiparisAdedi = new javax.swing.JLabel();
        chkAktifMi = new javax.swing.JCheckBox();
        btnGuncelle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMinSiparisSuresi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Firma Adı :");

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        lstFirmalar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFirmalar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFirmalarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFirmalar);

        jLabel1.setText("Ciro :");

        jLabel2.setText("Sipariş Adedi :");

        lblCiro.setText("278,234");

        lblSiparisAdedi.setText("478");

        chkAktifMi.setSelected(true);
        chkAktifMi.setText("Aktif");

        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        jLabel4.setText("Min Siparis Süresi :");

        jLabel5.setText("Durumu :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFirmaAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txtMinSiparisSuresi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(chkAktifMi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(lblCiro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSiparisAdedi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblCiro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblSiparisAdedi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirmaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMinSiparisSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkAktifMi)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuncelle)
                            .addComponent(btnEkle)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        DefaultListModel<Firma> firmaModel = new DefaultListModel<>();
    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        
        if(txtFirmaAdi.getText().equals("") || txtMinSiparisSuresi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bütün alanları doldurunuz.", "Dikkat!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Firma yeniFirma = new Firma();
        yeniFirma.setFirmaAdi(txtFirmaAdi.getText());
        yeniFirma.setMinSiparisSuresi(txtMinSiparisSuresi.getText());
        firmaModel.addElement(yeniFirma);
        lstFirmalar.setModel(firmaModel);
        if(chkAktifMi.isSelected()){
            yeniFirma.setAktifMi(true);
        }
        MyContext.Firmalar.add(yeniFirma);
        FirmaYukle();
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        if (seciliFirma == null) {
            return;
        }
        seciliFirma.setFirmaAdi(txtFirmaAdi.getText());
        seciliFirma.setMinSiparisSuresi(txtMinSiparisSuresi.getText());
        if(chkAktifMi.isSelected()){
            seciliFirma.setAktifMi(true);
        }else{
            seciliFirma.setAktifMi(false);
        }
        FirmaYukle();
    }//GEN-LAST:event_btnGuncelleActionPerformed
    private void lstFirmalarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFirmalarValueChanged
        // TODO add your handling code here:
        if (lstFirmalar.getSelectedValue() == null) {
            return;
        }
        seciliFirma = lstFirmalar.getSelectedValue();
        txtFirmaAdi.setText(seciliFirma.getFirmaAdi());
        txtMinSiparisSuresi.setText(seciliFirma.getMinSiparisSuresi());
        if(chkAktifMi.isSelected()){
            chkAktifMi.setSelected(seciliFirma.isAktifMi());
        }else{
            chkAktifMi.setSelected(seciliFirma.isAktifMi());
        }
    }//GEN-LAST:event_lstFirmalarValueChanged

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
            java.util.logging.Logger.getLogger(FirmaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirmaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirmaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirmaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirmaEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JCheckBox chkAktifMi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiro;
    private javax.swing.JLabel lblSiparisAdedi;
    private javax.swing.JList<Firma> lstFirmalar;
    private javax.swing.JTextField txtFirmaAdi;
    private javax.swing.JTextField txtMinSiparisSuresi;
    // End of variables declaration//GEN-END:variables
}
