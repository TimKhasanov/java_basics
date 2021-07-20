package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }


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
        if (floor > getCurrentFloor() && floor <= maxFloor) {
            System.out.println("Лифт движется вверх:");
            for (int a = getCurrentFloor(); a < floor; a++) {
                if (getCurrentFloor() == floor){
                    break;
                }
                moveUp();
                System.out.println(getCurrentFloor());
            }

        }
        else if (floor < getCurrentFloor() && floor >= minFloor){
            System.out.println("Лифт движется вниз:");
            for (int a = getCurrentFloor(); a > floor; a++){
                if (getCurrentFloor() == floor){
                    break;
                }
                moveDown();
                System.out.println(getCurrentFloor());
            }
        }
    }
}
