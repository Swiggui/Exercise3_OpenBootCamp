import java.util.Scanner;
import java.util.Arrays;
public class main {
    static int[] numero;
    static int zuma, doors, option;
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        numero = new int[3];
        numero = intro();
        zuma = suma(numero);
        System.out.println("La suma de los números " + Arrays.toString(numero) + "es: " + zuma);
        //Parte 2
        cars();
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

    public static void cars() {
        System.out.println("Puertas del auto");
        while (true){
            coche miCoche = new coche();
            doors = miCoche.increaseDoors();
            System.out.println("El coche tiene " + doors + " puertas.");
            System.out.println("¿Desea añadir mas puertas? \n1.Si\n2.No");
            option = key.nextInt();
            if (option != 1){
                break;
            }
        }
    }
}
