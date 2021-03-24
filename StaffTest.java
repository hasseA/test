import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getStaffId() {

        Staff p1 = new Staff("Karl", "Anderson", 30, 20000);
        int expected = p1.getStaffId();
        assertEquals(expected, p1.getStaffId());
    }
    @Test
    void addStaff() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        p.staffList.clear();
        p.addStaff(p);
        int expected = 1;
        int actual = p.staffList.size();

        assertEquals(expected, actual);

    }

    @Test
    void getEfternamn() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        assertEquals("Arezoomande", p.getEfternamn());

    }

    @Test
    void setEfternamn() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        p.setEfternamn("Anderson");
        assertEquals("Anderson", p.getEfternamn());
    }

    @Test
    void getFornamn() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        assertEquals("Elias", p.getFornamn());
    }

    @Test
    void setFornamn() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        p.setFornamn("John");
        assertEquals("John", p.getFornamn());
    }

    @Test
    void getAge() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        assertEquals(26, p.getAge());
    }

    @Test
    void setAge() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        p.setAge(70);
        assertEquals(70, p.getAge());
    }

    @Test
    void getSallary() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        assertEquals(30000, p.getSallary());
    }

    @Test
    void setSallary() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
       p.setSallary(5);
        assertEquals(5, p.getSallary());
    }



    @Test
    void setStaffId() {
        Staff p = new Staff("Elias", "Arezoomande", 26, 30000);
        p.setStaffId(105);
        assertEquals(105, p.getStaffId());
    }
}