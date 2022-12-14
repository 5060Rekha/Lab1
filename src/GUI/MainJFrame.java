/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import models.User;

/**
 *
 * @author sajja
 */
public final class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    User user;
    
    public MainJFrame() {
        user=new User();
        initComponents();
        ImageJPanel images = new ImageJPanel();
        splitPanel.setRightComponent(images);
        
        
    }
    /**
    public void scaleImages(){
        
        ImageIcon icon=new ImageIcon("C:\\Users\\sajja\\OneDrive\\Desktop\\images-Appl\\sure.jpg");
        Image img=icon.getImage();
        Image imgScale;
        imgScale = img.getScaledInstance(jPanel1.getWidth(),jPanel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        jTxtPhoto.setIcon(scaledIcon);
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        jButton = new javax.swing.JPanel();
        jCreate = new javax.swing.JButton();
        jDisplay = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCreate.setText("Create");
        jCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateActionPerformed(evt);
            }
        });

        jDisplay.setText("Display");
        jDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButtonLayout = new javax.swing.GroupLayout(jButton);
        jButton.setLayout(jButtonLayout);
        jButtonLayout.setHorizontalGroup(
            jButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDisplay)
                    .addComponent(jCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jButtonLayout.setVerticalGroup(
            jButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jCreate)
                .addGap(33, 33, 33)
                .addComponent(jDisplay)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(jButton);

        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(695, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createJPanel=new CreateJPanel(user);
        splitPanel.setRightComponent(createJPanel);
    }//GEN-LAST:event_jCreateActionPerformed

    private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayActionPerformed
        // TODO add your handling code here:
        DemoJPanel demo=new DemoJPanel(user);
        splitPanel.setRightComponent(demo);
    }//GEN-LAST:event_jDisplayActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jButton;
    private javax.swing.JButton jCreate;
    private javax.swing.JButton jDisplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane splitPanel;
    // End of variables declaration//GEN-END:variables
}
