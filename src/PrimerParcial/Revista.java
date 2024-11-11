package PrimerParcial;

public class Revista extends Publicacion implements Leible {
    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion, int numeroEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo la revista: " + getTitulo());
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de edicion: " + numeroEdicion;
    }
}
