package OOP;

public class Shop implements Building {
    String street;
    String number;

    public Shop(){

    }

    public Shop(String street, String number) {
        this.street = street;
        this.number = number;
    }
    @Override
    public void Type(){
        System.out.println("My type is non-residential. I am Shop!");
    }
    public void Address(){
        System.out.println("I am located on " + street + " street. House number " + number);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
