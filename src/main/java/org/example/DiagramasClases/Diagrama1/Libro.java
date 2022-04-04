package org.example.DiagramasClases.Diagrama1;

public class Libro {
    private String isbn;
    private String titulo;
    private Genero genero;
    private String[] autors;

    public Libro(String isbn, String titulo, Genero genero, String[] autors) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.genero = genero;
        this.autors = autors;
    }

    public String getIsbn() {
        return isbn;
    }
}
