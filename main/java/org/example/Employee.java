package org.example;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee {
    String name;
    String position;
    double salary;
    private int year;
    private int month;
    private int day;

    public Employee(String name, String position, double salary, int year, int month, int day) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Метод для сравнения двух дат.
     */
    public int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        return Integer.compare(year1 * 10000 + month1 * 100 + day1, year2 * 10000 + month2 * 100 + day2);
    }
}