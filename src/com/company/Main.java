package com.company;

public class Main {

    public static void main(String[] args) {
// Задание 1.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName  + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
// Задание 2.
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
// Задание 3.
        String fullNamePassData =  fullName.replaceAll(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNamePassData);
// Задание 4.
        String fullNameYo = "Иванов Семён Семёнович";
        String fullNameYoYok = fullNameYo.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameYoYok);
    }
}
