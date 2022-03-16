package br.com.albertoferes.infonet.javastart.poo;

public class IntroPOO {
    public static void main(String[] args) {

        Livro livro1 = new Livro(
                "123456",
                "A Sociedade do Anel",
                "AltaBooks",
                1950,
                "J. R. R. Tolkien",
                "\"Em uma terra fantástica e única, um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso, o hobbit Frodo tem um caminho árduo pela frente, onde encontra perigo, medo e seres bizarros. Ao seu lado para o cumprimento desta jornada, ele aos poucos pode contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando nove seres que formam a Sociedade do Anel.\"");

        Livro livro2 = new Livro(
        "789456",
        "As Duas Torres",
        "AltaBooks",
        1953,
        "J. R. R. Tolkien",
        "O confronto final entre as forças do bem e do mal que lutam pelo controle do futuro da Terra Média se aproxima. Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf e Pippin partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden em Rohan, em mais uma tentativa de deter as forças de Sauron. Enquanto isso, Frodo, Sam e Gollum seguem sua viagem rumo à Montanha da Perdição para destruir o anel.");

        livro2.exibirDadosDoLivro();

        Livro livro3 = new Livro(
                "987456",
                "O Retorno do Rei",
                "Altabooks",
                1956,
                "J. R. R. Tolkien",
                "O confronto final entre as forças do bem e do mal que lutam pelo controle do futuro da Terra Média se aproxima. Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf e Pippin partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden em Rohan, em mais uma tentativa de deter as forças de Sauron. Enquanto isso, Frodo, Sam e Gollum seguem sua viagem rumo à Montanha da Perdição para destruir o anel.");

        livro1.exibirDadosDoLivro();
        livro2.exibirDadosDoLivro();
        livro3.exibirDadosDoLivro();

    }

}
