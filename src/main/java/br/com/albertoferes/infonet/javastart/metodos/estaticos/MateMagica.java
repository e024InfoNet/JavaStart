package br.com.albertoferes.infonet.javastart.metodos.estaticos;

public class MateMagica {
    //Criar metodos auxialiares que facilitarao o uso de calculos simples

    //visibilidade modificador retorno identificador(TipoParametro parametro) { corpo do metodo}

    //Funcoes MateMagicas
    public static double calcularDobro(double valor) {
        return valor * 2;
    }

    public static double calcularTriplo(double valor) {
        return valor * 3;
    }

    public static double calcularMultiploDe(double valor, double multiplo) {
        return valor * multiplo;
    }

    public static double raizQuadrada (double valor) {
        return Math.sqrt(valor);
    }

    public static double maiorDeDoidValores(double valorA, double valorB) {
        return Math.max(valorA, valorB);
    }

}
