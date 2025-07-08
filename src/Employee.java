public class Employee {

    /**
     * начинаем генерировать с 1. Это поле общее (static) и принадлежит к классу Employee
     */
    private static int idСounter = 1;
    /**
     * поля принадлежать объекту, т.е. у каждого сотрудника значение данных будет своё
     */
    private final int id;
    private final String fullName;
    public String setSalary;
    private int department;
    private double salary;

    /**
     * конструктор  принимает нужные поля. Заполняем значениями из параметра конструктора
     * id = idСounter++ будем брать из генератора и менять его при каждом вызове конструктора
     * @param fullName
     * @param department
     * @param salary
     */
    public Employee(String fullName, int department, double salary) {
        this.id = idСounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }


    public void setDepartment(int departament) {
        this.department = departament;
    }

    public void setSalary(double salary) {
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
        return (int) salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "id" + id + ", Фамилия Имя Отчество = " + fullName + ", отдел: " + department + ", зарплата: " + salary;

    }
}

