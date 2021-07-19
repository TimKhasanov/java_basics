package ru.skillbox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        while (true){
            System.out.print("Введите номер этажа :");
            int flor = new Scanner(System.in).nextInt();
            elevator.move(flor);
        }
    }
}
