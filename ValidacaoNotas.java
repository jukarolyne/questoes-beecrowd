import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double nota, notacont, media;
        int control = 2;
        
        notacont = 0.0;
        
        while(control > 0){
            nota = sc.nextDouble();
            if(nota<0 || nota>10){
                System.out.println("nota invalida");
            }
            else{
                control--;
                notacont+=nota;
            }
        }
        
        media = (notacont)/2;
        String med = df.format(media);
        System.out.println("media = " + med);
        
    }
 
}
