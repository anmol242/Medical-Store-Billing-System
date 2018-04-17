
package medicalstore;
import java.sql.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class LoginScreen extends javax.swing.JFrame {
        ResultSet rs;
        PreparedStatement ps;
        String right="",pass="";
        Connection con;
        public static String  client;
        public static String rights;
        public LoginScreen() {
       initComponents();
       try
        {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/MedicalStore","aa","123");
        
    }
catch(Exception e)
{
    System.out.println("error in connection establishment");
}
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btlogin = new javax.swing.JButton();
        btreset = new javax.swing.JButton();
        lmessage = new javax.swing.JLabel();
        jbemploy = new javax.swing.JRadioButton();
        jbadmin = new javax.swing.JRadioButton();
        lpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(997, 486));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 120, 160, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("PASSWORD :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 150, 120, 20);

        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(520, 120, 140, 20);

        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassFocusLost(evt);
            }
        });
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtpass);
        txtpass.setBounds(520, 150, 140, 20);

        btlogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btlogin.setText("LOGIN");
        btlogin.setBorder(null);
        btlogin.setSelected(true);
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        getContentPane().add(btlogin);
        btlogin.setBounds(460, 230, 73, 20);

        btreset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btreset.setText("CANCEL");
        btreset.setBorder(null);
        btreset.setSelected(true);
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });
        getContentPane().add(btreset);
        btreset.setBounds(540, 230, 80, 20);

        lmessage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(lmessage);
        lmessage.setBounds(420, 70, 230, 40);

        buttonGroup1.add(jbemploy);
        jbemploy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbemploy.setText("EMPLOY");
        jbemploy.setOpaque(false);
        jbemploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbemployActionPerformed(evt);
            }
        });
        getContentPane().add(jbemploy);
        jbemploy.setBounds(520, 200, 100, 23);

        buttonGroup1.add(jbadmin);
        jbadmin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbadmin.setText("ADMIN");
        jbadmin.setOpaque(false);
        jbadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbadminActionPerformed(evt);
            }
        });
        getContentPane().add(jbadmin);
        jbadmin.setBounds(520, 170, 100, 23);

        lpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalstore/images/aball.jpg"))); // NOI18N
        getContentPane().add(lpic);
        lpic.setBounds(0, 0, 1000, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed

   if(txtname.getText().equals("") || txtpass.getText().equals(""))
   {
       
       if(txtname.getText().equals("") && txtpass.getText().equals(""))
       {
        JOptionPane.showMessageDialog(null,"Enter Username and Password","Message",1);    
       }
       
       else if(txtname.getText().equals(""))
       {
    lmessage.setText("User name field cannot be empty");
    lmessage.setForeground(Color.red);
       }
   
   else if(txtpass.getText().equals(""))
    {
        lmessage.setText("Password field cannot be empty");
        lmessage.setForeground(Color.red);
    }
   else if(txtname.getText().equals(""))
   {
   JOptionPane.showMessageDialog(null,"Enter Username ","Message",1); 
       
   }
    else if(txtpass.getText().equals(""))
   {
   JOptionPane.showMessageDialog(null,"Enter Password ","Message",1); 
       
   }
   
    else
    {
        lmessage.setText("");
    }    
        
   }    
        
   else{   
        
        
        try
     {ps=con.prepareStatement("select * from login where user_name='"+txtname.getText()+"'");
         rs=ps.executeQuery();
         while(rs.next())
         {  
            pass=rs.getString(2);
            right=rs.getString(3);
            rights=rs.getString(3);
         }
     }
     catch(Exception e)
     {
         System.out.println("data retrieving error"+e);
     }
     if(jbadmin.isSelected() && right.equals("admin") && txtpass.getText().equals(pass))
     {
     client=txtname.getText();
     new Main_Module();
     this.dispose();
    }
     else if(jbemploy.isSelected() &&right.equals("guest") && txtpass.getText().equals(pass)){
     client=txtname.getText();
     Main_Module m=new Main_Module();
     this.dispose();
    }
     else
     { JOptionPane.showMessageDialog(null,"Invalid Username or Password","Message",1);             
     }
   }
    }//GEN-LAST:event_btloginActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
    
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
   if(txtname.getText().equals(""))
   {
    lmessage.setText("User name field cannot be empty");
    lmessage.setForeground(Color.red);
   }
   else
    lmessage.setText("");
    }//GEN-LAST:event_txtnameFocusLost

    private void jbemployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbemployActionPerformed
   
    }//GEN-LAST:event_jbemployActionPerformed

    private void jbadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbadminActionPerformed
    
    }//GEN-LAST:event_jbadminActionPerformed

    private void txtpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusLost
    if(txtpass.getText().equals(""))
    {
        lmessage.setText("Password field cannot be empty");
        lmessage.setForeground(Color.red);
    }
    else
           lmessage.setText("");
    }//GEN-LAST:event_txtpassFocusLost

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
    this.dispose();
    
    }//GEN-LAST:event_btresetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlogin;
    private javax.swing.JButton btreset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jbadmin;
    private javax.swing.JRadioButton jbemploy;
    private javax.swing.JLabel lmessage;
    private javax.swing.JLabel lpic;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
