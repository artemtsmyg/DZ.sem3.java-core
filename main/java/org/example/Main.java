package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Артём", "Программист", 70000, 1990, 8, 15);
        employees[1] = new Employee("Иван", "Программист", 70000, 2000, 5, 10);
        employees[2] = new Employee("Сергей", "Программист", 70000, 1995, 7, 5);
        employees[3] = new Employee("Иван", "Старший программист", 90000, 1980, 10, 13);
        employees[4] = new Manager("Петр", "Руководитель", 150000, 1985, 10, 30);

        Manager.increaseSalary(employees, 10000);

        for (Employee employee : employees) {
            System.out.println("Имя: " + employee.name + ", Должность: " + employee.position + ", Зарплата: " + employee.salary);
        }
    }
}
