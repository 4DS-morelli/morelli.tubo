
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int altezza, raggio;
        double volume, superficie;
        System.out.print("Inserisci il raggio: ");
        raggio=input.nextInt();
        System.out.print("Inserisci l'altezza: ");
        altezza=input.nextInt();

        Tubo t1= new Tubo(altezza, raggio);

        volume= t1.volume();
        superficie=t1.superficieTot();

        System.out.print("Il volume del tubo è: " + volume + " e la superficie totale del tubo è: " + superficie);


    }
}