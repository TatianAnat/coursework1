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
            }
        }
    }
}