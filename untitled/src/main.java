import java.util.Scanner;
import java.util.Arrays;
public class main {
    static int[] numero;
    static int zuma;
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        numero = new int[3];
        numero = intro();
        zuma = suma(numero);
        System.out.println("La suma de los números " + Arrays.toString(numero) + " es: " + zuma);
    }
    public static int[] intro(){
        for (int i=0; i< numero.length;i++){
            System.out.print("Inserte el numero: ");
            numero[i] = key.nextInt();
        }
        return numero;
    }
    public static int suma(int numero[]){
        zuma = 0;
        for (int i=0; i< numero.length; i++){
            zuma += numero[i];
        }
        return zuma;
    }
}
