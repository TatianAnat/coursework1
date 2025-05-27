import java.util.Random;
import java.util.List;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Савелий", "Евгений", "Фёдор", "Иван", "Егор"};
    private final static String[] SURNAMES = {"Светиков", "Иванов", "Достоевский", "Фёдоров", "Сергеев"};
    private final static String[] MIDDLE_NAME_PATRONYMIC = new String[]{"Александрович", "Иванович", "Васильевич", "Егорович", "Иванович"};
    private static double[] SALARIES= {12000,30000, 45000, 51000, 55000, 60000};

    private final static Employee[] EMPLOYEES = new Employee[10];

    //генерируем список сотрудников
    private static void initEmployee() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                    MIDDLE_NAME_PATRONYMIC[RANDOM.nextInt(0, MIDDLE_NAME_PATRONYMIC.length)] + " ";
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(0, SALARIES.length));
        }
       // Employee.SalaryUtils.adjustSalaries(List.of(EMPLOYEES), 10);
    }

    public static void main(String[] args) {
        initEmployee();
        print();
        System.out.println("Сумма ЗП сотрудников: " + employeeSalaryAmount());
        System.out.println("Сотрудник с минимальной зарплатой: " + minimumWageEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + maximumWageEmployee());
        System.out.println("Среднее значение зарплат сотрудников: " + calculatingAverageEmployeeSalary());
        //System.out.println("Проиндексированная зарплата " + adjustSalaries());
        printFullNames();

        indexSalaries();

    }

    //метод вывода сотрудников
    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    //метод считает сумму зарплат
    private static int employeeSalaryAmount() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary(); //прибавляем зарплату текущего сотрудника
        }
        return sum;
    }

    //метод нахождения сотрудника с минимальной зарплатой
    private static Employee minimumWageEmployee() {
        Employee minimumWageEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (minimumWageEmployee == null || employee.getSalary() < minimumWageEmployee.getSalary()) {
                minimumWageEmployee = employee;
            }
        }
        return minimumWageEmployee;
    }

    //метод нахождения сотрудника с максимальной зарплатой
    private static Employee maximumWageEmployee() {
        Employee maximumWageEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (maximumWageEmployee == null || employee.getSalary() > maximumWageEmployee.getSalary()) {
                maximumWageEmployee = employee;
            }
        }
        return maximumWageEmployee;
    }

  /*  public static double adjustSalaries() {
        //Employee adjustSalaries = null;
        int percent = 10;
        double multiplier = 1 + percent / 100.0;
        //employee.setSalary((int) newSalary);
        double adjustSalaries = 0;
        for (Employee employee : EMPLOYEES) {
           // if (adjustSalaries == null || employee.getSalary() > adjustSalaries.getSalary())
            adjustSalaries = employee.getSalary() * multiplier;
        }

        return adjustSalaries;

    }*/

    public static <EMPLOYEES> void indexSalaries(EMPLOYEES) {
        indexSalaries(10);
    }

    public static <EMPLOYEES> void indexSalaries(double percent, EMPLOYEES) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] =  * (1 + percent / 100);
        }
    }

    // метод нахождения среднего значения зарплаты
    private static double calculatingAverageEmployeeSalary() {
        return (double) employeeSalaryAmount() / EMPLOYEES.length;
    }

    //метод печати ФИО всех сотрудников
    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {

            System.out.println(employee.getFullName()  + + employee.getSalary());

        }

    }
}

