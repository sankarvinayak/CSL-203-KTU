import java.sql.*;


public class DBOperations{
   public static void main(String[] args) {
       try (
              Connection conn = DriverManager.getConnection(
                       "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","sankar", "sankar");


               Statement stmt = conn.createStatement()
       ) {


           String strSelect = "select title,author, price from books";
           System.out.println("The SQL statement is: " + strSelect + "\n");


           ResultSet rset = stmt.executeQuery(strSelect);


           System.out.println("The records selected are:");
           int rowCount = 0;
           while(rset.next()) {
               String title = rset.getString("title");
               String Author=rset.getString("author");
               double price = rset.getDouble("price");
               System.out.println(title + " by " +Author+" which costs "+price+"rupees" );
               ++rowCount;
           }
           System.out.println("\nTotal number of records = " + rowCount);


       } catch(SQLException ex) {
           ex.printStackTrace();
       }
   }
}