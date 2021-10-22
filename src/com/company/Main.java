package com.company;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1(){
        PriorityQueue priority = new PriorityQueue(10);
        priority.insert(new Student("Vova", 19 , "Rudenko"));
        priority.insert(new Student("Vasil", 24 , "Potapov"));
        priority.insert(new Student("Anton", 22 , "Iakovlev"));
        priority.insert(new Student("Artur", 21 , "Alexeev"));
        priority.insert(new Student("Sania", 20 , "Budienov"));
        priority.insert(new Student("Sergiy", 24 , "Krotov"));
        priority.insert(new Student("Alex", 23 , "Kotov"));
        priority.insert(new Student("Olga", 21 , "Diatlov"));
        priority.insert(new Student("Vlad", 22 , "Vladov"));
        priority.insert(new Student("Vitia", 21 , "Fantom"));
        while (!priority.isEmpty()) {
            Student student = priority.remove();
            System.out.println("Student: " + " Ім'я: " + student.name    + " Прізвище: " + student.surname+ " років: " + student.age);
        }
    }
    public static void task2(){
        Queue line = new Queue(10);
        for(int index = 0 ; index < 10; index++){
            int randumNumber =(int) Math.round(Math.random()* 90-40);
            System.out.print(randumNumber + "  ");
            line.insert(randumNumber);
        }
        int positivNumber = 0;
        while (!line.isEmpty()){
            long number = line.remove();
            if (number>0){
                positivNumber ++;
            }
        }
        line.insert(positivNumber);
        System.out.println("");
        System.out.println("Четных чисел  " + line.peekFront());
    }
}
