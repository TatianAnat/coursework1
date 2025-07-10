import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook(10);


/**
 * заполняем массив
 */
        book.addEmployee(new Employee("Иванов Иван Сергеевич", 1, 50000), 0);
        book.addEmployee(new Employee("Петров Пётр Михайлович", 1, 70000), 1);
        book.addEmployee(new Employee("Сидоров Юрий Константинович", 2, 60000), 2);
        book.addEmployee(new Employee("Кузнецов Роман Николаевич", 2, 80000), 3);
        book.addEmployee(new Employee("Суворов Олег Игоревич", 2, 45000), 4);
        book.addEmployee(new Employee("Евграфов Николай Захарович", 3, 35000), 5);
        book.addEmployee(new Employee("Стоцкая Алиса Сергеевна", 3, 65000), 6);
        book.addEmployee(new Employee("Веселова Александра Евгеньевна", 4, 88000), 7);
        book.addEmployee(new Employee("Веселов Андрей Анатольевич", 5, 88300), 8);

        Employee newEmp1 = new Employee("Сергина Анна Михайловна", 2, 67000);
        System.out.println("Сотрудник добавлен: " + book.addEmployee(newEmp1));


        System.out.println();
        System.out.println("До индексации: ");
        book.printAllEmployees();
/**
 * ищем сотрудника по id
 */
        System.out.println();
        Employee found = book.getEmployeeById(8);
        System.out.println("Поиск сотрудника по ID ");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Сотрудник не найден");
        }
        System.out.println();
        /**
         * удаление сотрудника по id
         */
        int id = 5;
        System.out.println("Удаление сотрудника с id " + id + " : " + book.removeEmployeeById(5));
        System.out.println();
        System.out.println("Сотрудник удалён: " + book.removeEmployeeById(newEmp1.getId()));

        System.out.println();
        System.out.println("Сумма затрат на зарплату: " + book.calculateTotalSalary());
        System.out.println("Средняя зарплата: " + book.calculateAverageSalary());

        System.out.println();
        System.out.println("Индексация зарплаты на 10%");
        book.indexSalaries(10);
        book.printAllEmployees();

        /**
         * Находим сотрудника с минимальной/максимальной зарплатой в указанном отделе
         */
        int department = 2;
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + book.minSalaryInDept(department));
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + book.maxSalaryInDept(department));
        System.out.println("Сумма затрат на зарплату в отделе " + department + ": " + book.sumSalaryInDept(department));
        System.out.println("Средняя зарплата в отделе " + department + ": " + book.avgSalaryInDept(department));

        System.out.println("Индексация зарплаты сотрудников отдела " + department + " на 5%");
        book.indexSalaryInDept(department, 5);
        book.printEmployeesInDept(department);

        /**
         *  Печать сотрудников отдела 3
         */
        System.out.println();
        System.out.println("Печать всех сотрудников отдела 3 (без поля отдел):");
        book.printEmployeesInDept(3);

        /**
         * Печать сотрудников с зарплатой меньше 55000
         */
        System.out.println();
        System.out.println("Сотрудники с зарплатой меньше 55000:");
        book.printEmployeesWithSalaryLess(55000);

        System.out.println("Сотрудники с зарплатой больше 60000:");
        book.printEmployeesWithSalaryGreaterOrEqual(60000);
        System.out.println();
        /**
         * Повторный поиск сотрудника после удаления
         */
        Employee afterRemove = book.getEmployeeById(id);
        System.out.println("Поиск сотрудника c id № " + id + " после удаления:");
        if (afterRemove != null) {
            System.out.println(afterRemove);
        } else {
            System.out.println("Сотрудник с id № " + id + " не найден.");
        }

    }


}