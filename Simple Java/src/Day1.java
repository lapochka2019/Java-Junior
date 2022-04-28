public class Day1 {
    public static void main (String args[]){
        Ex1();
        System.out.println();
        Ex2();
        System.out.println();
        Ex3();
        System.out.println();
        Ex4();
        System.out.println();
        Ex5();
        System.out.println();
        Ex6();
    }
    public static void Ex1(){
        int i=0;
        while (i!=10){
            System.out.print("Java ");
            i++;
        }
    }
    public static void Ex2(){
        for (int i=0;i<10;i++){
            System.out.print("Java ");
        }
    }
    public static void Ex3(){
        for (int i=0;i<10;i++){
            System.out.println("Java ");
        }
    }
    public static void Ex4(){
        int year = 1980;
        while (year<=2020){
            System.out.println("Олимпиада "+year+" года");
            year+=4;
        }
    }
    public static void Ex5(){
        for (int i=1980;i<=2020;i+=4){
            System.out.println("Олимпиада "+i+" года");
        }
    }
    public static void Ex6(){
        for (int i=1;i<10;i++){
            System.out.println(i + " * " + 5 + " = " + i*5);
        }
    }
}
