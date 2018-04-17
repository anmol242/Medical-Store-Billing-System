
package medicalstore;

import java.awt.Toolkit;

public class Main_Module extends javax.swing.JFrame {
    int flag=0,flag1=0;
    LoginScreen l=new LoginScreen();

    public Main_Module() {
        setVisible(true);
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize =(int)tk.getScreenSize().getWidth();
        int ysize=(int)tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
        
        if(l.rights.equals("guest".trim()))
        {
          lsup.setVisible(false);
          lrep.setVisible(false);
         
          lsuppr.setVisible(false);
         
          lreportse.setVisible(false);
          lsupadd.setVisible(false);
          lsupedit.setVisible(false);
         
        
        lsupadd.setVisible(false);
        lsupedit.setVisible(false);
        
        lreportse.setVisible(false);
        lresetpass.setVisible(false);
        llogout.setVisible(false);
        lsuppr.setVisible(false);
        }
        else
        {
        lsupadd.setVisible(false);
        lsupedit.setVisible(false);
        lreportse.setVisible(false);
        lresetpass.setVisible(false);
        llogout.setVisible(false);
        lsuppr.setVisible(false);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JDesktopPane();
        panel2 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        lsup = new javax.swing.JLabel();
        lrep = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lsupadd = new javax.swing.JLabel();
        lsupedit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lreportse = new javax.swing.JLabel();
        lsuppr = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lresetpass = new javax.swing.JLabel();
        llogout = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        lpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pane.setEnabled(false);
        pane.setOpaque(false);

        panel2.setOpaque(false);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2560, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        pane.add(panel2);
        panel2.setBounds(360, 0, 2560, 730);

        panel1.setEnabled(false);
        panel1.setOpaque(false);

        lsup.setBackground(new java.awt.Color(0, 0, 0));
        lsup.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lsup.setForeground(new java.awt.Color(255, 255, 255));
        lsup.setText(" SUPPLIER");
        lsup.setOpaque(true);
        lsup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsupMouseClicked(evt);
            }
        });

        lrep.setBackground(new java.awt.Color(0, 0, 0));
        lrep.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lrep.setForeground(new java.awt.Color(255, 255, 255));
        lrep.setText("  REPORTS");
        lrep.setOpaque(true);
        lrep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lrepMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("     Bill");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("     User");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jPanel2.setOpaque(false);

        lsupadd.setBackground(new java.awt.Color(0, 0, 0));
        lsupadd.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lsupadd.setForeground(new java.awt.Color(255, 255, 255));
        lsupadd.setText(" Add");
        lsupadd.setOpaque(true);
        lsupadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsupaddMouseClicked(evt);
            }
        });

        lsupedit.setBackground(new java.awt.Color(0, 0, 0));
        lsupedit.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lsupedit.setForeground(new java.awt.Color(255, 255, 255));
        lsupedit.setText(" Edit");
        lsupedit.setOpaque(true);
        lsupedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsupeditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lsupedit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsupadd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lsupadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lsupedit)
                .addGap(65, 65, 65))
        );

        jPanel4.setOpaque(false);

        lreportse.setBackground(new java.awt.Color(0, 0, 0));
        lreportse.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lreportse.setForeground(new java.awt.Color(255, 255, 255));
        lreportse.setText("   Selling");
        lreportse.setOpaque(true);
        lreportse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lreportseMouseClicked(evt);
            }
        });

        lsuppr.setBackground(new java.awt.Color(0, 0, 0));
        lsuppr.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lsuppr.setForeground(new java.awt.Color(255, 255, 255));
        lsuppr.setText("  Supplier");
        lsuppr.setOpaque(true);
        lsuppr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsupprMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lsuppr, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(lreportse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lsuppr)
                .addGap(18, 18, 18)
                .addComponent(lreportse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        lresetpass.setBackground(new java.awt.Color(0, 0, 0));
        lresetpass.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lresetpass.setForeground(new java.awt.Color(255, 255, 255));
        lresetpass.setText(" Reset Pasword");
        lresetpass.setOpaque(true);
        lresetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lresetpassMouseClicked(evt);
            }
        });

        llogout.setBackground(new java.awt.Color(0, 0, 0));
        llogout.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        llogout.setForeground(new java.awt.Color(255, 255, 255));
        llogout.setText("       Logout");
        llogout.setOpaque(true);
        llogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lresetpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(llogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lresetpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lsup, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lrep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lsup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lrep, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, Short.MAX_VALUE))
        );

        pane.add(panel1);
        panel1.setBounds(0, 10, 350, 380);

        hide.setText("<");
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        pane.add(hide);
        hide.setBounds(40, 400, 40, 41);

        lpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalstore/images/White-And-Light-Blue-Background-Wallpaper-HD-Resolution.jpg"))); // NOI18N
        pane.add(lpic);
        lpic.setBounds(0, 0, 2920, 730);

        getContentPane().add(pane);
        pane.setBounds(0, 0, 2950, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
    if(flag1==0)
    {flag1=1;
    panel1.setVisible(false);
    hide.setText(">");
    }
    else
    {flag1=0;
     panel1.setVisible(true);
     hide.setText("<");
    }
        
    }//GEN-LAST:event_hideMouseClicked

    private void llogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llogoutMouseClicked
        this.dispose();
        LoginScreen l=new LoginScreen();
        l.setVisible(true);
    }//GEN-LAST:event_llogoutMouseClicked

    private void lresetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lresetpassMouseClicked
        ResetPassword a=new ResetPassword();
        panel2.add(a);              // TODO add your handling code here:
    }//GEN-LAST:event_lresetpassMouseClicked

    private void lsupprMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsupprMouseClicked
        SupplierReport m=new SupplierReport();        // TODO add your handling code here:
    }//GEN-LAST:event_lsupprMouseClicked

    private void lreportseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lreportseMouseClicked
        //SellingReport m=new SellingReport();
        
 SellingReport1 s=new SellingReport1();
        panel2.add(s);    // TODO add your handling code here:
    }//GEN-LAST:event_lreportseMouseClicked

    private void lsupeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsupeditMouseClicked
        EditSupplier a=new EditSupplier();
        panel2.add(a);              // TODO add your handling code here:
    }//GEN-LAST:event_lsupeditMouseClicked

    private void lsupaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsupaddMouseClicked
        AddSupplier a=new AddSupplier();
        panel2.add(a);        // TODO add your handling code here:
    }//GEN-LAST:event_lsupaddMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(flag==0)
        { flag=1;

            lsupadd.setVisible(false);
            lsupedit.setVisible(false);
            lsuppr.setVisible(false);
            lreportse.setVisible(false);
            lresetpass.setVisible(true);
            llogout.setVisible(true);
        }
        else
        {flag=0;

            lsupadd.setVisible(false);
            lsupedit.setVisible(false);
            lreportse.setVisible(false);
            lresetpass.setVisible(false);
            llogout.setVisible(false);
            lsuppr.setVisible(false);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Bill n=new Bill();
        panel2.add(n);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void lrepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lrepMouseClicked
        if(flag==0)
        { flag=1;
            lsupadd.setVisible(false);
            lsupedit.setVisible(false);
            lresetpass.setVisible(false);
            llogout.setVisible(false);

            lsuppr.setVisible(true);

            lreportse.setVisible(true);
        }
        else
        {flag=0;
            lsupadd.setVisible(false);
            lsupedit.setVisible(false);

            lreportse.setVisible(false);
            lresetpass.setVisible(false);
            llogout.setVisible(false);
            lsuppr.setVisible(false);
        }
    }//GEN-LAST:event_lrepMouseClicked

    private void lsupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsupMouseClicked
        if(flag==0)
        { flag=1;
            lsupadd.setVisible(false);
            lsupedit.setVisible(false);
            lsuppr.setVisible(false);

            lreportse.setVisible(false);
            lresetpass.setVisible(false);
            llogout.setVisible(false);

            lsupadd.setVisible(true);
            lsupedit.setVisible(true);

        }
        else
        {flag=0;
            lsupadd.setVisible(false);
            lsupedit.setVisible(false);
            lreportse.setVisible(false);
            lresetpass.setVisible(false);
            llogout.setVisible(false);
            lsuppr.setVisible(false);
        }
    }//GEN-LAST:event_lsupMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Module().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel llogout;
    private javax.swing.JLabel lpic;
    private javax.swing.JLabel lrep;
    private javax.swing.JLabel lreportse;
    private javax.swing.JLabel lresetpass;
    private javax.swing.JLabel lsup;
    private javax.swing.JLabel lsupadd;
    private javax.swing.JLabel lsupedit;
    private javax.swing.JLabel lsuppr;
    private javax.swing.JDesktopPane pane;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
