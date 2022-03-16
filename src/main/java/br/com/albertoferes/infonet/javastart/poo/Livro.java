package br.com.albertoferes.infonet.javastart.poo;

import java.util.Locale;

public class Livro {

    //Atributos
    String isbn;
    String titulo;
    String editora;
    Integer anoPublicacao;
    String autor;
    String resumo;

    //Comportamentos

    //Metodo construtor de classe
    public Livro(String isbn, String titulo, String editora, Integer anoPublicacao,String autor, String resumo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.resumo = resumo;
    }

    public void exibirDadosDoLivro() {
        System.out.println("\n\nISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Autor: " + autor);
        System.out.println("Resumo: " + resumo);
    }

    public String getTitulo() {
        return this.titulo.toUpperCase(Locale.ROOT);
    }
}
