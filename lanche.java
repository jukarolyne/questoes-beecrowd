import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String total;
        int cod, quant;
        
        cod = sc.nextInt();
        quant = sc.nextInt();
        
        switch(cod){
            case 1: 
                total = df.format(4.00*quant);
                System.out.println("Total: R$ " + total);
                break;
            case 2:
                total = df.format(4.50*quant);
                System.out.println("Total: R$ " + total);
                break;
            case 3:
                total = df.format(5.00*quant);
                System.out.println("Total: R$ " + total);
                break;
            case 4:
                total = df.format(2.00*quant);
                System.out.println("Total: R$ " + total);
                break;
            case 5:
                total = df.format(1.50*quant);
                System.out.println("Total: R$ " + total);
                break;
            default:
                break;
        }
    }
 
}
