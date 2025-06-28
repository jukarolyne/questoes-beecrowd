import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine(); 
        String[] entradaSeparada = entrada.split(" ");
        int hInicio = Integer.parseInt(entradaSeparada[0]); 
        int minInicio = Integer.parseInt(entradaSeparada[1]); 
        int hFinal = Integer.parseInt(entradaSeparada[2]);
        int minFinal = Integer.parseInt(entradaSeparada[3]); 
        int HMinI = hInicio*60 + minInicio; 
        int HMinF = hFinal*60 + minFinal;
        int tempoH;
        int tempoMin;
        int diferenca;
        
        if (hInicio == hFinal && minInicio == minFinal){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        
        else if (HMinI <= HMinF){
            diferenca = HMinF - HMinI;
            tempoH = (diferenca)/60;
            tempoMin = (diferenca)%60;
            System.out.println("O JOGO DUROU " + tempoH + " HORA(S) E " + tempoMin + " MINUTO(S)");
        }
        else{
            diferenca = (24*60 - HMinI) + HMinF;
            tempoH = (diferenca)/60;
            tempoMin = (diferenca)%60;
            System.out.println("O JOGO DUROU " + tempoH + " HORA(S) E " + tempoMin + " MINUTO(S)");
        }       
    }
}
