public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    /**
     * добавляем сотрудника
     */
    public void addEmployee(Employee employee, int index) {
        if (index >= 0 && index < employees.length) {
            employees[index] = employee;
        }
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public double calculateTotalSalary() {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        return sum;
    }
    /**
     * Находим сотрудника с минимальной зарплатой
     * @return
     */
    public Employee findEmployeeWithMinSalary() {
        Employee minEmp = null;
        for (Employee e : employees) {
            if (e != null && (minEmp == null || e.getSalary() < minEmp.getSalary())) {
                    minEmp = e;
                }
            }
        return minEmp;
    }
    /**
     * Находим сотрудника с максимальной зарплатой
     */
    public Employee findEmployeeWithMaxSalary() {
        Employee maxEmp = null;
        for (Employee e : employees) {
            if (e != null && (maxEmp == null || e.getSalary() > maxEmp.getSalary())) {
                    maxEmp = e;
                }
            }
        return maxEmp;
    }

    public double calculateAverageSalary() {
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

    public void  printAllEmployeeNames(){
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.getFullName());
            }
        }
    }

    /**
     * индексация зарплаты всех сотрудников на указанный процент
     * @param percent
     */
    public void indexSalaries(double percent) {
        for (Employee e : employees) {
            if (e != null) {
                e.setSalary(e.getSalary() + (e.getSalary() * percent) / 100);
            }
        }
    }
    /**
     * Находим сотрудника с минимальной зарплатой в отделе
     *
     * @param department
     * @return
     */
    public Employee minSalaryInDept(int department) {
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
    public Employee maxSalaryInDept(int department) {
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
    public double sumSalaryInDept(int department) {
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
    public double avgSalaryInDept(int department) {
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
    public void indexSalaryInDept(int department, double percent) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                e.setSalary((int) (e.getSalary() + e.getSalary() * percent / 100));
            }
        }
    }
    /**
     * печать всех сотрудников отдела (кроме отдела)
     */

    public void printEmployeesInDept(int department) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }
    /**
     * Вывод всех сотрудников с зарплатой меньше заданного числа
     *
     * @param salary
     */
    public void printEmployeesWithSalaryLess(double salary) {
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
    public void printEmployeesWithSalaryGreaterOrEqual(double salary) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salary) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }

    /**
     * метод определяет есть ли свободная ячейка, чтобы добавить сотрудника
     * @param employee
     * @return возвращает истину, если свободная ячейка есть, иначе ложь
     */
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return  true;
            }
        }
        return  false;
    }
    /**
     * метод удаляет сотрудника по id. Если сотрудник с указанным id будет найден, то
     * @return истина и ячейка обнуляется, иначе возвращается ложь, т.е. сотрудник не найден
     */
    public boolean removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }
}
