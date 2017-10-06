package Ekranlar;

import Kutuphane.Firma;
import Kutuphane.Urun;
import VeriErisim.MyContext;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class UrunEkle extends javax.swing.JFrame {

    /**
     * Creates new form UrunEkle
     */
    public UrunEkle() {
        initComponents();
        FirmaYukle();
        txtUrunAdi.setEnabled(false);
        txtFiyati.setEnabled(false);
        btnEkle.setEnabled(false);
        btnSil.setEnabled(false);
        btnGuncelle.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
    }

    private void FirmaYukle() {
        DefaultListModel<Firma> firmaModel = new DefaultListModel<>();
        MyContext.Firmalar.forEach((t) -> {
            firmaModel.addElement(t);
        });
        lstFirmalar.setModel(firmaModel);
    }
    Firma seciliFirma;

    public void temizle() {
        txtUrunAdi.setText("");
        txtFiyati.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFirmalar = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUrunler = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        txtFiyati = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstFirmalar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFirmalar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFirmalarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFirmalar);

        lstUrunler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstUrunler.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUrunlerValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstUrunler);

        jLabel1.setText("Firma Seç");

        jLabel2.setText("Menü");

        jLabel3.setText("Ürün Adı :");

        jLabel4.setText("Fiyatı :");

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        jLabel5.setText("Ürün CRUD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuncelle))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFiyati)
                            .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEkle)
                                    .addComponent(btnGuncelle)
                                    .addComponent(btnSil)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultListModel<Urun> urunModel = new DefaultListModel<>();
    private void lstFirmalarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFirmalarValueChanged
        txtUrunAdi.setEnabled(true);
        txtUrunAdi.setText("");
        txtFiyati.setEnabled(true);
        txtFiyati.setText("");
        btnEkle.setEnabled(true);
        btnSil.setEnabled(true);
        btnGuncelle.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        if (lstFirmalar.getSelectedValue() == null) {
            return;
        }
        seciliFirma = lstFirmalar.getSelectedValue();
        MyContext.Firmalar.forEach((t) -> {
            if (t.getId() == seciliFirma.getId()) {
                seciliFirma = t;
            }
        });
        DefaultListModel<Urun> urunModel = new DefaultListModel<>();
        seciliFirma.Urunlerim.forEach((t) -> {
            urunModel.addElement(t);
        });
        lstUrunler.setModel(urunModel);
    }//GEN-LAST:event_lstFirmalarValueChanged

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        seciliFirma = lstFirmalar.getSelectedValue();
        if (seciliFirma == null) {
            return;
        }
        if(txtUrunAdi.getText().equals("") || txtFiyati.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bütün alanları doldurunuz.", "Dikkat!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        MyContext.Firmalar.forEach((x) -> {
            if (seciliFirma.getId().equals(x.getId())) {
                seciliFirma = x;
            }
        });
        Urun yeniUrun = new Urun();
        yeniUrun.setUrunAdi(txtUrunAdi.getText());
        yeniUrun.setUrunFiyati(Double.parseDouble(txtFiyati.getText()));
        urunModel.addElement(yeniUrun);
        seciliFirma.Urunlerim.add(yeniUrun);
        //Ürünleri tekrar yükler ( Bunu fonksiyona al "Ekle"de de var )
        DefaultListModel<Urun> urunModel = new DefaultListModel<>();
        seciliFirma.Urunlerim.forEach((t) -> {
            urunModel.addElement(t);
        });
        lstUrunler.setModel(urunModel);
        MyContext.Urunler.add(yeniUrun);
        seciliFirma = null;

        temizle();
    }//GEN-LAST:event_btnEkleActionPerformed
    Urun seciliUrun;
    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        seciliUrun = lstUrunler.getSelectedValue();
        if (seciliUrun == null) {
            return;
        }
        seciliUrun.setUrunAdi(txtUrunAdi.getText());
        seciliUrun.setUrunFiyati(Double.parseDouble(txtFiyati.getText()));
        repaint();
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void lstUrunlerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUrunlerValueChanged
        if (lstUrunler.getSelectedValue() == null) {
            return;
        }
        seciliUrun = lstUrunler.getSelectedValue();
        txtUrunAdi.setText(seciliUrun.getUrunAdi());
        txtFiyati.setText(String.valueOf(seciliUrun.getUrunFiyati()));
        seciliUrun = null;
    }//GEN-LAST:event_lstUrunlerValueChanged

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        
        if (lstUrunler.getSelectedValue() == null) {
            return;
        }
        seciliFirma = lstFirmalar.getSelectedValue();
        seciliUrun = lstUrunler.getSelectedValue();
        int dialogResult = JOptionPane.showOptionDialog(null, "Ürünü silmek istediğinize emin misiniz?", "Dikkat!", JOptionPane.OK_CANCEL_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        null, 
        new String[]{"Uçur", "Hayır, silme"}, // this is the array
        "default");
        if (dialogResult == JOptionPane.YES_OPTION) {     
            seciliFirma.Urunlerim.remove(seciliUrun);  
        }
        
        //Ürünleri tekrar yükler ( Bunu fonksiyona al "Ekle"de de var )
        DefaultListModel<Urun> urunModel = new DefaultListModel<>();
        seciliFirma.Urunlerim.forEach((t) -> {
            urunModel.addElement(t);
        });
        lstUrunler.setModel(urunModel);

    }//GEN-LAST:event_btnSilActionPerformed

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
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrunEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Firma> lstFirmalar;
    private javax.swing.JList<Urun> lstUrunler;
    private javax.swing.JTextField txtFiyati;
    private javax.swing.JTextField txtUrunAdi;
    // End of variables declaration//GEN-END:variables
}
