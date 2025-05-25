import java.util.ArrayList;
import java.util.List;
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
        Employee.SalaryUtils.adjustSalaries(List.of(EMPLOYEES), 10);
    }

    public static void main(String[] args) {
        initEmployee();
        print();
        System.out.println("Сумма ЗП сотрудников: " + employeeSalaryAmount());
        System.out.println("Сотрудник с минимальной зарплатой: " + minimumWageEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + maximumWageEmployee());
        System.out.println("Среднее значение зарплат сотрудников: " + calculatingAverageEmployeeSalary());
        printFullNames();

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


    private static double calculatingAverageEmployeeSalary() {
        return (double) employeeSalaryAmount() / EMPLOYEES.length;
    }

    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName() + employee.getSalary());

        }

    }
}

