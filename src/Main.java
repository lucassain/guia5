import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int opcion;
        final double PI=3.14159;

        Libro nuevoLibro=new Libro("El Quijote", "Miguel de Cervantes", 500, 10);
        Libro nuevoLibro2=new Libro("Cien Años de Soledad", "Gabriel García Márquez", 700, 5);

        do {
            System.out.println("Ejercicio 1: ");
            System.out.println("Ejercicio 2: ");
            System.out.println("Ejercicio 3: ");
            System.out.println("Ejercicio 4: ");
            System.out.print("Ingrese una opcion: ");
            opcion=entrada.nextInt();

            switch (opcion){
                case 0:{
                    System.out.println("Cerrando programa...");
                    break;
                }

                case 1:{
                    /*Realizar un programa que lee por teclado el valor del radio de una circunferencia, calcula y
        muestra por pantalla la longitud y el área de la circunferencia. Cálculo de longitud: 2 * PI * radio,
        cálculo de área: PI * radio^2. Usar la clase Math.
         */

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
                    /* Realizar un programa que calcula el volumen de una esfera. El valor de
                    radio se debe pedir por teclado. Cálculo: volumen = 4/3 * PI * radio^3. Usar la clase Math.*/

                    System.out.println("Ingrese el valor del radio: ");
                    double radio=entrada.nextDouble();

                    double volumen=4.0/3.0*PI*(Math.pow(radio,3));

                    System.out.println("El volumen de la esfera es: "+volumen);


                    break;
                }

                case 4:{
                    int opcion2;

                    do {

                        System.out.println("=====SISTEMA DE LIBRERIA=====");
                        System.out.println("Comprar copias del primer libro (1)");
                        System.out.println("Incrementar copias del primer libro (2)");
                        System.out.println("Mostrar detalles del primer libro (3)");
                        System.out.println("Comprar copias del segundo libro (4)");
                        System.out.println("Incrementar copias del segundo libro (5)");
                        System.out.println("Mostrar detalles del segundo libro (6)");
                        System.out.println("Salir (0)");
                        System.out.println("Ingrese una opcion: ");
                        opcion2=entrada.nextInt();

                        switch (opcion2){
                            case 0:{
                                System.out.println("Cerrando programa...");
                                break;
                            }

                            case 1:{

                                System.out.println("Ingrese la cantidad de copias que desea comprar: ");
                                int cantCompra=entrada.nextInt();

                                boolean resultado=nuevoLibro.venta(cantCompra);

                                if (resultado==true){
                                    System.out.println("Se han vendido "+cantCompra+ " copias con exito!");
                                    System.out.println("Cantidad actual de copias: "+nuevoLibro.getCopias());
                                }else {

                                    System.out.println("Cantidad no disponible");
                                    System.out.println("Quedan: "+nuevoLibro.getCopias()+ " copias");
                                }

                                break;
                            }

                            case 2:{

                                System.out.println("Ingrese la cantidad para incremnetar las copías: ");
                                int cantIncrementar= entrada.nextInt();

                                int copiasInc=nuevoLibro.IncrementarCopias(cantIncrementar);
                                System.out.println("Cantidad de copias actual: "+nuevoLibro.getCopias());

                                break;
                            }

                            case 3:{

                                nuevoLibro.MostrarDetalles();

                                break;
                            }

                            case 4:{

                                System.out.println("Ingrese la cantidad de copias que desea comprar: ");
                                int cantCompra=entrada.nextInt();

                                boolean resultado=nuevoLibro2.venta(cantCompra);

                                if (resultado==true){
                                    System.out.println("Se han vendido "+cantCompra+ " copias con exito!");
                                    System.out.println("Cantidad actual de copias: "+nuevoLibro2.getCopias());
                                }else {

                                    System.out.println("Cantidad no disponible");
                                    System.out.println("Quedan: "+nuevoLibro2.getCopias()+ " copias");
                                }

                                break;
                            }

                            case 5:{

                                System.out.println("Ingrese la cantidad para incrementar las copías: ");
                                int cantIncrementar= entrada.nextInt();

                                int copiasInc=nuevoLibro2.IncrementarCopias(cantIncrementar);
                                System.out.println("Cantidad de copias actual: "+nuevoLibro2.getCopias());

                                break;
                            }

                            case 6:{

                                nuevoLibro2.MostrarDetalles();

                                break;
                            }

                            default:{

                                System.out.println("Opcion invalida. Ingrese otra opcion.");

                                break;
                            }
                        }

                    }while (opcion2!=0);


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