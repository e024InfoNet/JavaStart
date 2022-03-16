package br.com.albertoferes.infonet.javastart.metodos.naoestaticos;

import java.util.Locale;

public class TextoUtils {

    public int obterTamanhoDoTexto(String texto) {
        return texto.length();
    }

    public String paraCaixaAlta(String texto) {
        return texto.toUpperCase(Locale.ROOT);
    }

    public String paraCaixaBaixa(String texto) {
        return texto.toLowerCase(Locale.ROOT);
    }
}
