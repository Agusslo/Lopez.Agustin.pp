package PrimerParcial;

public class Libro extends Publicacion implements Leible {
    private String autor;
    private Genero genero;

    public Libro(String titulo, int anioPublicacion, String autor, Genero genero) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo el libro: " + getTitulo());
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Genero: " + genero;
    }
}
