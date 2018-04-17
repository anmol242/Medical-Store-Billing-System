
package medicalstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class AddSupplier extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement ps;
    public AddSupplier() {
        setVisible(true);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        btsave = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 255));
        setBorder(null);
        setTitle("Supplier Information");

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier Name :");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address :");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact no :");

        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });

        btsave.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btsave.setText("Save");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btcancel))
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtadd)
                    .addComponent(txtno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancel)
                    .addComponent(btsave))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
    if(txtname.getText().equals("") || txtadd.getText().equals("")|| txtno.getText().equals(""))
   {
       if(txtname.getText().equals("") && txtadd.getText().equals("")  && txtno.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null,"No Field Should Be Empty","Message",1); 
      
      }
      else if(txtname.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null,"Enter Supplier Name","Message",1); 
     }
       else if(txtadd.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null,"Enter Supplier Address","Message",1); 
     }
       else if(txtno.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null,"Enter Contact No","Message",1); 
     }
       
   }
    else
    { 
        String contactno=txtno.getText();
        Pattern pattern=Pattern.compile("\\d{10}");
        Matcher matcher=pattern.matcher(contactno);
        if(matcher.matches()==false)
        {
             JOptionPane.showMessageDialog(null,"Invalid Contact Number","Message",1); 
        }
        else
        {
        try
    {
        ps=con.prepareStatement("insert into supplier values(?,?,?)");
        ps.setString(1,txtname.getText());
        ps.setString(2,txtadd.getText());
        ps.setString(3,txtno.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Supplier Added");
               
    }
    catch(Exception e)
    {   
       
     System.out.println("error in data saving"+e);
    }
        txtname.setText("");
        txtadd.setText("");
        txtno.setText("");
        
                                      
    }
      
     
    }
    }//GEN-LAST:event_btsaveActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
     this.dispose();
    }//GEN-LAST:event_btcancelActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    // End of variables declaration//GEN-END:variables
}
