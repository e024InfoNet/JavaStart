package br.com.albertoferes.infonet.javastart;

import br.com.albertoferes.infonet.javastart.metodos.estaticos.MateMagica;
import br.com.albertoferes.infonet.javastart.metodos.naoestaticos.TextoUtils;

public class Main {
    public static void main(String[] args) {
        double rq = MateMagica.raizQuadrada(81);
        double m12 = MateMagica.calcularMultiploDe(10, 12);

        String lorem = "Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...Lorem ipsum dolor sit amet...";

        TextoUtils tu = new TextoUtils();

        int tamanhoStingLorem = tu.obterTamanhoDoTexto(lorem);
    }
}
