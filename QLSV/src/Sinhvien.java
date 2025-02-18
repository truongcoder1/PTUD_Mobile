import java.util.Date;

//tạo class Sinhvien
public class Sinhvien {
    private String FirstName;
    private String LastName;
    private Date BirthDay;
    private String Address;
    private String Clas;
    private char OOP;
    private char PM;
    private char ML;
    private char DB;
    private char Mobile;

    public char getMobile() {
        return Mobile;
    }

    public void setMobile(char mobile) {
        Mobile = mobile;
    }

    public char getDB() {
        return DB;
    }

    public void setDB(char DB) {
        this.DB = DB;
    }

    public char getML() {
        return ML;
    }

    public void setML(char ML) {
        this.ML = ML;
    }

    public char getPM() {
        return PM;
    }

    public void setPM(char PM) {
        this.PM = PM;
    }

    public char getOOP() {
        return OOP;
    }

    public void setOOP(char OOP) {
        this.OOP = OOP;
    }

    public String getClas() {
        return Clas;
    }

    public void setClass(String aClas) {
        Clas = aClas;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        BirthDay = birthDay;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
}
