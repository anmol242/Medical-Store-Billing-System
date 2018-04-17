
package medicalstore;
import java.sql.*;
import javax.swing.JOptionPane;

public class EditSupplier extends javax.swing.JInternalFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public EditSupplier() {
        setVisible(true);
        initComponents();
                 try
     {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/MedicalStore","aa","123");
         ps=con.prepareStatement("select * from supplier");
         rs=ps.executeQuery();
         while(rs.next())
         {
            comname.addItem(rs.getString(1));
             
         }
     }
     catch(Exception e)
     {
       System.out.println("error in connection establishment"+e);
     }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        btupdate = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        comname = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier Name :");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address :");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact no :");

        btupdate.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btupdate.setText("Update");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        comname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Name" }));
        comname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comnameItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btcancel))
                    .addComponent(txtno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comname, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtadd, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btupdate)
                    .addComponent(btcancel))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        if(txtadd.getText().equals("") || txtno.getText().equals(""))
      {
          if(txtadd.getText().equals("") && txtno.getText().equals(""))
          {
             JOptionPane.showMessageDialog(null,"Select Supplier Name","Message",1); 
          }
          else if(txtadd.getText().equals(""))
          {
              JOptionPane.showMessageDialog(null,"Enter Address","Message",1); 
      
          }
          else if(txtno.getText().equals(""))
          {
              JOptionPane.showMessageDialog(null,"Enter Contact Number","Message",1); 
      
          }
          
        }
        
        else
        {
        
        
        
        try
        {
            ps=con.prepareStatement("update supplier set supplier_address=?,contact_no=? where Supplier_name='"+comname.getSelectedItem().toString()+"'");
            ps.setString(1,txtadd.getText());
            ps.setString(2,txtno.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"updated");
        }
        catch(Exception e)
        {
            System.out.println("error in data updation"+e);
            JOptionPane.showMessageDialog(null,"error in updation");
        }
        txtadd.setText("");
        txtno.setText("");
        }
    }//GEN-LAST:event_btupdateActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btcancelActionPerformed

    private void comnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comnameItemStateChanged
    try
    {
        ps=con.prepareStatement("select * from supplier where supplier_name='"+comname.getSelectedItem().toString()+"'");
         rs=ps.executeQuery();
         while(rs.next())
         {
            txtadd.setText(rs.getString(2));
            txtno.setText(rs.getString(3));
             
         }
    }//GEN-LAST:event_comnameItemStateChanged
      catch(Exception e)
      {
          System.out.println("error in data retrieving"+e); 
      }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btupdate;
    private javax.swing.JComboBox comname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtno;
    // End of variables declaration//GEN-END:variables
}
