/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class JFrameViewBtn extends javax.swing.JFrame {

    /**
     * Creates new form JFrameViewBtn
     */
    public JFrameViewBtn() {
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

        jLabelSelectedRowMessage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newFrameJTextFieldEngine = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newFrameJTextFieldColor = new javax.swing.JTextField();
        newFrameJTextFieldCapacity = new javax.swing.JTextField();
        newFrameJTextFieldModel = new javax.swing.JTextField();
        newFrameJTextFieldVbrand = new javax.swing.JTextField();
        newFrameJTextFieldCost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newFrameJTextFieldType = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        newFrameJTextFieldSelected = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        newFrameJLabelFieldImage = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabelSelectedRowMessage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSelectedRowMessage.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Engine Effiecence");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 250, 50));

        newFrameJTextFieldEngine.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldEngine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newFrameJTextFieldEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFrameJTextFieldEngineActionPerformed(evt);
            }
        });
        jPanel1.add(newFrameJTextFieldEngine, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 250, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel2.setText("Color");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 170, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel3.setText("Capacity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 140, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel4.setText("Model Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 240, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel5.setText("Vehicle Brand");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 210, -1));

        newFrameJTextFieldColor.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newFrameJTextFieldColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 250, 50));

        newFrameJTextFieldCapacity.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldCapacity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newFrameJTextFieldCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 250, 50));

        newFrameJTextFieldModel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldModel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newFrameJTextFieldModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 260, 50));

        newFrameJTextFieldVbrand.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldVbrand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newFrameJTextFieldVbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 260, 50));

        newFrameJTextFieldCost.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newFrameJTextFieldCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 250, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel7.setText("Cost");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 80, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel8.setText("Vehicle Type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 190, -1));

        newFrameJTextFieldType.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newFrameJTextFieldType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 260, 50));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel9.setText("Year Of Purchase");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 250, -1));

        newFrameJTextFieldSelected.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        newFrameJTextFieldSelected.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newFrameJTextFieldSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFrameJTextFieldSelectedActionPerformed(evt);
            }
        });
        jPanel1.add(newFrameJTextFieldSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 260, 50));

        jPanel2.setBackground(new java.awt.Color(153, 44, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(newFrameJLabelFieldImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 270, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 940, 250));

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setBorder(null);
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 250, 50));

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jTextField7.setBorder(null);
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 250, 50));

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setBorder(null);
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 250, 50));

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setBorder(null);
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 250, 50));

        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setBorder(null);
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 260, 50));

        jTextField12.setBackground(new java.awt.Color(102, 102, 102));
        jTextField12.setBorder(null);
        jTextField12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 260, 50));

        jTextField13.setBackground(new java.awt.Color(102, 102, 102));
        jTextField13.setBorder(null);
        jTextField13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 250, 50));

        jTextField14.setBackground(new java.awt.Color(102, 102, 102));
        jTextField14.setBorder(null);
        jTextField14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 250, 50));

        jButton1.setBackground(new java.awt.Color(153, 44, 153));
        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 810, 200, 70));

        jButton2.setBackground(new java.awt.Color(153, 44, 153));
        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 810, 170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newFrameJTextFieldEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFrameJTextFieldEngineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFrameJTextFieldEngineActionPerformed

    private void newFrameJTextFieldSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFrameJTextFieldSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFrameJTextFieldSelectedActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.toBack();
        setVisible(false);
        JFrameViewBtn jFrameViewBtn = new JFrameViewBtn();
        jFrameViewBtn.toFront();
        jFrameViewBtn.setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "You Buy The Selected Car");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameViewBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameViewBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameViewBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameViewBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameViewBtn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelSelectedRowMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JLabel newFrameJLabelFieldImage;
    public javax.swing.JTextField newFrameJTextFieldCapacity;
    public javax.swing.JTextField newFrameJTextFieldColor;
    public javax.swing.JTextField newFrameJTextFieldCost;
    public javax.swing.JTextField newFrameJTextFieldEngine;
    public javax.swing.JTextField newFrameJTextFieldModel;
    public javax.swing.JTextField newFrameJTextFieldSelected;
    public javax.swing.JTextField newFrameJTextFieldType;
    public javax.swing.JTextField newFrameJTextFieldVbrand;
    // End of variables declaration//GEN-END:variables
}
