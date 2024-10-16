package org.example;

import java.util.ArrayList;

public class Bibliotecario {
    private String nomeBibliotecario;
    private ArrayList<Livro> listaLivros;

    public Bibliotecario(String nome) {
        this.nomeBibliotecario = nome;
        this.listaLivros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, Autor autor) {
        Livro livro = new Livro(titulo, autor, this);
        listaLivros.add(livro);
        autor.adicionarLivro(livro);
    }

    public void listarLivros() {
        System.out.println("Livros sob a responsabilidade de " + nomeBibliotecario + ":");
        for (Livro livro : listaLivros) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
