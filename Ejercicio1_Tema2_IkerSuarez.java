import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = sc.nextLine();

        System.out.println("Nombre: " + nombre);


        //Leer caracter
        System.out.println("Introduce un caracter");
        char letra = sc.next().charAt(0);
        System.out.println("Letra: " + letra);

        //Leer entero
        System.out.println("Introduce entero");
        int num = sc.nextInt();
        System.out.println("Entero: " + num);

        //Leer long
        System.out.println("Introduce entero long");
        long num2 = sc.nextLong();
        System.out.println("Long: " + num2);

        //Leer double
        System.out.println("Introduce entero double");
        double num3 = sc.nextDouble();
        System.out.println("Double: " + num3);

    }
}