import java.util.Random;

public class losowanie {


    //colors to print
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String[] osoby={"Just", "Random", "People", "Here"}; //String array to draw from.

        int length=osoby.length;
        int[] byly = new int[length];
        Random r = new Random();



        for(int i=0; i<length;){ //iterating for array length

            int x=r.nextInt(length);
            if(byly[x]==0) {
                System.out.print(ANSI_RED+osoby[x]+ANSI_RESET+"->"); //printing /w color
                byly[x] = 1;
                i++; //good iteration is when the element is not repeated
            }
        }
    }
}
