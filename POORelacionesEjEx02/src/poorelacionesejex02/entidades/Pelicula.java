package poorelacionesejex02.entidades;

public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;
    private int edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadMinima=" + edadMinima + '}';
    }
    
}
