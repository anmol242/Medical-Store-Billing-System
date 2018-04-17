
package medicalstore;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextArea;

public class Bill extends javax.swing.JInternalFrame {
Connection con;
ResultSet rs;
PreparedStatement ps;
Statement s;
 boolean b=true;
JLabel c1,c2,c3,c4;
String medname,billid,sep="-",medicine="",price="",qty="";
int y,total,grandtotal=0,quantity;

    public Bill() {
         setVisible(true);
         initComponents();
         SimpleDateFormat m=new SimpleDateFormat("yyyy-MM-dd");
         ldate.setText(m.format(new Date()));
         ldate.setEditable(false);
         receipt.setEditable(false);
         
       
        
        
           try
     {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/MedicalStore","aa","123");
     }
     catch(Exception e)
     {
       System.out.println("error in getting item"+e);
     }
              try
           {
           
            ps=con.prepareStatement("select * from bill");
            rs=ps.executeQuery();
            while(rs.next())
            {
            
            billid="med"+sep+ ldate.getText()+sep+String.valueOf(rs.getRow()+1);
            }
            
            txtbillid.setText(billid);
            txtbillid.setEditable(false);
             
            }
           catch(Exception e)
           {
       JOptionPane.showMessageDialog(null,"Eror in Id Genertor"+e);
           }  
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txthos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdoc = new javax.swing.JTextField();
        btadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtgtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtbillid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcusname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcusno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtmedname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ldate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtmedprice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 102, 255));

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hospital/Clinic :");

        btadd.setBackground(new java.awt.Color(255, 255, 255));
        btadd.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btadd.setText("Add");
        btadd.setBorder(null);
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grand Total :");

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bill Id :");

        txtbillid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbillidFocusGained(evt);
            }
        });
        txtbillid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbillidActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer Name :");

        txtcusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcusnameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact No :");

        txtcusno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcusnoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Medicine Name :");

        txtmedname.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtmednameMouseMoved(evt);
            }
        });
        txtmedname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmednameFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantitiy :");

        txtqty.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtqtyComponentHidden(evt);
            }
        });
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Recommended By :");

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date :");

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jButton3.setText("Save and Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Price:");

        txtmedprice.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtmedpriceMouseMoved(evt);
            }
        });
        txtmedprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmedpriceFocusLost(evt);
            }
        });

        receipt.setColumns(20);
        receipt.setRows(5);
        jScrollPane2.setViewportView(receipt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcusno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcusname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbillid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmedname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmedprice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(32, 32, 32)
                                        .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txthos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel7))
                                        .addGap(32, 32, 32)
                                        .addComponent(txtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtgtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(282, 282, 282))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcusname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(txtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcusno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(txthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmedname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmedprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtgtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed

        if(txtcusname.getText().equals("") && txtdoc.getText().equals("")&& txthos.getText().equals("")&& txtcusno.getText().equals("")&& txtmedname.getText().equals("")&& txtmedprice.getText().equals("")&& txtqty.getText().equals(""))

        {
            JOptionPane.showMessageDialog(null,"No Field Should Be Empty");
                
        }
        else if(txtmedname.getText().equals("") || txtmedprice.getText().equals("") ||txtqty.getText().equals(""))
        {
            if(txtmedname.getText().equals("") && txtmedprice.getText().equals("") && txtqty.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter Medicine Name, Price And Quantity");
            }
            else if(txtmedname.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter Medicine Name");
             
            }
            else if(txtmedprice.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter Medicine Price");
             
            }
            else if(txtqty.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter Medicine Quantity");
             
            }
        }
        else
        {
            
            
         try{   
            
                 total=Integer.parseInt(txtmedprice.getText())* (Integer.parseInt(txtqty.getText()));
                 price=price.concat(txtmedprice.getText()).concat(",");
                 medicine=medicine.concat(txtmedname.getText()).concat(",");
                 qty=qty.concat(txtqty.getText()).concat(",");
         
                if(b)
                {
                    receipt.append("\t  SHARMA MEDICAL STORE\n\n"
                        +"\n--------------------------------------------------------------------------------------\n"
                            +"Customer Name: "+txtcusname.getText()+"\t\t   "+"Date"+ldate.getText()
                        +"\n--------------------------------------------------------------------------------------\n"
                       +"Medicine Name"+"\t"+"Quantity"+"\t"+"Price"+"\t"+"Total");
                    
                    receipt.append("\n"
                        +txtmedname.getText()+"\t\t"+txtqty.getText()+"\t"+txtmedprice.getText()+"\t"+total);
                
                    
                    b=false;
                 }
                else
                {
                
                receipt.append("\n"
                        +txtmedname.getText()+"\t\t"+txtqty.getText()+"\t"+txtmedprice.getText()+"\t"+total
                
               );
             }
                grandtotal=grandtotal+total;
                txtgtotal.setText(String.valueOf(grandtotal));
                txtgtotal.setEditable(false);
                
                
       
        
        txtmedname.setText("");
        txtmedprice.setText("");
        txtqty.setText("");
        }
        
        catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null,"Invalid Price or Quantity");
              
         }
         
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void txtcusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcusnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcusnameActionPerformed

    private void txtcusnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcusnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcusnoActionPerformed

    private void txtmednameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmednameMouseMoved

    }//GEN-LAST:event_txtmednameMouseMoved

    private void txtmednameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmednameFocusLost
        /**/        // TODO add your handling code here:
    }//GEN-LAST:event_txtmednameFocusLost

    private void txtqtyComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtqtyComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyComponentHidden

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void txtbillidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbillidFocusGained
    }//GEN-LAST:event_txtbillidFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(receipt.getText().equals("") || receipt.getText()==null )
        {
           JOptionPane.showMessageDialog(null,"Enter Bill Information","Message",1); 
        }
        else
        {
           String contactno=txtcusno.getText();
        Pattern pattern=Pattern.compile("\\d{10}");
        Matcher matcher=pattern.matcher(contactno);
        if(matcher.matches()==false)
        {
             JOptionPane.showMessageDialog(null,"Invalid Contact Number","Message",1); 
        }
         else
        {
            
            
            
        b=true;        
        receipt.append("\n\n\t\t\t   Grand Total:"+txtgtotal.getText());
        
        try
    {
        ps=con.prepareStatement("insert into bill values(?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,txtbillid.getText());
        ps.setString(2,ldate.getText());
        ps.setString(3,txtcusname.getText());
        ps.setString(4,txtcusno.getText());
        ps.setString(5,txtdoc.getText());
        ps.setString(6,txthos.getText());
        ps.setString(7,medicine);
        ps.setString(8,price);
        ps.setString(9,qty);
        ps.setString(10,txtgtotal.getText());
        ps.executeUpdate();
        
    }
    catch(Exception e)
    {    
    
        JOptionPane.showMessageDialog(null,"No Field Should Be Empty");
    }
        
        try
        {
            receipt.print();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Printer Not Found");
        }
        
           try
           {
           
            ps=con.prepareStatement("select * from bill");
            rs=ps.executeQuery();
            while(rs.next())
            {
            
            billid="med"+sep+ ldate.getText()+sep+String.valueOf(rs.getRow()+1);
            }
            
            txtbillid.setText(billid);
            txtbillid.setEditable(false);
             
            }
           catch(Exception e)
           {
       JOptionPane.showMessageDialog(null,"Eror in Id Genertor"+e);
           }
        
        txtmedname.setText("");
        txtmedprice.setText("");
        txtqty.setText("");
        txtcusname.setText("");
        txtcusno.setText("");
        txtdoc.setText("");
        txthos.setText("");
        txtgtotal.setText("");
        receipt.setText("");
        }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbillidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbillidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbillidActionPerformed

    private void txtmedpriceMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmedpriceMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedpriceMouseMoved

    private void txtmedpriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmedpriceFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedpriceFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ldate;
    private javax.swing.JTextArea receipt;
    private javax.swing.JTextField txtbillid;
    private javax.swing.JTextField txtcusname;
    private javax.swing.JTextField txtcusno;
    private javax.swing.JTextField txtdoc;
    private javax.swing.JTextField txtgtotal;
    private javax.swing.JTextField txthos;
    private javax.swing.JTextField txtmedname;
    private javax.swing.JTextField txtmedprice;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}
