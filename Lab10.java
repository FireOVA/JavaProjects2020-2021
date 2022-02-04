import java.sql.*;

public class Lab10 {
  public static void main (String args[]) {
	  Connection theConn = null;
	  
	    try {
	    	
	    	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	        theConn = DriverManager.getConnection("jdbc:ucanaccess://StudentReg.accdb");
	
		    Statement stmt;
		    String sql;
		    ResultSet rs;
	
		 
		    String s1 = "111111";
		    sql = "insert into Student (StuID, FirstName, LastName, PhoneNum, City, State, Email) values('" + s1 +"'," + "'Cathy', 'Smith', '719-234-2345', 'ColoradoSpring', 'CO', 'csmith@csupueblo.edu')";
		           
			stmt = theConn.createStatement();
			stmt.executeUpdate(sql);
		
			      
			stmt.close();
			    
			System.out.println("The record was inserted successfully");
			
			sql = "insert into Student (StuID, FirstName, LastName, PhoneNum, City, State, Email) values('222222', 'Cora', 'Bueno', '719-345-4567', 'Denver', 'CO', 'cbueno@csupueblo.edu')";
			
			stmt = theConn.createStatement();
			stmt.executeUpdate(sql);
		
			      
			stmt.close();
			    
			System.out.println("The record was inserted successfully");
			
			sql = "insert into Student (StuID, FirstName, LastName, PhoneNum, City, State, Email) values('333333', 'Jennifer', 'Loveless', '719-333-5555', 'Pueblo', 'CO', 'hihello@gmail.com')";
		   
			stmt = theConn.createStatement();
			stmt.executeUpdate(sql);
				
					      
			stmt.close();
					    
			System.out.println("The record was inserted successfully");   
			
			sql = "insert into Student (StuID, FirstName, LastName, PhoneNum, City, State, Email) values('444444', 'Kitty', 'Williams', '719-112-8888', 'Pueblo', 'CO', 'letmein@gmail.com')";
		    
			stmt = theConn.createStatement();
			stmt.executeUpdate(sql);
		
			      
			stmt.close();
			    
			System.out.println("The record was inserted successfully");
			
			 sql = "update Student set FirstName = 'Greg', LastName = 'Jones' where StuID = '111111' "; 
	         
		      stmt = theConn.createStatement();
		      int n = stmt.executeUpdate(sql); 
		      
		      System.out.println("The number of rows changed: " + n);
		      stmt.close();
		     
		      sql = "Delete from Student where StuID = '222222' "; 
		         
		      stmt = theConn.createStatement();
		      stmt.executeUpdate(sql);
		      
		      stmt.close();
		      System.out.println("The record was DELETED successfully");
		      
		      sql = "select StuID, FirstName, LastName, PhoneNum, City, State, Email from Student"; 
		       
		      
		      stmt = theConn.createStatement();
		      rs = stmt.executeQuery(sql);

		      ResultSetMetaData rsMetaData = rs.getMetaData();
		      int index = rsMetaData.getColumnCount();
			
		      while(rs.next()) {		    
			      for( int i=1; i<=index; i++) {
					
					 System.out.print(rs.getString(i) + "  ");
			      }
			      System.out.println();
		      }
		      rs.close();
		      stmt.close();
	    } catch (Exception e) {
			e.printStackTrace();
	    }
   
	    finally {
		      try {
				if (theConn != null) theConn.close();
		      }
		      catch (Exception e) {
		      }
	    }
    } 
}


