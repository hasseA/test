public class Staff {
        private String name;
        private String familyName;
        private String age;
        public static int counter=0;
        private  int StaffId;
        private double salary;

        public Staff(String Cname, String Cfamilyname, String Calder, double salary)
        {
            this.setSalary(salary);
            this.setName(Cname);
            this.setfamilyName(Cfamilyname);
            this.setAlder(Calder);
            this.counter++;
            System.out.println("counter is :"+ this.counter);
            this.setStaffID(counter);
        }

        public double getSalary()
        {
            return this.salary;
        }

        public void setSalary(double csaLry){
            this.salary=csaLry;
        }

        public int getStaffId()
        {
            return this.StaffId;
        }

        public void setStaffID(int counter){
            this.StaffId=counter;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getfamilyName() {
            return familyName;
        }

        public void setfamilyName(String familyName) {
            this.familyName = familyName;
        }

        public String getAlder() {
            return age;
        }

        public void setAlder(String age) {
            this.age = age;
        }


}
    