import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
    
    public static void showData(Connection conn) throws SQLException{
        Statement stat = conn.createStatement();
        String query = "SELECT * FROM Students";
        ResultSet res = stat.executeQuery(query);

        while(res.next()){
            System.out.println(res.getInt(1) + " --- " + res.getString(2)+ " -- " + res.getString(3));
            //System.out.println(res.getInt(1));
        }
    }
    
    public static void updateData(Connection conn,int id,String result) throws SQLException{
        PreparedStatement ps = null;
        ps = conn.prepareStatement("UPDATE Students SET result=? where id=?");
        ps.setString(1,result);
        ps.setInt(2, id);

        int updateRes = ps.executeUpdate();
        System.out.println(updateRes>0?"Update Successfully":"No record updated.");
    }
    
    public static void insertData(Connection conn,String name, String result)throws SQLException{
        PreparedStatement ps = null;
        ps = conn.prepareStatement("INSERT Students(name,result) VALUES(?,?)");
        ps.setString(1, name);
        ps.setString(2, result);
        
        int insertRes = ps.executeUpdate();
        System.out.println(insertRes>0?"Insertion Successfully":"No record inserted.");
    }
    
    public static void deleteData(Connection conn,int id)throws SQLException{
        PreparedStatement ps = null;
        ps = conn.prepareStatement("DELETE FROM Students WHERE id=?");
        ps.setInt(1,id);
        int deleteRes = ps.executeUpdate();
        System.out.println(deleteRes>0?"Deletion Successfully":"No record deleted.");
    }

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String pass = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            showData(conn);
            
            //updateData(conn,1,"Pass");
            
            //insertData(conn,"Akshay Telang","Pass");
            
            deleteData(conn,7);
            
            showData(conn);
            
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*

create table Students ( 
	id int(5) auto_increment primary key, 
	name char(30), 
	result char(5)
);

SELECT * FROM Students;

insert into Students(name,result) values("Shubham W.","Pass");

update Students set result="Pass" where id=2;

delete from Students where id=23;

*/

