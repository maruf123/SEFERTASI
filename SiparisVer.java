package Ekranlar;

import Kutuphane.Firma;
import Kutuphane.Musteri;
import Kutuphane.OdemeSekli;
import Kutuphane.Urun;
import VeriErisim.MyContext;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class SiparisVer extends javax.swing.JFrame {

    
    public SiparisVer() {
        initComponents();
        cmbOdemeSkli.setModel(new DefaultComboBoxModel<>(OdemeSekli.values()));
        cmbOdemeSkli.setSelectedIndex(-1);
        musteriYukle();
        FirmaYukle();
    }
    private void musteriYukle() {
        DefaultListModel<Musteri> musteriModel = new DefaultListModel<>();
        MyContext.Musteriler.forEach((t) -> {
            musteriModel.addElement(t);
        });
        lstMusteriler.setModel(musteriModel);
    }

    private void FirmaYukle() {
        DefaultListModel<Firma> firmaModel = new DefaultListModel<>();
        MyContext.Firmalar.forEach((x) -> {
            if (x.isAktifMi() == true) {
                firmaModel.addElement(x);
            }
        });
        lstFirmalar.setModel(firmaModel);
    }
    Firma seciliFirma;
    Urun seciliUrun;
    Musteri seciliMusteri;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFirmalar = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstMusteriler = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUrunler = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSepet = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        sAdet = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lblToplam = new javax.swing.JLabel();
        btnOnay = new javax.swing.JButton();
        btnSepeteEkle = new javax.swing.JButton();
        pnlOdemeSekli = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbOdemeSkli = new javax.swing.JComboBox<>();
        cmbTeslimZamani = new javax.swing.JComboBox<>();
        txtTeslimDakkasi = new javax.swing.JTextField();
        btnSiparisVer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Müşteriler");

        lstFirmalar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFirmalarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFirmalar);

        lstMusteriler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMusteriler.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMusterilerValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstMusteriler);

        jLabel2.setText("Firmalar");

        jLabel3.setText("Menü");

        lstUrunler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstUrunler);

        lstSepet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstSepet);

        jLabel4.setText("Sepetim");

        sAdet.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        jLabel5.setText("Toplam");

        lblToplam.setText("jLabel6");

        btnOnay.setText("Sepeti Onayla");

        btnSepeteEkle.setText("Sepete Ekle");
        btnSepeteEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepeteEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(92, 92, 92)
                        .addComponent(btnSepeteEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblToplam))
                        .addComponent(btnOnay, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblToplam))
                        .addGap(18, 18, 18)
                        .addComponent(btnOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSepeteEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLabel6.setText("Ödeme Şekli");

        cmbTeslimZamani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemen Teslim", "İleri Zaman Teslim" }));

        btnSiparisVer.setText("Siparişi Ver");

        jLabel7.setText("Ortalama Siparis Süresi");

        javax.swing.GroupLayout pnlOdemeSekliLayout = new javax.swing.GroupLayout(pnlOdemeSekli);
        pnlOdemeSekli.setLayout(pnlOdemeSekliLayout);
        pnlOdemeSekliLayout.setHorizontalGroup(
            pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOdemeSekliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOdemeSekliLayout.createSequentialGroup()
                        .addComponent(cmbOdemeSkli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cmbTeslimZamani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSiparisVer, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(txtTeslimDakkasi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOdemeSekliLayout.setVerticalGroup(
            pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOdemeSekliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOdemeSekliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOdemeSkli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTeslimZamani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeslimDakkasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiparisVer, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pnlOdemeSekli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlOdemeSekli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFirmalarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFirmalarValueChanged
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

    private void lstMusterilerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMusterilerValueChanged
        if (lstMusteriler.getSelectedValue() == null) {
            return;
        }
        FirmaYukle();
    }//GEN-LAST:event_lstMusterilerValueChanged

    private void btnSepeteEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepeteEkleActionPerformed

    }//GEN-LAST:event_btnSepeteEkleActionPerformed

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
            java.util.logging.Logger.getLogger(SiparisVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisVer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOnay;
    private javax.swing.JButton btnSepeteEkle;
    private javax.swing.JButton btnSiparisVer;
    private javax.swing.JComboBox<OdemeSekli> cmbOdemeSkli;
    private javax.swing.JComboBox<String> cmbTeslimZamani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblToplam;
    private javax.swing.JList<Firma> lstFirmalar;
    private javax.swing.JList<Musteri> lstMusteriler;
    private javax.swing.JList<String> lstSepet;
    private javax.swing.JList<Urun> lstUrunler;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlOdemeSekli;
    private javax.swing.JSpinner sAdet;
    private javax.swing.JTextField txtTeslimDakkasi;
    // End of variables declaration//GEN-END:variables
}
