
package Frames;

import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FrmMain extends javax.swing.JFrame {

 
    public FrmMain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink1 = new com.xzq.osc.JocHyperlink();
        jocHyperlink2 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup2 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink3 = new com.xzq.osc.JocHyperlink();
        jocHyperlink4 = new com.xzq.osc.JocHyperlink();
        btnMenuUnit = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup3 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnMenuEmp = new com.xzq.osc.JocHyperlink();
        btnMenuPosition = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup4 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink8 = new com.xzq.osc.JocHyperlink();
        jocHyperlink9 = new com.xzq.osc.JocHyperlink();
        jocHyperlink10 = new com.xzq.osc.JocHyperlink();
        jocHyperlink11 = new com.xzq.osc.JocHyperlink();
        jocHyperlink12 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup5 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink13 = new com.xzq.osc.JocHyperlink();
        jocHyperlink14 = new com.xzq.osc.JocHyperlink();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DeskTopControl = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jTaskPaneGroup1.setTitle("ການຂາຍ");
        jTaskPaneGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        jocHyperlink1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/13 di sieu thi.png"))); // NOI18N
        jocHyperlink1.setText("ຂາຍ");
        jocHyperlink1.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(jocHyperlink1);

        jocHyperlink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/purchase.png"))); // NOI18N
        jocHyperlink2.setText("ລາຍການຂາຍ");
        jocHyperlink2.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(jocHyperlink2);

        jTaskPane1.add(jTaskPaneGroup1);

        jTaskPaneGroup2.setTitle("ຂໍ້ມູນສິນຄ້າ");
        jTaskPaneGroup2.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        jocHyperlink3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Inv.png"))); // NOI18N
        jocHyperlink3.setText("ສິນຄ້າ");
        jocHyperlink3.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink3);

        jocHyperlink4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cube.png"))); // NOI18N
        jocHyperlink4.setText("ປະເພດສິນຄ້າ");
        jocHyperlink4.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink4);

        btnMenuUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/stats.png"))); // NOI18N
        btnMenuUnit.setText("ັຫົວໜ່ວຍ");
        btnMenuUnit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        btnMenuUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuUnitActionPerformed(evt);
            }
        });
        jTaskPaneGroup2.getContentPane().add(btnMenuUnit);

        jTaskPane1.add(jTaskPaneGroup2);

        jTaskPaneGroup3.setTitle("ຂໍ້ມູນພະນັກງານ");
        jTaskPaneGroup3.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        btnMenuEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/69-512.png"))); // NOI18N
        btnMenuEmp.setText("ພະນັກງານ");
        btnMenuEmp.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        btnMenuEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuEmpActionPerformed(evt);
            }
        });
        jTaskPaneGroup3.getContentPane().add(btnMenuEmp);

        btnMenuPosition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Organization.png"))); // NOI18N
        btnMenuPosition.setText("ຕຳແໜ່ງ");
        btnMenuPosition.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        btnMenuPosition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPositionActionPerformed(evt);
            }
        });
        jTaskPaneGroup3.getContentPane().add(btnMenuPosition);

        jTaskPane1.add(jTaskPaneGroup3);

        jTaskPaneGroup4.setExpanded(false);
        jTaskPaneGroup4.setTitle("ລາຍງານ");
        jTaskPaneGroup4.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        jocHyperlink8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.reports.icon.png"))); // NOI18N
        jocHyperlink8.setText("ພະນັກງານ");
        jocHyperlink8.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink8);

        jocHyperlink9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.reports.icon.png"))); // NOI18N
        jocHyperlink9.setText("ສິນຄ້າ");
        jocHyperlink9.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink9);

        jocHyperlink10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.reports.icon.png"))); // NOI18N
        jocHyperlink10.setText("ຂາຍຕາມວັນທີ່");
        jocHyperlink10.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink10);

        jocHyperlink11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.reports.icon.png"))); // NOI18N
        jocHyperlink11.setText("ຂາຍຕາມຊ່ວງໄລຍະເວລາ");
        jocHyperlink11.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink11);

        jocHyperlink12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.reports.icon.png"))); // NOI18N
        jocHyperlink12.setText("ຂາຍຕາມພະນັກງານ");
        jocHyperlink12.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink12);

        jTaskPane1.add(jTaskPaneGroup4);

        jTaskPaneGroup5.setExpanded(false);
        jTaskPaneGroup5.setTitle("ຕັ້ງຄ່າລະບົບ");
        jTaskPaneGroup5.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        jocHyperlink13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/house-xxl.png"))); // NOI18N
        jocHyperlink13.setText("ຂໍມູນບໍລິສັດ");
        jocHyperlink13.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink13);

        jocHyperlink14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user-permissions.png"))); // NOI18N
        jocHyperlink14.setText("ຜູ້ໃຊ້ລະບົບ");
        jocHyperlink14.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jocHyperlink14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink14);

        jTaskPane1.add(jTaskPaneGroup5);

        jPanel1.add(jTaskPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("-------------------------------------------------");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout DeskTopControlLayout = new javax.swing.GroupLayout(DeskTopControl);
        DeskTopControl.setLayout(DeskTopControlLayout);
        DeskTopControlLayout.setHorizontalGroup(
            DeskTopControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        DeskTopControlLayout.setVerticalGroup(
            DeskTopControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        jPanel2.add(DeskTopControl, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPositionActionPerformed
        try {
            FrmPosition frmPosition = new FrmPosition();
            DeskTopControl.add(frmPosition);
            frmPosition.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMenuPositionActionPerformed

    private void btnMenuEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuEmpActionPerformed
        FrmEmployeeList frmEmp  = new FrmEmployeeList();
        DeskTopControl.add(frmEmp);
        frmEmp.setVisible(true);
        try {
          frmEmp.setMaximum(true);
        } catch (PropertyVetoException e) {
            JOptionPane.showConfirmDialog(null,"Can not be maximized!");
        }
    }//GEN-LAST:event_btnMenuEmpActionPerformed

    private void btnMenuUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuUnitActionPerformed
        try {
            FrmUnit frmObj = new FrmUnit();
            DeskTopControl.add(frmObj);
            frmObj.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMenuUnitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskTopControl;
    private com.xzq.osc.JocHyperlink btnMenuEmp;
    private com.xzq.osc.JocHyperlink btnMenuPosition;
    private com.xzq.osc.JocHyperlink btnMenuUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup4;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup5;
    private com.xzq.osc.JocHyperlink jocHyperlink1;
    private com.xzq.osc.JocHyperlink jocHyperlink10;
    private com.xzq.osc.JocHyperlink jocHyperlink11;
    private com.xzq.osc.JocHyperlink jocHyperlink12;
    private com.xzq.osc.JocHyperlink jocHyperlink13;
    private com.xzq.osc.JocHyperlink jocHyperlink14;
    private com.xzq.osc.JocHyperlink jocHyperlink2;
    private com.xzq.osc.JocHyperlink jocHyperlink3;
    private com.xzq.osc.JocHyperlink jocHyperlink4;
    private com.xzq.osc.JocHyperlink jocHyperlink8;
    private com.xzq.osc.JocHyperlink jocHyperlink9;
    // End of variables declaration//GEN-END:variables
}
