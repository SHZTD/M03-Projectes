package Activitat2;

import java.util.Scanner;

/*
    Operacions Bàsiques: Escriu un programa que realitzi i mostri el resultat de les
    operacions següents amb dos números enters (suma, resta, multiplicació, divisió, mòdul).
 */

class OperacionsBasiques {
    public int Suma(int a, int b) {
        return a + b;
    }

    public int Resta(int a, int b) {
        return a - b;
    }

    public int Mul(int a, int b) {
        return a * b;
    }

    public int Divisio(int a, int b)
    {
        return b == 0 ? Integer.MAX_VALUE : a / b;
    }

    public int Modul(int a, int b) {
        return a % b;
    }
}

/*
    Operacions amb números en punt flotant: Escriu un fragment de codi que realitzi operacions
    amb números de tipus float i double. Comenta sobre qualsevol diferència observada.
 */

class OperacionsFlotants {
    public double Mul(double a, double b) {
        return a * b;
    }

    // 22/7 ~ PI
    public double Divisio(double a, double b) {
        return b == 0 ? Double.MAX_VALUE : a / b;
    }
}

public class Act2 {
    public static void main(String[] args) {
        OperacionsBasiques b = new OperacionsBasiques();
        OperacionsFlotants bf = new OperacionsFlotants();

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el q vols fer [*, /, +, - o %]");
        char o = sc.next().charAt(0);
        System.out.print("Donam dos numeros -> ");
        int v1 = sc.nextInt(), v2 = sc.nextInt();

        switch (o) {
            case '+':
                System.out.println(b.Suma(v1, v2));
            case '-':
                System.out.println(b.Resta(v1, v2));
            case '*':
                System.out.println(bf.Mul(v1, v2));
            case '/':
                System.out.println(bf.Divisio(v1, v2));
            case '%':
                System.out.println(b.Modul(v1, v2));
            default:
        }

        /*
            Constants i Màxims/Mínims: Utilitza les constants de la classe Math per obtenir el valor
            màxim i mínim d'un int i d'un double. Mostra aquests valors al teu programa.
         */

        // int iMax = Math.pow(2, 32) - 1;
        // double iDouble = Math.double(2, 64) - 1

        System.out.println("Constant maxima d'un int = [" + Integer.MAX_VALUE + "], constant minima = [" + Integer.MIN_VALUE + "]");
        System.out.println("Constant maxima d'un double = [" + Double.MAX_VALUE + "], constant minima = [" + Double.MIN_VALUE + "]");

        // Perquè creus que et pot servir obtenir el mínim i el màxim d'un int o un double?

        /*
            Ens permet donar limitacions del nostre programa, tambe per regular el resultat
            donades unes casuistiques.
         */
    }
}
