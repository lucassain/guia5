import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ejercicio 1: ");
            System.out.println("Ejercicio 2: ");
            System.out.println("Ejercicio 3: ");
            System.out.println("Ejercicio 4: ");
            System.out.print("Ingrese una opcion: ");
            opcion=entrada.nextInt();

            switch (opcion){
                case 0:{
                    System.out.println("Cerrando programa....");
                    break;
                }

                case 1:{
                    /*Realizar un programa que lee por teclado el valor del radio de una circunferencia, calcula y
        muestra por pantalla la longitud y el área de la circunferencia. Cálculo de longitud: 2 * PI * radio,
        cálculo de área: PI * radio^2. Usar la clase Math.
         */
                    final double PI=3.14159;

                    System.out.println("Ingrese el valor del radio de la circunferencia: ");
                    double radio= entrada.nextDouble();

                    double longitud=2*PI*radio;
                    System.out.println("Longitud: "+longitud);

                    double area=Math.pow(radio,2)*PI;

                    System.out.println("El area es: "+area);

                    break;
                } case 2:{

                    /*Realizar un programa que lea la longitud de los catetos de un triángulo
                     rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
                     Usar la clase Math.
                     */

                    System.out.println("Ingrese la longitud de cateto1: ");
                    double cateto1=entrada.nextDouble();

                    System.out.println("Ingrese la longitud del cateto2: ");
                    double cateto2=entrada.nextDouble();

                    double hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));

                    System.out.println("La hipotenusa es: "+hipotenusa);

                    break;
                }
                case 3:{



                    break;
                }

                default:{
                    System.out.println("Opcion invalida. Ingrese de nuevo");
                    break;
                }
            }

        }while (opcion!=0);
        System.out.println("Programa finalizado.");
    }
}