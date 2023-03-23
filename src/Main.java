import javax.swing.*;
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
            switch(selected) {
                case 1:
                    ingresoDatos();
                    break;
                case 2:
                    sismoMayorMagnitud();
                    break;
                case 3:
                    sismoMayo5();
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
    public static void ingresoDatos(){
        
    }
    public static void sismoMayorMagnitud(){

    }
    public static void sismoMayo5(){

    }

    public static void enviarSMS(){

    }
    public static void salir(){

    }
}