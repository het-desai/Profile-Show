package profile;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        gndgrop = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tvftnm = new javax.swing.JLabel();
        tvpass = new javax.swing.JLabel();
        edtftnm = new javax.swing.JTextField();
        edtpass = new javax.swing.JPasswordField();
        btcrte = new javax.swing.JButton();
        tvltnm = new javax.swing.JLabel();
        edtltnm = new javax.swing.JTextField();
        tvemid = new javax.swing.JLabel();
        edtemid = new javax.swing.JTextField();
        tvmbno = new javax.swing.JLabel();
        edtmbno = new javax.swing.JTextField();
        tvlgid = new javax.swing.JLabel();
        edtusid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tvrepass = new javax.swing.JLabel();
        edtrepass = new javax.swing.JPasswordField();
        tvgndr = new javax.swing.JLabel();
        edrmale = new javax.swing.JRadioButton();
        edrfeml = new javax.swing.JRadioButton();
        tvadrs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtadrs = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        tvflag = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Create Account");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMinimize.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMinimize.setText("_");
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimize)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMinimize))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        tvftnm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvftnm.setText("First Name");

        tvpass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvpass.setText("Password");

        edtftnm.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        edtpass.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        edtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtpassActionPerformed(evt);
            }
        });

        btcrte.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btcrte.setText("Create");
        btcrte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcrteMouseClicked(evt);
            }
        });

        tvltnm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvltnm.setText("Last Name");

        edtltnm.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        tvemid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvemid.setText("Email ID");

        edtemid.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        tvmbno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvmbno.setText("Mob. No.");

        edtmbno.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        tvlgid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvlgid.setText("Login ID");

        edtusid.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("This id you remember when you want to login");

        tvrepass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvrepass.setText("Re-type Password");

        edtrepass.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        tvgndr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvgndr.setText("Gender");

        edrmale.setBackground(new java.awt.Color(0, 0, 204));
        gndgrop.add(edrmale);
        edrmale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        edrmale.setText("Male");
        edrmale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edrmaleMouseClicked(evt);
            }
        });

        edrfeml.setBackground(new java.awt.Color(0, 0, 204));
        gndgrop.add(edrfeml);
        edrfeml.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        edrfeml.setText("Female");
        edrfeml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edrfemlMouseClicked(evt);
            }
        });

        tvadrs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tvadrs.setText("Address");

        edtadrs.setColumns(20);
        edtadrs.setFont(new java.awt.Font("Monospaced", 0, 22)); // NOI18N
        edtadrs.setRows(5);
        jScrollPane1.setViewportView(edtadrs);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Do not use this charters \"!@#$%^&*+=/?<>;}{][\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tvftnm)
                    .addComponent(tvltnm)
                    .addComponent(tvemid)
                    .addComponent(tvmbno)
                    .addComponent(tvgndr)
                    .addComponent(tvadrs)
                    .addComponent(tvpass)
                    .addComponent(tvrepass)
                    .addComponent(tvlgid))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edtemid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(edtltnm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(edrmale)
                                    .addGap(18, 18, 18)
                                    .addComponent(edrfeml))
                                .addComponent(edtftnm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtmbno))
                            .addComponent(jLabel5)
                            .addComponent(edtusid, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tvflag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btcrte))
                            .addComponent(edtrepass, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvftnm)
                    .addComponent(edtftnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvltnm)
                    .addComponent(edtltnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvemid)
                    .addComponent(edtemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvmbno)
                    .addComponent(edtmbno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvgndr)
                    .addComponent(edrmale)
                    .addComponent(edrfeml))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tvadrs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvlgid)
                    .addComponent(edtusid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvpass)
                    .addComponent(edtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvrepass)
                    .addComponent(edtrepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcrte)
                    .addComponent(tvflag))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void edtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtpassActionPerformed
    
    private void btcrteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcrteMouseClicked
        tvflag.setText("");
        int ckeror = 0;
        ckeror = Profile.detailscheck(edtpass.getText(), edtrepass.getText(), edtusid.getText());
        if (ckeror != 10) {
            switch (ckeror) {
                case 1: {
                    tvflag.setText("User name is invalid.");
                    break;
                }
                case 2: {
                    tvflag.setText("Password is invalid.");
                    break;
                }
                case 3:
                {tvflag.setText("Please enter different Login ID.");break;}
                default: {
                    tvflag.setText("Error Not in Database.");
                    break;
                }
            };
        } else {
            try {
                Profile.createacc(edtftnm.getText(), edtltnm.getText(),gendervalue,edtemid.getText(), edtmbno.getText(), edtusid.getText(), edtadrs.getText(), edtpass.getText(), edtrepass.getText());
            } catch (IOException ex) {
                Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
            tvflag.setText("Your Account is Created.");
            LoginForm lgf = new LoginForm();
            lgf.setVisible(true);
            lgf.pack();
            lgf.setLocationRelativeTo(null);
            lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_btcrteMouseClicked
    String gendervalue="";
    private void edrmaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edrmaleMouseClicked
        gendervalue="";gendervalue="Male";
    }//GEN-LAST:event_edrmaleMouseClicked

    private void edrfemlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edrfemlMouseClicked
        gendervalue="";gendervalue="Female";
    }//GEN-LAST:event_edrfemlMouseClicked

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcrte;
    private javax.swing.JRadioButton edrfeml;
    private javax.swing.JRadioButton edrmale;
    private javax.swing.JTextArea edtadrs;
    private javax.swing.JTextField edtemid;
    private javax.swing.JTextField edtftnm;
    private javax.swing.JTextField edtltnm;
    private javax.swing.JTextField edtmbno;
    private javax.swing.JPasswordField edtpass;
    private javax.swing.JPasswordField edtrepass;
    private javax.swing.JTextField edtusid;
    private javax.swing.ButtonGroup gndgrop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tvadrs;
    private javax.swing.JLabel tvemid;
    private javax.swing.JLabel tvflag;
    private javax.swing.JLabel tvftnm;
    private javax.swing.JLabel tvgndr;
    private javax.swing.JLabel tvlgid;
    private javax.swing.JLabel tvltnm;
    private javax.swing.JLabel tvmbno;
    private javax.swing.JLabel tvpass;
    private javax.swing.JLabel tvrepass;
    // End of variables declaration//GEN-END:variables
}
