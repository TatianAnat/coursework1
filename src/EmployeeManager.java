public class EmployeeManager {
    private static Employee[] employees;


    public static void setEmployees(Employee[] e) {
        employees = e;
    }

    /**
     * Находим сотрудника с минимальной зарплатой в отделе
     *
     * @param department
     * @return
     */
    public static Employee minSalaryInDept(int department) {
        Employee minEmp = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                if (minEmp == null || e.getSalary() < minEmp.getSalary()) {
                    minEmp = e;
                }
            }
        }
        return minEmp;
    }

    /**
     * Находим сотрудника с максимальной зарплатой в отделе
     *
     * @param department
     * @return
     */
    public static Employee maxSalaryInDept(int department) {
        Employee maxEmp = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                if (maxEmp == null || e.getSalary() > maxEmp.getSalary()) {
                    maxEmp = e;
                }
            }
        }
        return maxEmp;
    }

    /**
     * Сумма затрат на зарплату по отделу
     *
     * @param department
     * @return
     */
    public static double sumSalaryInDept(int department) {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                sum += e.getSalary();
            }
        }
        return sum;
    }


    /**
     * Средняя зарплата по отделу
     *
     * @param department
     * @return
     */
    public static double avgSalaryInDept(int department) {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                sum += e.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    /**
     * Проиндексировать зарплату всех сотрудников отдела на процент
     *
     * @param percent
     */
    public static void indexSalaryInDept(int department, double percent) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                e.setSalary((int) (e.getSalary() + e.getSalary() * percent / 100));
            }
        }
    }

    /**
     * печать всех сотрудников отдела (кроме отдела)
     */

    public static void printEmployeesInDept(int department) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", ЗП: " + e.getSalary());
            }
        }
    }

    /**
     * Вывод всех сотрудников с зарплатой меньше заданного числа
     *
     * @param salary
     */
    public static void printEmployeesWithSalaryLess(double salary) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salary) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }

    /**
     * Вывод всех сотрудников с зарплатой больше или равной заданному числу
     *
     * @param salary
     */
    public static void printEmployeesWithSalaryGreaterOrEqual(double salary) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salary) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }


    public Employee maxSalaryInDept() {
        return null;
    }


}
