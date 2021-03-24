import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {

      @Test
    public void getSalary(){
        Staff S;
        S = new Staff("Karl", "Anderson", "30", 15000);
        int actual =0;
        int expected =15000;
        assertEquals(expected,S.getSalary());
      }

    public void setSalary(){
        Staff S;
        S = new Staff("Karl", "Anderson", "30", 15000);

        double actual =S.getSalary();
        S.setSalary(30000);
        double expected =30000;
        assertEquals(expected,S.getSalary());
    }

}