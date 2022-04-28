package OOP;

import sun.java2d.pipe.OutlineTextRenderer;

import java.util.Scanner;

public class Town {
    static int HOUSE = 10;
    static int CAFE = 20;
    static int OFFICE = 30;
    static int SHOP = 40;
    static int [][] streets_numbers = new int [4][4];
    static String [] streets ={"A", "B", "C", "D"};
    static String [] numbers = {"1", "2", "3", "4"};
    public static void main (String[] arg){
                    /** town map **/

        // A str.   B str.  C str.   D str.
        //  __  | |  __  | |  __  | |  __
        // |__| | | |__| | | |__| | | |__|  #1
        // _____| | _____| | _____| | _____
        //  __  | |  __  | |  __  | |  __
        // |__| | | |__| | | |__| | | |__|  #2
        // _____| | _____| | _____| | _____
        //  __  | |  __  | |  __  | |  __
        // |__| | | |__| | | |__| | | |__|  #3
        // _____| | _____| | _____| | _____
        //  __  | |  __  | |  __  | |  __
        // |__| | | |__| | | |__| | | |__|  #4

        /**set a null value in cells**/
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                streets_numbers[i][j]=0;
            }
        }
        Scanner scan = new Scanner(System.in);
        String temp = "Y";
        System.out.println("Hello! You have a guard 4*4. \n You can place House, Cafe, Office or Shop in you Town.\n Choose building type:\n House (press H), Cafe(press C), Office (press O) or Shop((press S))");

        while (temp.equals("Y")) {
            Array_method();
            System.out.println("Your Town is:");
            Printer();
            System.out.println("Do you want to change the Town? (Y/N)");
            temp = scan.nextLine();
        }
        temp = "Y";
        System.out.println("You can get some information about buildings.");
        while (temp.equals("Y")) {
            System.out.println("Enter the street (A, B, C, D):");
            String s = scan.nextLine();
            System.out.println("Enter the number (1, 2, 3, 4):");
            String n = scan.nextLine();
            WhoAreYou(s,n);
            System.out.println("Do you want to continue? (Y/N)");
            temp = scan.nextLine();
            Printer();
        }
        System.out.println("Goodbye!");
    }
    /**"Town" method**/
    public static void Array_method(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.println("What will we build at: Street \"" + streets[i]+"\" House " + numbers[j]+ "\n (House (press H), Cafe(press C), Office (press O) or Shop((press S), Nothing (press N))");
                Scanner scan = new Scanner(System.in);
                String temp = scan.nextLine();
                boolean correct = false;
                while (correct==false) {
                    if (temp.equals("N") || temp.equals("C") || temp.equals("H") || temp.equals("O") || temp.equals("S")) {
                        switch (temp){
                            case ("N"): streets_numbers[i][j]=0; break;
                            case ("C"): streets_numbers[i][j]=CAFE;break;
                            case ("H"): streets_numbers[i][j]=HOUSE;break;
                            case ("O"): streets_numbers[i][j]=OFFICE;break;
                            case ("S"): streets_numbers[i][j]=SHOP;break;
                        }
                        correct = true;
                    }else {
                        correct = false;
                        System.out.println("Invalid value! Repeat!");
                        temp = scan.nextLine();
                    }
                }

            }
        }

    }
    public static void Printer() {
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                switch (streets_numbers[i][j]){
                    case (0):  System.out.print("| | ");break;
                    case (10): System.out.print("|H| ");break;
                    case (20): System.out.print("|C| ");break;
                    case (30): System.out.print("|O| ");break;
                    case (40): System.out.print("|S| ");break;
                }
            }
            System.out.println();
        }
    }
    public static void WhoAreYou (String str, String num){
        int street=0, number=0;
        for (int i=0;i<4;i++){
            if(streets[i].charAt(0)==str.charAt(0)) street = i;
            if(numbers[i].charAt(0)==num.charAt(0)) number=i;
        }
        switch (streets_numbers[street][number]){
            case (0):
                Building none = new Building() {
                @Override
                public void Type() {
                    System.out.println("I have not a type!");
                }
                @Override
                public void Address() {
                    System.out.println("I am located on " + str + " street. House number " + num);
                }
            };
                none.Type();
                none.Address();
                break;
            case (10):
                House house = new House(str, num);
                house.Type();
                house.Address();
                break;
            case (20):
                Cafe cafe = new Cafe(str, num);
                cafe.Type();
                cafe.Address();
                break;
            case (30):
                Office office = new Office(str, num);
                office.Type();
                office.Address();
                break;
            case (40):
                Shop shop = new Shop(str, num);
                shop.Type();
                shop.Address();
                break;
        }
    }
}
