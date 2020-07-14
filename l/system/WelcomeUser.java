/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

/**
 *
 * @author aashirbad JAY
 */
public class WelcomeUser extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeUser
     */
    public WelcomeUser() {
        initComponents();
        setSize(1880,1200);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 55)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(67, 124, 124));
        jLabel7.setText("ODISHA");
        jPanel2.add(jLabel7);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/system/UserImage/icons8-account-48.png"))); // NOI18N
        jLabel9.setText("  ");
        jPanel2.add(jLabel9);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 660, 320, 80);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(67, 124, 124));
        jLabel2.setText("The ");
        jPanel1.add(jLabel2);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 55)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(67, 124, 124));
        jLabel5.setText("BANK ");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 55)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 124, 124));
        jLabel6.setText("OF");
        jPanel1.add(jLabel6);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 500, 320, 160);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/system/UserImage/icons8-add-user-male-50 (1).png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1190, 660, 80, 70);

        button1.setBackground(new java.awt.Color(89, 162, 192));
        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(11, 55, 55));
        button1.setLabel("Not a Customer !  Register Now..");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(1270, 660, 370, 60);

        button2.setBackground(new java.awt.Color(89, 162, 198));
        button2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(11, 55, 55));
        button2.setLabel("Are You Our Existing User ?");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(1170, 540, 370, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/system/UserImage/icons8-money-bag-100.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 200, 100, 100);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 60, 0, 0);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 55)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(67, 124, 124));
        jLabel4.setText("Hi, Welcome !");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 180, 490, 110);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/system/UserImage/icons8-user-50.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1100, 540, 60, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
        new LogInUser() . setVisible(true);
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        new formReg().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
