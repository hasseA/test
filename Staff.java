import java.util.ArrayList;

public class Staff {
private String fornamn;
private String efternamn;
private int age;
private double sallary;
private int staffId;
public static int counter = 0;
public ArrayList<Staff> staffList = new ArrayList<>();

Staff(String cName,String cEfternamn, int cAge, double cSallary){
    this.setSallary(cSallary);
    this.setFornamn(cName);
    this.setEfternamn(cEfternamn);
    this.setAge(cAge);

    this.setStaffId(counter++);

};

    public void addStaff(Staff s){
    this.staffList.add(s);
    }

    public String getEfternamn() {
        return efternamn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    public String getFornamn() {
        return fornamn;
    }

    public void setFornamn(String fornamn) {
        this.fornamn = fornamn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
}
