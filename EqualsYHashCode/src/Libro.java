import java.util.Objects;

public class Libro {

    //Variables en private.
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        setAnio(anio);
        setAutor(autor);
        setTitulo(titulo);
    }

    //Getters y Setters.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo==null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de haber titulo");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor==null || autor.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de haber autor");
        }
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anio == libro.anio && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anio);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                '}';
    }
}