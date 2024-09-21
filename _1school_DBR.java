package SRC;
import java.sql.*;
class GFG
{
    public static void main(String[] args) 
    {
      Connection con = null;
      try
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student" ,"root","12345");
           
           Statement st;
           st = con.createStatement();
           ResultSet  resultSet;
           resultSet = st.executeQuery("select*from student");
           int s_no;
           String s_name;
           String s_address;
           while(resultSet.next())
           {
              s_no = resultSet.getInt("s_no");
              s_name = resultSet.getString("s_name");
              s_address = resultSet.getString("s_address");
              System.out.println("sno: "+s_no + "sname :" +s_name +"addrees :" +s_address);

           }
           resultSet.close();
           st.close();
           con.close();
        }
        catch(Exception exception)
        {
              System.out.println(exception);
        }


      }
    }

