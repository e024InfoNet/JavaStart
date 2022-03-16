package br.com.albertoferes.infonet.javastart.metodos;

import br.com.albertoferes.infonet.javastart.metodos.naoestaticos.TextoUtils;

public class PlatgroundTexto {

    public static void main(String[] args) {
        final String texto = "INTERNET";
        TextoUtils objetoTextoUtils = new TextoUtils();

        int tamanho = objetoTextoUtils.obterTamanhoDoTexto(texto);
        System.out.println("O texto " + texto + " possui " + tamanho + " caracteres");

        System.out.println(objetoTextoUtils.paraCaixaAlta("sAo bErnardo do CamPo"));

        System.out.println(objetoTextoUtils.paraCaixaBaixa("sAo bErnardo do CamPo"));
    }
}
