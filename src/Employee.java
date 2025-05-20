public class Employee {
    private static int idСounter = 1;

    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        id = idСounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(int departament) {
        this.department = departament;
    }

    public void setSalary(int salary) {
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

    public int[] getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id" + id + ", Фамилия Имя Отчество = " + fullName + ", отдел: " + department + ", зарплата: " + salary;
    }
}
