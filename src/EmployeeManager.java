public class EmployeeManager {
    private static Employee[] employees;

    public static void setEmployees(Employee[] emps) {
        employees = emps;
    }

    // Проиндексировать зарплату всех сотрудников на процент (например, 10% = 10)
    public static void indexSalaryAll(double percent) {
        for (Employee e : employees) {
            e.setSalary((int) (e.getSalary() * (1 + percent / 100)));
        }
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    // Найти сотрудника с минимальной зарплатой в отделе
    public static Employee minSalaryInDept() {
        Employee minEmp = null;
        for (Employee e : employees) {
            int dept = 0;
            if (e.getDepartment() == dept) {
                if (minEmp == null || e.getSalary() < minEmp.getSalary()) {
                    minEmp = e;
                }
            }
        }
        return minEmp;
    }

    // Найти сотрудника с максимальной зарплатой в отделе
    public static Employee maxSalaryInDept(int dept) {
        Employee maxEmp = null;
        for (Employee e : employees) {
            if (e.getDepartment() == dept) {
                if (maxEmp == null || e.getSalary() > maxEmp.getSalary()) {
                    maxEmp = e;
                }
            }
        }
        return maxEmp;
    }

    // Сумма затрат на зарплату по отделу
    public static double sumSalaryInDept(int dept) {
        double sum = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == dept) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    // Средняя зарплата по отделу
    public static double avgSalaryInDept(int dept) {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == dept) {
                sum += e.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    // Проиндексировать зарплату всех сотрудников отдела на процент
    public static void indexSalaryInDept(int dept, double percent) {
        for (Employee e : employees) {
            if (e.getDepartment() == dept) {
                e.setSalary((int) (e.getSalary() * (1 + percent / 100)));
            }
        }
    }

    // Напечатать всех сотрудников отдела (кроме отдела)
    public static void printEmployeesInDept(int dept) {
        for (Employee e : employees) {
            if (e.getDepartment() == dept) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", ЗП: " + e.getSalary());
            }
        }
    }

    // Вывести всех сотрудников с зарплатой меньше числа
    public static void printEmployeesWithSalaryLess(double salary) {
        for (Employee e : employees) {
            if (e.getSalary() < salary) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", ЗП: " + e.getSalary());
            }
        }
    }

    // Вывести всех сотрудников с зарплатой больше или равно числу
    public static void printEmployeesWithSalaryGreaterOrEqual(double salary) {
        for (Employee e : employees) {
            if (e.getSalary() >= salary) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", ЗП: " + e.getSalary());
            }
        }
    }


    public Employee maxSalaryInDept() {
        return null;
    }
}
