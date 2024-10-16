package org.example;

import java.util.ArrayList;

public class Autor {
    private String nomeAutor;
    private ArrayList<Livro> listaLivro;

    public Autor(String nome) {
        this.nomeAutor = nome;
        this.listaLivro = new ArrayList<>();
    }

    public String getNome() {
        return nomeAutor;
    }

    public void adicionarLivro(Livro livro) {
        listaLivro.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return listaLivro;
    }
}
