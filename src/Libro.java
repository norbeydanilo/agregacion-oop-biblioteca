public class Libro {
    // Atributos privados — nadie los puede tocar directamente desde afuera
    private String titulo;
    private String autor;
    private boolean disponible;

    // --- CONSTRUCTORES ---

    // Constructor vacío: el libro queda disponible por defecto
    public Libro() {
        disponible = true;
    }

    // Constructor con título y autor: disponible por defecto
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Constructor completo: recibe todos los datos
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // --- GETTERS ---

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // --- SETTERS ---

    public void setTitulo(String titulo) {
        // No aceptamos títulos vacíos
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: el título no puede estar vacío.");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // --- MÉTODOS ---

    // Imprime los datos del libro en consola
    public void mostrarInfo() {
        System.out.println("---- Libro ----");
        System.out.println("Título   : " + titulo);
        System.out.println("Autor    : " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    // Marca el libro como prestado
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
            return false;
        }
    }

    // Marca el libro como devuelto
    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto.");
    }
}
