import java.io.*;
import java.util.*;
class Calculadora{
    public static void main(String[] args) {
        double n1 = Calculadora.recibirNum("número 1");
        double d1 = Calculadora.recibirNum("número 2");
        double resultado = Calculadora.calcularFrac(n1, d1);
        Calculadora.imprimirFrac(resultado);
    }
    public static double recibirNum(String numero){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el " + numero + ":");
        double num = in.nextInt();
        return num;
    }
    public static double calcularFrac(double numero1, double numero2){
        double result = numero1 / numero2;
        return result;
    }
    public static void imprimirFrac(double resultado){
        System.out.println("El resultado de la fracción de ambos números es: " + resultado);
    }
}