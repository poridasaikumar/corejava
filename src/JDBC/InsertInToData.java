package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 

public class InsertInToData 
{
	public static void main(String[] args) throws SQLException 
	{      
		 Scanner type = new Scanner(System.in);
		 System.out.println("Enter The FIRSTNAME:");
		 String FIRSTNAME = type.next();
		 System.out.println("Enter The LASTNAME:");
		 String LASTNAME = type.next();
		 System.out.println("Enter The MOBILENUMBER:");
		 Long MOBILENUMBER = type.nextLong();
		 System.out.println("Enter The EMAILID:");
		 String EMAILID = type.next();
		 System.out.println("Enter The GENDER:");
		 int GENDER = type.nextInt();
		  	
	        Connection connection = null;
	        PreparedStatement statement = null;
	        ResultSet resultset = null;
	        
	        String url="jdbc:mysql:// 192.168.0.132/CODEBEGUN_TEST_DB";
	        String UserName = "root";
	        String Password = "root";
	        String query="select * from student";
	        String insertQuery = "insert into student"
	        		+ "(FIRSTNAME,LASTNAME,MOBILENUMBER,EMAILID,GENDER)"+"values (?,?,?,?,?)";
	        
	        try 
	        {
	        	//Class.forName(" com.mysql.jdbc.Driver");
	        
	            connection = DriverManager.getConnection(url,UserName,Password);
	            statement = connection.prepareStatement(insertQuery);
	            statement.setString(1,FIRSTNAME);
	            statement.setString(2,LASTNAME);
	            statement.setLong(3,MOBILENUMBER);
	            statement.setString(4,EMAILID);
	            statement.setInt(5,GENDER);
	          
	            
	            int noOfRows = statement.executeUpdate();
	            System.out.println(noOfRows);
	           
	            
	           // resultset = prepareStatement.executeQuery(query);
	        
//	           while (resultset.next())
//	           {
//	        	     System.out.println(resultset.getString("PersonID"));
//	        	     System.out.println(resultset.getString("FName"));
//	           }
	        }
	        
	        catch (Exception e)
	        {
	        	e.printStackTrace();
	        }
	        
	        finally
	        {
	        
	        	statement.close();
	        	connection.close();
	        	//resultset.close();
	        }   
	}
	
	
}
