import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class XLSV {
    private Connection connection;

    // thay doi url, user, password cho phu hop voi csdl cua ban
    private String url = "jdbc:mysql://localhost:3306/QLSV";
    private String user ="root";
    private String password = "khaingo718";
    public void getCon(){
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Ket noi thanh cong");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // lay danh sach sinh vien theo lop
    public List<Sinhvien> getSVbyClass(Sinhvien sv){
        List<Sinhvien> listSV = new ArrayList<>();
        try {
            getCon();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM tbsv WHERE Class LIKE '"+sv.getClas()+"'";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                Sinhvien sv1 = new Sinhvien();
                sv1.setFirstName(rs.getString(1));
                sv1.setLastName(rs.getString(2));
                sv1.setBirthDay(rs.getDate(3));
                sv1.setAddress(rs.getString(4));
                sv1.setClass(rs.getString(5));
                sv1.setOOP(rs.getString(6).charAt(0));
                sv1.setPM(rs.getString(7).charAt(0));
                sv1.setML(rs.getString(8).charAt(0));
                sv1.setDB(rs.getString(9).charAt(0));
                sv1.setMobile(rs.getString(10).charAt(0));
                listSV.add(sv1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listSV;
    }
}
