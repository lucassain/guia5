public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int copias;
    private int ID=0;
    private static int contador=0;


    public Libro(String titulo, String autor, double precio, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;
        contador=contador+1;
        this.ID = contador;
    }

    public Libro() {
        contador=contador+1;
        this.ID = contador;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getID() {
        return ID;
    }

    public static int getContador() {
        return contador;
    }

    /*Un método que permita vender una cierta cantidad de copias de un libro, disminuyendo
        la cantidad disponible. Si no hay suficientes copias, debe mostrar un
        mensaje indicando que la operación no es posible.*/

    public Boolean venta (int cantCompra){
        if (cantCompra<=copias){
            this.copias=copias-cantCompra;
            return true;
        }else {
            return false;
        }
    }

    public int IncrementarCopias(int cantIncrementar){

        this.copias=copias+cantIncrementar;

        return copias;

    }

    public void MostrarDetalles(){

        System.out.println("Libro: ");
        System.out.println("Id: "+ID);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Precio: "+precio);
        System.out.println("Copias disponibles: "+copias);

    }

}

