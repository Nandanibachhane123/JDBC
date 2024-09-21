package SRC;

   import java.sql.*;
   import java.sql.Connection;
   import java.sql.DriverManager;
   
    class InsertData 
    {
   
    public static void main(String[] args) 
    {
        
        String url = "jdbc:MySQL://localhost:3306/student";         //db is the name of the database
        String user ="root";                                                  
        String password = "12345";
   
        try {
   
            //1. Create a connection
            Connection myConn = DriverManager.getConnection(url,user,password);
            
            //2. Create a statement
            Statement myStmt = myConn.createStatement();
            
            //3. Execute Query
            String sql = "insert into student "
                    +"(s_no,s_name,s_fees,s_address,s_percentage)"
                    + " values (1,'ritu',230000,'mahesvar',85)";
            myStmt.executeUpdate(sql);
            System.out.println("Insert complete.");
   
               //4. Close connection
            myConn.close();
        }
   
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   } 