package org.example;

public class Livro {
    private String tituloLivro;
    private Autor nomeAutor;
    private Bibliotecario nomeBibliotecario;

    public Livro(String titulo, Autor autor, Bibliotecario bibliotecario) {
        this.tituloLivro = titulo;
        this.nomeAutor = autor;
        this.nomeBibliotecario = bibliotecario;
    }

    public void emprestar(String pessoa) {
        System.out.println("O livro '" + tituloLivro + "' foi emprestado para " + pessoa + ".");
    }

    public String getTitulo() {
        return tituloLivro;
    }
}
