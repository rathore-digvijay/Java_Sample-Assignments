import java.sql.*;
class jdbcdemo
{
	public static void main(String ar[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","hamaradb","55201060");
		Statement st=c.createStatement();
		ResultSet r=st.executeQuery("select * from emp_info");
		while(r.next())
		{
			int e=r.getInt("eid");  //int e=r.getInt(1);
			String n=r.getString(2);
			int s=r.getInt(3);
	        int ag=r.getInt(4);
		    String cn=r.getString(5);
			System.out.println(e+" "+n+" "+s+" "+ag+" "+cn);
		}
		
		c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}