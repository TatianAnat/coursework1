import java.util.Arrays;
import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Савелий", "Евгений", "Фёдор", "Иван", "Егор"};
    private final static String[] SURNAMES = {"Светиков", "Иванов", "Достоевский", "Фёдоров", "Сергеев"};
    private final static String[] MIDDLE_NAME_PATRONYMIC = new String[]{"Александрович", "Иванович", "Васильевич", "Егорович", "Иванович"};

    private final static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployee() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                    MIDDLE_NAME_PATRONYMIC[RANDOM.nextInt(0, MIDDLE_NAME_PATRONYMIC.length)] + " ";
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(40_000, 150_000));
        }
    }

    public static void main(String[] args) {
        initEmployee();
        print();
        System.out.println("Сумма ЗП сотрудников: " + employeeSalaryAmount());
        System.out.println("Сотрудник с минимальной зарплатой: " + minimumWageEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + maximumWageEmployee());
        System.out.println("Среднее значение зарплат сотрудников: " + calculatingAverageEmployeeSalary());
        printFullNames();
        indexSalaries(10);
        for (Employee e : employee) {
            System.out.println(e.getSalary());
        }

        // System.out.println("Индексированная зарплата сотрудников: " + indexSalaries(10));
    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
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

    private static Employee minimumWageEmployee() {
        Employee minimumWageEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (minimumWageEmployee == null || employee.getSalary() < minimumWageEmployee.getSalary()) {
                minimumWageEmployee = employee;
            }
        }
        return minimumWageEmployee;
    }

    private static Employee maximumWageEmployee() {
        Employee maximumWageEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (maximumWageEmployee == null || employee.getSalary() > maximumWageEmployee.getSalary()) {
                maximumWageEmployee = employee;
            }
        }
        return maximumWageEmployee;
    }

   // public static void indexSalaries(double percent) {
      //  for (Employee employee : EMPLOYEES) {
       //     double newSalary = employee.getSalary() * (1 + percent / 100);
        //    employee.setSalary((int) newSalary);
        //}
   // }
   public class SalaryIndexer {
       public static void indexSalaries(EMPLOYEES employees, double percent) {
           for (Employee emp : employees) {
               double currentSalary = emp.getSalary();
               double increasedSalary = currentSalary * (1 + percent / 100);
               emp.setSalary(increasedSalary);
           }
       }
   }

    private static double calculatingAverageEmployeeSalary() {
        return (double) employeeSalaryAmount() / EMPLOYEES.length;
    }

    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName() + employee.getNewSalary());

        }

    }
}

