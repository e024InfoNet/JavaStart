package br.com.albertoferes.infonet.javastart.metodos;

import br.com.albertoferes.infonet.javastart.metodos.estaticos.MateMagica;

public class PlaygroundMateMagica {
    public static void main(String[] args) {
        //Calcular o dobro de um valor
        double dobroDeDez = MateMagica.calcularDobro(10D);
        System.out.println(dobroDeDez);
    }
}
