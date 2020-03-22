package db;

import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnect {
    public static Connection c;
    public static Statement st;
	public static PreparedStatement insertEmp,searchEmp,updateEmp,deleteEmp;
    static
    {
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
		 c=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","hamaradb","55201060");
                st=c.createStatement();
				insertEmp=c.prepareStatement("insert into emp_info (name,salary,age,cname) values(?,?,?,?)");
                                searchEmp=c.prepareStatement("select * from emp_info where eid=?");
                                updateEmp=c.prepareStatement("update emp_info set name=?,salary=?,age=?,cname=? where eid=?");
                                deleteEmp=c.prepareStatement("delete from emp_info where eid=?");
        }
        catch(Exception ev)
                {
                    JOptionPane.showMessageDialog(null,ev);
                }
    }
    
}
