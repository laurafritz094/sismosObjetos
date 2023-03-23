import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int menuInt = menu();
        menuOpciopnes(menuInt);
    }

    public static int  menu(){
        Scanner sc = new Scanner(System.in);
        System. out. println("1.- Ingreso de datos");
        System. out. println("2.- Mostrar sismo de mayor magnitud");
        System. out. println("3.- Contar sismos mayores o iguales a 5.0");
        System. out. println("4.- Enviar SMS por cada sismo mayor o igual a 7.0");
        System. out. println("5.- Salir (S/N)");

        System. out. println("ingrese numero de opcion de menu: " );
        int menuInt= sc.nextInt();
        return menuInt;
    }

    public static void menuOpciopnes(int selected) {
        double matriz[][] = ingresoDatos();

            switch(selected) {
                case 1:
                    matriz=ingresoDatos();
                    break;
                case 2:
                    Double maximo = sismoMayorMagnitud(matriz);
                    break;
                case 3:
                    int mayores5 = sismoMayo5(matriz);
                    break;
                case 4:
                    enviarSMS();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    System.out.println("elija una opcion valida");

            }
    }
    public static double[][]  ingresoDatos(){
        DecimalFormat  formato = new DecimalFormat("#.0");
        double matriz[][] = new double[7][24];
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = (Double) (Math.random()*9.9);
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            System.out.println();
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("["+matriz[x][y]+"]");
            }
        }
    return matriz;
    }
    public static Double sismoMayorMagnitud(double matriz[][]){
        Double mayor = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    return mayor;
    }
    public static int sismoMayo5(double matriz[][]){
        int cont=0;
        double sismo5= 5.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > sismo5) {
                    cont ++;
                }
                System.out.print( "contador de sismos mayores que 5 "+sismo5);  }
            System.out.println();
        }
        return cont;

    }

    public static void enviarSMS(){

    }
    public static void salir(){

    }
}