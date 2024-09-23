package Activitat1;

/*
byte = -128 / 127, 4 bits
short = -32768 / 32767, 8 bits
char = 8 bit -> \u0000
int = 32 bit -> -(2^32) + 1 / 2^32 - 1 -> 1337
long = 64 bit -> -(2^64) + 1 / 2^64 - 1 -> 123L
float = single floating point precision -> 1.345f
double = double floating point precision -> 1.000012d o 1.234e2
bool = true / false
string = text
*/

public class Act1 {
    public static void main(String[] args) {
        // declaració de variables
        byte b = 0x1A;
        short sh = 32767;
        char c = 's';
        int n = 1337;
        long lv = 9223372036854775807L;
        float f = 123.99994f;
        double d = 194.111e+24d;
        boolean x = true;
        String text = "i am a text";

        // conversion ahora
        System.out.println("Valor 1337 (int) a double = " + returnDouble(n));
        // el valor pasa a ser sense ningun problema a double perque es un nombre enter, i de moment
        // es respecten els bits de memoria
        System.out.println("Valor 194.111e+24d (double) a int = " + returnInt(d));
        // al ser de doble precisio i amb mols numeros al davamt, es possible que no es trunqui correctament
        // el valor
    }

    static double returnDouble(int i) {
        // implicit casting
        return (double)i;
    }

    static int returnInt(double i) {
        // implicit casting
        return (int)i;
    }
}
