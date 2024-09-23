package Activitat3;

import java.util.SortedMap;

public class Act3 {
    public static void main(String[] args) {
        /*
            Escriu un programa que declari variables de tipus float, int i String. Utilitza la funció format per mostrar aquestes variables en
            una cadena de text, especificant formats adequats amb 3 decimals amb i sense signe, amb separador de milers i zeros a l'esquerra.
         */
        int v1 = 69420;
        float f1 = 69.420f;
        String st = "sample";

        //String format = String.format();

        /*
            Escriu un programa que utilitzi diverses combinacions de flags i especificadors amb printf per mostrar les variables amb
            diferents formats. Comenta cada línia de codi explicant què fa cada flag i especificador.
         */

        int v2 = 1337;
        float f2 = 55.778f;
        System.out.printf("Valor v2 = [%d]\n", v2);
        System.out.printf("Valor f2 amb 3 decimals = [%.3f]\n", f2);
    }
}
