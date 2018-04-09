package minmaxprumer;

import java.util.Scanner;

public class MinMaxPrumer {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in, "CP1250");
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       
       int pocet = 1, soucet = 0;
       while (true) {
           System.out.println("Input "+pocet+" number :");
           // vstup od uživatele (z klávesnice) do proměnné vstup
           int vstup = sc.nextInt();
           //když vloží nulu, přerušíme smyčku
           if (vstup == 0) break;
           soucet = soucet + vstup;
           // když vložíme číslo menší, než min, zapamatujeme si ho
           if(vstup < min) min = vstup;
           // když vložíme číslo větší, než max, zapamatujeme si ho
           if(vstup > max) max = vstup;
           
           System.out.println("nejmenší zatím vložené čislo: "+min);
           System.out.println("největší zatím vložené čislo: "+max);
           System.out.println("průměr: "+((float) soucet/pocet));
           pocet++;
        }
    }   
}
