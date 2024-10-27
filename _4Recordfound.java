package SRC;
import java.sql.*;
import java.util.Scanner;
class gfg2
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
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter your name");
            String name= sc.nextLine();
           while(resultSet.next())
           {
              if(resultSet.getString("s_name").equals(name))
              {
              s_no = resultSet.getInt("s_no");
              s_name = resultSet.getString("s_name");
              s_address = resultSet.getString("s_address");
              System.out.println("sno: "+ "sname :" +s_name +"addrees :" +s_address);

           }
           else {
            System.out.println("Not found");
           }
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

