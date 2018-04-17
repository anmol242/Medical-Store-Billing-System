

package medicalstore;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;



public class SellingReport extends JFrame
{      	JTable tb;
	JPanel p;
	JScrollPane sc;
	Connection con;
	Statement st;
	ResultSetMetaData rm;
	ResultSet rs;
	String column[];
	DefaultTableModel dm;
	int col,count;
    SellingReport()
{
 		super("Table");
		p=new JPanel();
                getContentPane().add(p);
		p.setLayout(new BorderLayout());
		p.setBackground(Color.blue);
		dm=new DefaultTableModel();
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(800,500);
		setVisible(true);
		try
		{
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		con=DriverManager.getConnection("jdbc:derby://localhost:1527/MedicalStore","aa","123");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select * from bill");
		rm=rs.getMetaData();
		col=rm.getColumnCount();
		column=new String[col];
		for(count=0;count<column.length;count++)
		{
		column[count]=rm.getColumnName(count+1);
		dm.addColumn(column[count]);	
		}
		while(rs.next())
		{
			
		dm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
		}
		tb=new JTable();
		tb.setModel(dm);
		sc=new JScrollPane(tb);
		p.add(sc,"Center");
		rs.close();
		}
		catch(Exception e)
		{
		System.out.println("Error in connectivity"+e);
		}
	}

}    

    

