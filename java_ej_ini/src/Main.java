import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    // item 1 - presentacion
         /*
         String nombre = "Sandra";
         String apellido = "Dominguez";
         int edad = 54;
         System.out.println("Hola! soy " + nombre + apellido + " y tengo " + (edad) + " años.");
         */

    //item 2 - mayor de 3 nros.
        /*
        int num, n1, n2, n3;
        Scanner ingreso = new Scanner(System.in);
        System.out.println(" Mayor de tres  números");
        System.out.print("Ingrese el 1er numero: ");
        n1 = ingreso.nextInt();

        System.out.print("Ingrese 2do numero: ");
        n2 = ingreso.nextInt();

        System.out.print("Ingrese 3er numero: ");
        n3 = ingreso.nextInt();

        if (n1 > n2){
            if (n1 > n3) {
                System.out.println("El numero mayor es " + n1);
            } else {
                System.out.println("El número mayor es: " + n3);
            }
        } else if(n2 > n3){
            System.out.println("El número mayor es: " + n2);
        } else {
            System.out.println("El número mayor es: " + n3);
        }
        */

    // item 3 - paridad
        /*
        int num;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num = ingreso.nextInt();
        if (num % 2 ==0){
            System.out.println("El número ingresado es par.");
        }else{
            System.out.println("El número ingresado es impar.");
        }
        */

    //item 4 - comparacion entre cadenas
        /*
        String cad1, cad2;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese el 1er texto: ");
        cad1 = ingreso.next();
        System.out.print("Ingrese el 2do texto: ");
        cad2 = ingreso.next();
        if (cad1.equals(cad2)) {
            System.out.println("Texto 1 y Texto 2 son iguales.");
        } else {
            System.out.println("Texto 1 y Texto 2 no son iguales.");
        }
        */

    // item 5 -
        /*
        int num;
        ArrayList col = new ArrayList();
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese varios números. Para salir tipee el número cero. ");

        do {
            num = ingreso.nextInt();
            col.add(num);
        } while (num!=0);
        System.out.print("La colección contiene:  " + col);
        */

    // item 6 - Funcion Mensaje bienvenida
        /*
        Saludo();
        */

    // item 7 - Funcion Paridad
        /*
        EsPar();
        */

    // item 8 - Funcion es Primo
        /*
        EsPrimo();
        */

    // item 9 - función tipear colección de números y sume los números impares.
        SumaImpares();

    // item 10 -

    // item 11 -

    // item 12 -

    // item 13 -






    }

// item 6 - Funcion Mensaje bienvenida
    public static void Saludo() {
        System.out.println(" Bienvenidos a Java! ");
    }

// item 7 - Funcion paridad
    public static void EsPar() {
        int num;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num = ingreso.nextInt();
        if (num % 2 ==0){
            System.out.println("El número ingresado es par.");
        }else{
            System.out.println("El número ingresado es impar.");
        }
        //return
    }

// item 8 - Funcion es Primo
public static int EsPrimo() {
    Scanner ingreso= new Scanner(System.in);
    System.out.print("Ingrese un numero entero: ");
    int num = ingreso.nextInt();
    int contador= 0;

    for(int i = 1; i<= num; i++)
    {
        if((num % i) == 0)
        {
            contador++;
        }
    }
    if(contador <= 2)
    {
        System.out.println("El numero es primo");
    }else{
        System.out.println("El numero no es primo");
    }
    return num;
}

// item 9 - función tipear colección de números y sume los números impares.
public static void SumaImpares() {
    int num;
    int impar = 0;

    ArrayList col = new ArrayList();

    Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese varios números. Para salir tipee el número cero.");

    do {
            num = ingreso.nextInt();
            col.add(num);

        if (num % 2 !=0) {
            impar += num;
        }

    }while (num!=0);

    System.out.println("La colección contiene:  " + col);
    System.out.print("La suma de valores impares es:  " + impar);

}




      }








