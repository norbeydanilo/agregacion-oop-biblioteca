public class App {
    public static void main(String[] args) throws Exception {
       // Los libros se crean FUERA de la biblioteca — agregación
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez");
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry");

        // Se crea la biblioteca y se le agregan los libros
        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Ángel Arango");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel García Márquez");
        System.out.println();
        biblioteca.buscarPorAutor("Jorge Luis Borges");
    }
}
