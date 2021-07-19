package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -3;
    private int maxFloor = 26;

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {
        if (floor > getCurrentFloor() && floor < maxFloor) {
            System.out.println("Лифт двигается вверх:");
            for (int a = getCurrentFloor(); a < floor; a++) {
            if (getCurrentFloor() == floor){
                break;
            }
            System.out.println(getCurrentFloor());
            moveUp();
            }

        }
        else if (floor < getCurrentFloor() && floor >= minFloor) {
            System.out.println("Лифт двигается вниз:");
            for (int a = getCurrentFloor(); a > floor; a--){
                if (getCurrentFloor() == floor) {
                    break;
                }
                System.out.println(getCurrentFloor());
                moveDown();
            }
        }


    }
}
