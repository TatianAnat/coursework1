public class Main {
    public static void main(String[] args) {
        class Employee {
            private static int idСounter = 1;

            private int id;
            private String fullName;
            private int department;
            private int salary;

            public Employee(String fullName, int department, int salary){
                id = idСounter ++;
                this.fullName = fullName;
                this.department = department;
                this.salary = salary;
            }

            public void setDepartment(int departament){
                this.department = departament;
            }
            public void setSalary(int salary){
                this.salary = salary;
            }
            public int getId() {
                return id;
            }
            public String getFullName(){
                return fullName;
            }

        }
    }
}