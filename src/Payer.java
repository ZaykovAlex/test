public class Payer {
    private String surname;
    private String name;
    private String adress;
    private String cardNumber;

    public Payer(String surname, String name, String adress, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.adress = adress;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return ("Payer: " + surname + " " + name + ", " + "adress: " + adress + ", " + "card: " + cardNumber);
    }
}

