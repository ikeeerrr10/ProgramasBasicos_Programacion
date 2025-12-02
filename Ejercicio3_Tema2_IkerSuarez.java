import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Ejercicio1

        int num=teclado.nextInt();

        if(num==1){
            System.out.println("El número es 1");

        }else{
            if(num==2) {
                System.out.println("El número es 2");

            }else{
                System.out.println("Es otro número distinto de uno y dos");
            }
            }

        //Ejercicio2

        int edad1 = teclado.nextInt();
        int edad2 = teclado.nextInt();

        if (edad1 < edad2) {
            System.out.println("Soy más joven que mi compañero");
        }else if (edad1 > edad2){
            System.out.println("Mi compañero es más joven que yo");
        } if(edad1==edad2){
            System.out.println("Somos de la misma edad");
        }


        //Ejercicio3

        float presion= teclado.nextFloat();
        if(presion>2){
            presion=--presion;
            System.out.println("Abrir válvula de seguridad");
            System.out.println("La presión es:"+presion);

        }else{
            teclado.nextLine();
            String nombre= teclado.nextLine();
            System.out.println("Todo está bien "+nombre);
        }


        //Ejercicio4
        int temp1 = teclado.nextInt();
        int temp2 = teclado.nextInt();
        teclado.nextLine();
        String clima = teclado.nextLine();

        if (temp1 > 20 && clima.equals("llueve")) {
            System.out.println("Hace calor pero está lloviendo");
            int suma = temp1 + temp2;
            System.out.println("Entre ayer y hoy la temperatura fue de: " + suma + "ºC");
            int suma2 = temp1 + 5;
            System.out.println("Mañana habrá: " + suma2 + "ºC");

        } else if (temp1 <= 20) {
            System.out.println("Parece que llega el otoño");
        }
        if (clima.equals("sol")) {
            System.out.println("Pero luce el sol");
        } else if (clima.equals("llueve")) {
            System.out.println("y llueve");
        }

    }
}



