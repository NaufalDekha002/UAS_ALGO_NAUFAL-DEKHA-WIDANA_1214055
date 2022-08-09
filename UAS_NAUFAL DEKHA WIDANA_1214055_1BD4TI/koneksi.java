/**
 * Write a description of class koneksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koneksi  
{
    private static Connection mysqlconfig;
    
    public static Connection koneksi() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/greenfoot";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new.com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
        System.err.println("Koneksi Gagal!!" +e.getMessage());
        }
        return mysqlconfig;
    }
}
