package Day6;

import Day5.Car;

public class Main {
public static void main(String [] arg) {
    Airplane airplane = new Airplane("Manuf", 2000, 8, 1000);
    airplane.info();
    airplane.fillUp(50);
    airplane.info();
    System.out.println("***");
    Student student = new Student("Mark");
    Teacher teacher = new Teacher("Ira","English");
    teacher.Evolute(student);
    teacher.Evolute(student);
    teacher.Evolute(student);
    }
}
