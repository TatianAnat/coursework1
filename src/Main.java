import java.util.Random;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
/**
 * заполняем массив
 */
        employees[0] = new Employee("Иванов", 1, 50000);
        employees[1] = new Employee("Петров", 1, 70000);
        employees[2] = new Employee("Сидоров", 2, 60000);
        employees[3] = new Employee("Кузнецов", 2, 80000);
        employees[4] = new Employee("Суворов", 2, 45000);
        employees[5] = new Employee("Евграфов", 3, 35000);
        employees[6] = new Employee("Стоцкая", 3, 65000);
        employees[7] = new Employee("Веселова", 4, 88000);
        employees[8] = new Employee("Веселов", 5, 88300);
        employees[9] = new Employee("Евстегнеев", 5, 34300);

        System.out.println("До индексации: ");
        printAllEmployees();
        //System.out.println("Сотрудник с минимальной зарплатой: " + EmployeeManager.minSalaryInDept(1));
       // System.out.println("Сотрудник с максимальной зарплатой: " + EmployeeManager.maxSalaryInDept(1).getId());
        //System.out.println("Сумма затрат на зарплату по отделу 1: " + EmployeeManager.sumSalaryInDept(1));
        //System.out.println("Средняя зарплата по отделу 2: " + EmployeeManager.avgSalaryInDept(2));
        System.out.println("Сумма затрат на зарплату: " + calculateTotalSalary());
        System.out.println("Средняя зарплата: " + calculateAverageSalary());

        System.out.println("Индексация зарплаты на 10%");
        indexSalaries(10);
        printAllEmployees();

        /**
         * Находим сотрудника с минимальной/максимальной зарплатой в указанном отделе
         */
        int department = 2;
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + EmployeeManager.minSalaryInDept(department));
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + EmployeeManager.maxSalaryInDept(department));
        System.out.println("Сумма затрат на зарплату в отделе " + department + ": " + EmployeeManager.sumSalaryInDept(department));
        System.out.println("Средняя зарплата в отделе " + department + ": " + EmployeeManager.avgSalaryInDept(department));

        System.out.println("Индексация зарплаты сотрудников отдела " + department + " на 5%");
        EmployeeManager.indexSalaryInDept(department, 5);
        EmployeeManager.printEmployeesInDept(department);

        /**
         *  Печать сотрудников отдела 3
         */
        System.out.println();
        System.out.println("Печать всех сотрудников отдела 3 (без поля отдел):");
        EmployeeManager.printEmployeesInDept(3);

        /**
         * Печать сотрудников с зарплатой меньше 55000
         */
        System.out.println();
        System.out.println("Сотрудники с зарплатой меньше 55000:");
        EmployeeManager.printEmployeesWithSalaryLess(55000);

        System.out.println("Сотрудники с зарплатой больше 60000:");
        EmployeeManager.printEmployeesWithSalaryGreaterOrEqual(60000);
    }

    public static void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static double calculateTotalSalary() {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        return sum;
    }
    public static double calculateAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void indexSalaries(double percent) {
        for (Employee e : employees) {
            if (e != null) {
                e.setSalary(e.getSalary() + (e.getSalary() * percent) / 100);
            }
        }
    }
}