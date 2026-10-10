
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, x ,contador = 1 ;

        x = scanner.nextInt();

       for(i = x ; contador <= 6 ; i = i + 1){
           if(i % 2 != 0){
               System.out.println(i);
               contador = contador + 1;
           }
       }

    }
}
