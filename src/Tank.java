public class Tank {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x, y;
    int dir;
    int fuel;
    private static int tankCount;
    public int num;
    String model;
    // создаен конструктор танка №1
    public Tank() {
        this (0, 0, 100, "T34");
    }
    // создаем конструктор танка №2
    public Tank(int x, int y, String model) {
        this (x, y, 100, model);
    }
    // создаем конструктор для танка№3
    public Tank(int x, int y, int fuel, String model) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.model = model;
        tankCount++;
        num = tankCount;
        }
    public void goForward(int i) {
        while (fuel > 0) {
            if (i < fuel) {
                if (dir == 0) {
                    x += i;
                    fuel = fuel - Math.abs(i);
                } else if (dir == 1) {
                    y += i;
                    fuel = fuel - Math.abs(i);
                } else if (dir == 2) {
                    x -= i;
                    fuel = fuel - Math.abs(i);
                } else {
                    y -= i;
                    fuel = fuel - Math.abs(i);
                }
            } else {
                i = fuel;
                if (dir == 0) {
                    x += i;
                    fuel = fuel - Math.abs(i);
                } else if (dir == 1) {
                    y += i;
                    fuel = fuel - Math.abs(i);
                } else if (dir == 2) {
                    x -= i;
                    fuel = fuel - Math.abs(i);
                } else {
                    y -= i;
                    fuel = fuel - Math.abs(i);
                }
            }
        }
    }

    public void printPosition() {
        System.out.println("The Tank " + model + "-" + num + " is at: " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}

