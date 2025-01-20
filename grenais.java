import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int golInter, golGrem, repit, grenais, empate = 0, winInter = 0, winGrem = 0;
        
        golInter = sc.nextInt();
        golGrem = sc.nextInt();
        System.out.println("Novo grenal (1-sim 2-nao)");
        repit = sc.nextInt();
        
        while(repit == 1){
            golInter = sc.nextInt();
            golGrem = sc.nextInt();
        
        if(golInter > golGrem){
            winInter++;
        }
        else if(golInter < golGrem){
            winGrem++;
        }
        else{
            empate++;
        }
            System.out.println("Novo grenal (1-sim 2-nao)");
            repit = sc.nextInt();
        }
        
        if(golInter > golGrem){
            winInter++;
        }
        else if(golInter < golGrem){
            winGrem++;
        }
        else{
            empate++;
        }
        
        grenais = winInter+winGrem+empate;
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + winInter);
        System.out.println("Gremio:" + winGrem);
        System.out.println("Empates:" + empate);
        
        if(winInter>winGrem){
            System.out.println("Inter venceu mais");
        }
        else if(winGrem>winInter){
            System.out.println("Gremio venceu mais");
        }
        else{
            System.out.println("Nao houve vencedor");
        }
    }
 
}
            System.out.println("Nao houve vencedor");
        }
    }
 
}
