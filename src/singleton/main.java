package singleton;

import javax.swing.*;

public class main {
    public static void main(String[] args){
        // LE SINGLETON VISE A RENVOYER TOUJOURS LA MÊME INSTANCE DE NOTRE OBJET POUR TOUTE L'APPLICATION
        TomateSingleton tomata1 =  TomateSingleton.getInstance();
        System.out.println(tomata1.getQuantite());
        TomateSingleton tomata2 =  TomateSingleton.getInstance();
        System.out.println(tomata2.getQuantite());
        TomateSingleton tomata3 =  TomateSingleton.getInstance();
        System.out.println(tomata1.getQuantite());
        System.out.println(tomata2.getQuantite());
        System.out.println(tomata3.getQuantite());
        /*
            PROMPT ATTENDU
            39
            38
            37
            37
            37
         */
    }
}
