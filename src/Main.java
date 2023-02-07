public class Main {
    public static void main(String[] args) {
        /*
        Cat barsik = new Cat(); // создали кота из класса Cat
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setName("Pushok");
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is " + smallCat.getName());
        bigCat.setColor("Grey");
        System.out.println("Color of big cat is " + bigCat.getColor());
        */

/*
        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10, "T34");
        Tank customTank = new Tank(20, 30, 200, "T34");
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
        */


        Balance.addRight(100);
        Balance.addLeft(200);
        Balance.addRight(150);
        Balance.addLeft(50);
        System.out.println(Balance.getSituation());

        Bell.sound();
        Bell.sound();
        Bell.sound();
        Bell.sound();

        Payer payer1 = new Payer("Volkov", "Oleg", "NN", "1234 5678 1234 5678");
        System.out.println(payer1.toString());


        Programmer programmer = new Programmer("Antony", "Intel");
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());

        LimitingRectangle rectangle = new LimitingRectangle(new int[][] {{1, 2}, {3, 4}});
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println(programmer);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getWidth());
        System.out.println("LOL");
    }
}