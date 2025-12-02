import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre");
        String nombre=sc.nextLine();
        System.out.println("El nombre es:"+nombre);

        System.out.println("Introduce apellidos");
        String apellidos=sc.nextLine();
        System.out.println("Los apellidos son:"+apellidos);

        System.out.println("Introduce edad");
        int edad=sc.nextInt();
        System.out.println("La edad es:"+edad);

        System.out.println("Introduce nota");
        double nota1=sc.nextDouble();
        System.out.println("La nota en el módulo de programación es: "+nota1);

        System.out.println("Introduce nota");
        double nota2=sc.nextDouble();
        System.out.println("La nota en el módulo de base de datos es: "+nota2);

        System.out.println("Introduce nota");
        double nota3=sc.nextDouble();
        System.out.println("La nota en el módulo de entornos de desarrollo es: "+nota3);

        double notaMedia=(nota1+nota2+nota3)/3;
        System.out.println("El alumno  cuyo nombre es "+nombre+" y apellidos son "+apellidos+" tiene una nota media de: "+notaMedia);



    }

}