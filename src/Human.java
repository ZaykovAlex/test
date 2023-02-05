public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;

    /* public Human(String name, int age, int weight, String address, String work) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
}
     */

    public Human(String name, int age) {
        this(age, 70, null, null);
        this.name = name;
    }

    public Human(String name, String address) {
        this(35, 77, address, "builder");
        this.name = name;
    }

    public Human(String name, int age, int weight) {
        this(age, weight, null, null);
        this.name = name;
    }

    public Human(String name, int age, String work) {
        this(age, 80, null, work);
        this.name = name;
    }

    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
        name = "Bobby";
    }
}

