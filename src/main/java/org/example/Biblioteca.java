package org.example;

public class Biblioteca {
    public static void main(String[] args) {
        // Criar autores
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("George R.R. Martin");

        // Criar bibliotecário
        Bibliotecario bibliotecario = new Bibliotecario("Carlos");

        // Cadastrar livros
        bibliotecario.cadastrarLivro("Harry Potter e a Pedra Filosofal", autor1);
        bibliotecario.cadastrarLivro("As Crônicas de Gelo e Fogo", autor2);

        // Listar livros
        bibliotecario.listarLivros();

        // Emprestar um livro
        Livro livroEmprestado = new Livro("Harry Potter e a Pedra Filosofal", autor1, bibliotecario);
        livroEmprestado.emprestar("Alice");
    }
}
