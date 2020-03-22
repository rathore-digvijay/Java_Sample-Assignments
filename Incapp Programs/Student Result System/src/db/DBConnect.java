package db;

import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnect {
    public static String a,b,d,s1;
    public static int t,r,f,g,h,i,j;
    public static double p;
    public static Connection c;
    public static Statement st;
	public static PreparedStatement insertresult,searchresult,updateresult,deleteresult,searchadmin,updateadmin,searchAdmin;
    static
    {
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
		 c=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","student result system","55201060");
                st=c.createStatement();
insertresult=c.prepareStatement("insert into result (ROLL_NO,NAME,FATHER_NAME,MATHS,ENGLISH,COMPUTER,SCIENCE,SST) values(?,?,?,?,?,?,?,?)");
searchresult=c.prepareStatement("select * from result where roll_no=?");
updateresult=c.prepareStatement("update result set NAME=?,FATHER_NAME=?,MATHS=?,ENGLISH=?,COMPUTER=?,SCIENCE=?,SST=? where roll_no=?");
deleteresult=c.prepareStatement("delete from result where roll_no=?");
searchadmin=c.prepareStatement("select * from admin");
searchAdmin=c.prepareStatement("select * from admin where aid=? AND password=?");
updateadmin=c.prepareStatement("update admin set password=? where aid=?");
                               
        }
        catch(Exception ev)
                {
                    JOptionPane.showMessageDialog(null,ev);
                }
    }
    
}
