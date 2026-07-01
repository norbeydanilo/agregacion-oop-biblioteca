public class Biblioteca {
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;


    // --- CONSTRUCTOR ---

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new Libro[10];  // máximo 10 libros
        this.cantidad = 0;
    }


    // --- GETTER ---

    public String getNombre() {
        return nombre;
    }


    // --- MÉTODOS ---

    // Agrega un libro que ya existe (creado fuera) — agregación
    public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("Libro \"" + libro.getTitulo() + "\" agregado al catálogo.");
        } else {
            System.out.println("El catálogo está lleno. No se puede agregar más libros.");
        }
    }

    // Imprime todos los libros del catálogo
    public void mostrarCatalogo() {
        System.out.println("=== Catálogo: " + nombre + " ===");
        if (cantidad == 0) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                catalogo[i].mostrarInfo();
                System.out.println();
            }
        }
    }

    // Busca libros por autor e imprime los que coincidan
    public void buscarPorAutor(String autor) {
        System.out.println("Libros de \"" + autor + "\":");
        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println("  - " + catalogo[i].getTitulo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("  No se encontraron libros de ese autor.");
        }
    }
}
