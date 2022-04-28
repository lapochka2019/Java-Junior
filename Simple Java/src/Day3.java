import java.util.Scanner;

public class Day3 {
    public static void main (String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ex1: enter the name of city");
        String city = scan.nextLine();
        while (!city.equals("Stop")){
            Ex1(city);
            System.out.println("Enter the text (Stop)");
            city = scan.nextLine();
        }
        System.out.println("Finished.");

        System.out.println("Ex2:");
        while (true){
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if (b==0)break;
            System.out.println(a/b);
        }

        System.out.println("Ex3:");
        int i = 0;
        while (i<5){
            i++;
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if (b==0){
                System.out.println("Деление на 0!");
                continue;
            }
            System.out.println(a/b);
        }
    }


    private static void Ex1(String city) {
        switch (city){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
            break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
            break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
            break;
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
            break;
            default:
                System.out.println("Unknown!");
        }
    }


}
