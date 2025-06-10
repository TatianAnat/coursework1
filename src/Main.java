import java.util.Random;

public class Main {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee("Иванов", 1, 50000));
        manager.addEmployee(new Employee("Петров", 1, 70000));
        manager.addEmployee(new Employee("Сидоров", 2, 60000));
        manager.addEmployee(new Employee("Кузнецов", 2, 80000));

        System.out.println("Сотрудник с минимальной зарплатой: " + manager.minSalaryInDept().getId());
        System.out.println("Сотрудник с максимальной зарплатой: " + manager.maxSalaryInDept().getId());
        System.out.println("Сумма затрат на зарплату по отделу 1: " + manager.sumSalaryInDept(1));
        System.out.println("Средняя зарплата по отделу 2: " + manager.avgSalaryInDept(2));

        System.out.println("Индексация зарплаты на 10%");
        manager.indexSalaryInDept(1,10);
        manager.printEmployeesInDept(1);

        System.out.println("Сотрудники с зарплатой больше 60000:");
        manager.printEmployeesWithSalaryGreaterOrEqual(60000);

        System.out.println("Сотрудники с зарплатой меньше 70000:");
        manager.printEmployeesWithSalaryLess(70000);
    }
}