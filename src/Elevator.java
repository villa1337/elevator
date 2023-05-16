public class Elevator {

    public int number;

    public Elevator(int number, boolean moving, int floor) {
        this.number = number;
        this.moving = moving;
        this.floor = floor;
    }

    public boolean moving;

    public int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }
}
