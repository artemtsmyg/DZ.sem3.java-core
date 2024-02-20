package org.example;

/**
 * Класс, представляющий руководителя, наследник от сотрудника.
 */
public class Manager extends Employee {

    public Manager(String name, String position, double salary, int year, int month, int day) {
        super(name, position, salary, year, month, day);
    }

    /**
     * Статический метод для повышения зарплаты сотрудникам, кроме руководителей.
     */
    public static void increaseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.salary += amount;
            }
        }
    }
}
