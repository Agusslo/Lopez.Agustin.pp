package PrimerParcial;

public abstract class Publicacion {
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    
    public String toString() {
        return "Titulo: " + titulo + ", Anio: " + anioPublicacion;
    }
}
