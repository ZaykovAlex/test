public class Programmer {
    public String getPosition() {
        return position;
    }
    private String name;
    private String company;
    String position;
      public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }
    void work() {
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }
}
