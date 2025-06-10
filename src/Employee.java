public class Employee {

    //public static Main SalaryUtils;
    //начинаем генерировать с 1. Это поле общее (static) и принадлежит к классу Employee
    private static int idСounter = 1;

    //поля принадлежать объекту, т.е. у каждого сотрудника значение данных будет своё
    private final int id;
    private final String fullName;
    public String setSalary;
    private int department;
    private int salary;

    //конструктор  принимает нужные поля. Заполняем значениями из параметра конструктора
    public Employee(String fullName, int department, int salary) {
        this.id = idСounter++;  //будем брать из генератора и менять его при каждом вызове конструктора
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

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "id" + id + ", Фамилия Имя Отчество = " + fullName + ", отдел: " + department + ", зарплата: " + salary;

    }
}

