import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();
        
        while (x != 0 && y!=0){
        if (x == 0 && y == 0){
            break;
        }
        else if(x>0 && y>0){
            System.out.println("primeiro");
        }
        else if(x<0 && y>0){
            System.out.println("segundo");
        }
        else if(x<0 && y<0){
            System.out.println("terceiro");
        }
        else if(x>0 && y<0){
            System.out.println("quarto");
        }
        x = sc.nextInt();
        y = sc.nextInt();
    }
    
    }
 
}
