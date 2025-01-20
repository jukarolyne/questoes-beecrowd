import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String wordConsulte;
        int quant;
        
        wordConsulte = sc.next();
        
        quant = wordConsulte.length();
        
        if (10<= quant && quant <= 20){
            System.out.println("palavrao");
        }
        
        else if (1<= quant && quant < 10){
            System.out.println("palavrinha");
        }
        
        else{
            System.out.println("ERRO");
        }
 
    }
 
}
