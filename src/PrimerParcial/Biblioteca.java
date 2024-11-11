package PrimerParcial;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
    }

    
    public void agregarPublicacion(Publicacion p) throws PublicacionYaExisteException {
        for (Publicacion pub : publicaciones) {
            if (pub.getTitulo().equals(p.getTitulo()) && pub.getAnioPublicacion() == p.getAnioPublicacion()) {
                throw new PublicacionYaExisteException("La publicación ya existe.");
            }
        }
        publicaciones.add(p);
    }

    
    public void mostrarPublicaciones() {
        for (Publicacion pub : publicaciones) {
            System.out.println(pub.toString());
        }
    }

    
    public void leerPublicaciones() {
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Leible) {
                ((Leible) pub).leer();
            } else {
                System.out.println("No se puede leer: " + pub.getTitulo());
            }
        }
    }
}
