import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Светлана", "Екатерина", "Фёдор", "Иван", "Егор"};
    private final static String[] SURNAMES = {"Светикова", "Иванова", "Достоевский", "Фёдоров", "Сергеев"};
    private final static String[] MIDDLE_NAME_PATRONYMIC = {"Александровна", "Ивановна", "Васильевич", "Егорович", "Иванович"};

    private final static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployee(){
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0,SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(0,NAMES.length)] + " " +
                    MIDDLE_NAME_PATRONYMIC[RANDOM.nextInt(0,MIDDLE_NAME_PATRONYMIC.length)] + " ";
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1,6), RANDOM.nextInt(40_000,150_000));
        }
    }

    public static void main(String[] args) {
        initEmployee();
        print();
        System.out.println("Сумма ЗП сотрудников: " + employeeSalaryAmount());

    }

    private static void print() {
        for (Employee employee: EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int employeeSalaryAmount() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static class Employee {
        private static int idСounter = 1;

        private int id;
        private String fullName;
        private int department;
        private int salary;

        public Employee(String fullName, int department, int salary) {
            id = idСounter++;
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
        }

        public void setDepartment(int departament) {
            this.department = departament;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getFullName() {
            return fullName;
        }

        public int getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "id" + id + ", Фамилия Имя Отчество = " + fullName + ", отдел: " + department + ", зарплата: " + salary;
        }
    }
}