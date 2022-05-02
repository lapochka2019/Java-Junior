package Day6;

public class Airplane {
    String Manufacture;
    static int Year;
    static int Length;
    static int Weight;
    static int Fuel=0;

    Airplane(String Manufacture,int Year, int Length, int Weight){
        this.Manufacture = Manufacture;
        this.Year = Year;
        this.Length = Length;
        this.Weight = Weight;
    }
    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public void setFuel(int Fuel) {
        this.Fuel = Fuel;
    }

    public int getFuel() {
        return Fuel;
    }
    public void info(){
        System.out.println("Изготовитель: " + Manufacture + ", год выпуска: " + Year + ", длина: " + Length + ", вес: " + Weight
                + ", количество топлива в баке: " + Fuel);
    }
    public void fillUp(int n){
        setFuel(Fuel+n);
    }
}
