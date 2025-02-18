import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// tạo class XLSV kết nối csdl và lấy dữ liệu
public class XLSV {
    private Connection connection;

    // thay doi url, user, password cho phu hop voi csdl cua ban
    private String url = "jdbc:mysql://localhost:3306/QLSV";
    private String user = "root";
    private String password = "khaingo718";

    public void getCon() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thanh cong");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // lay danh sach sinh vien theo lop
    public List<Sinhvien> getSVbyClass(Sinhvien sv) {
        List<Sinhvien> listSV = new ArrayList<>();
        try {
            getCon();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM tbsv WHERE Class LIKE '" + sv.getClas() + "'";
            ResultSet rs = statement.executeQuery(sql);
            //duyet ket qua va them vao list
            while (rs.next()) {
                Sinhvien sv1 = new Sinhvien();
                sv1.setFirstName(rs.getString(1));
                sv1.setLastName(rs.getString(2));
                sv1.setBirthDay(rs.getDate(3));
                sv1.setAddress(rs.getString(4));
                sv1.setClass(rs.getString(5));
                sv1.setOOP((char) rs.getFloat(6));
                sv1.setPM(rs.getFloat(7));
                sv1.setML(rs.getFloat(8));
                sv1.setDB(rs.getFloat(9));
                sv1.setMobile(rs.getFloat(10));
                listSV.add(sv1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listSV;
    }
}
