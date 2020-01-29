import java.util.Scanner;

/**
 * Created by admin on 9/23/2
 *019.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("enter 1 or 2");
        Scanner a= new Scanner(System.in);
        switch (a.nextInt())
        {
            case 1:
                System.out.println("hala");
                break;
            case 2:
                System.out.println("oo");
                break ;
        }
    }
}
