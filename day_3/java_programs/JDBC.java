import java.sql.*;
import java.sql.DriverManager;

public class JDBC {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/world";
            String user = "root";
            String pass = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);

            Statement stat = conn.createStatement();
            String query = "SELECT * FROM country";
            ResultSet res = stat.executeQuery(query);

            while(res.next()){
                System.out.println(res.getString(1) + " --- " + res.getString(2)+ " -- " + res.getString(3));
            }
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