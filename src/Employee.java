import java.util.List;
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
        id = idСounter++;  //будем брать из генератора и менять его при каждом вызове конструктора
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

   /* public static class SalaryUtils {
        *//**
         * Статический метод для изменения зарплаты всех сотрудников на заданный процент
         *
         //* @param employees список сотрудников
         //* @param percent   процент изменения (может быть как положительным, так и отрицательным)
         *//*
        public static void adjustSalaries(List<Employee> employees, double percent) {
            if (employees == null) {
                throw new IllegalArgumentException("Список сотрудников не может быть null");
            }

            double multiplier = 1 + percent / 100.0;

            for (Employee employee : employees) {
                if (employee != null) {
                    double newSalary = employee.getSalary() * multiplier;
                    employee.setSalary((int) newSalary);
                }
            }
        }
    }*/

    @Override
    public String toString() {
        return "id" + id + ", Фамилия Имя Отчество = " + fullName + ", отдел: " + department + ", зарплата: " + salary;

    }
}

