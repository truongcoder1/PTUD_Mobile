import java.util.Date;

//tạo class Sinhvien
public class Sinhvien {
    private String FirstName;
    private String LastName;
    private Date BirthDay;
    private String Address;
    private String Clas;
    private float OOP;
    private float PM;
    private float ML;
    private float DB;
    private float Mobile;

    public float getMobile() {
        return Mobile;
    }

    public void setMobile(float mobile) {
        Mobile = mobile;
    }

    public float getDB() {
        return DB;
    }

    public void setDB(float DB) {
        this.DB = DB;
    }

    public float getML() {
        return ML;
    }

    public void setML(float ML) {
        this.ML = ML;
    }

    public float getPM() {
        return PM;
    }

    public void setPM(float PM) {
        this.PM = PM;
    }

    public float getOOP() {
        return OOP;
    }

    public void setOOP(float OOP) {
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
    public float avg(){
        return (OOP+PM+ML+DB+Mobile)/5;
    }
    public char avgChar(){
        float avg = avg();
        if (avg >= 8.5) return 'A';
        else if (avg >= 7.0) return 'B';
        else if (avg >= 5.5) return 'C';
        else if (avg >= 4.0) return 'D';
        else return 'F';
    }
}
