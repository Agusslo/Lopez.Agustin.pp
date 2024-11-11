package PrimerParcial;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear instancias de publicaciones
            Libro libro1 = new Libro("El senior de los anillos", 1954, "J.R.R. Tolkien", Genero.FICCION);
            Revista revista1 = new Revista("National Geographic", 2023, 123);

            // Crear instancia de la biblioteca
            Biblioteca biblioteca = new Biblioteca();

            // Agregar publicaciones
            biblioteca.agregarPublicacion(libro1);
            biblioteca.agregarPublicacion(revista1);

            // Mostrar publicaciones
            biblioteca.mostrarPublicaciones();

            // Leer publicaciones
            biblioteca.leerPublicaciones();
        } catch (PublicacionYaExisteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
