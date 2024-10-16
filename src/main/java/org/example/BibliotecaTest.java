package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Autor;
import org.example.Bibliotecario;
import org.example.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {
 private Autor autor;
 private Bibliotecario bibliotecario;
 private Livro livro;

 @BeforeEach
 void setUp() {
  autor = new Autor("J.K. Rowling");
  bibliotecario = new Bibliotecario("Carlos");
  livro = new Livro("Harry Potter e a Pedra Filosofal", autor, bibliotecario);

  // Cadastrando o livro no bibliotecário e no autor
  bibliotecario.cadastrarLivro(livro.getTitulo(), autor);
 }

 @Test
 void testCadastrarLivro() {
  assertEquals(1, autor.getLivros().size());
  assertEquals("Harry Potter e a Pedra Filosofal", autor.getLivros().get(0).getTitulo());
 }

 @Test
 void testEmprestarLivro() {
  livro.emprestar("Alice");
  // Verifica se a mensagem foi impressa corretamente (ou pode-se fazer outra forma de teste)
  // Neste caso, não há um retorno a ser verificado, mas pode-se adicionar lógica para
  // capturar a saída se necessário.
 }
}
