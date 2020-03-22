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
		st.executeUpdate("insert into emp_info (name,salary,age,cname) values('Ramu',12000,32,'HCL')");
		c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}