package OOP;

public class Town {
    static int HOUSE = 10;
    static int CAFE = 20;
    static int OFFICE = 30;
    static int SHOP = 40;
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

        int [][] streets_numbers = new int [4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                streets_numbers[i][j]=0;
            }
        }
        System.out.println("Hello! You have a guard 4*4. \n You can place House, Cafe, Office or Shop in you Town.\n Choose building type:\n House (press H), Cafe(press C), Office (press O) or Shop((press S))");


    }
}
