package br.com.albertoferes.infonet.javastart.periodo;

import org.apache.logging.log4j.core.AbstractLifeCycle;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static java.time.Month.JANUARY;

public class PeriodoHoroscopo {

    /*

    Áries 21 de março à 20 de abril -> 21/03 a 30/04

    Touro 21 de abril à 20 de maio

    Gêmeos 21 de maio à 20 de junho

    Câncer 21 de junho à 21 de julho

    Leão 22 de julho à 22 de agosto

    Virgem 23 de agosto à 22 de setembro

    Libra 23 de setembro à 22 de outubro

    Escorpião 23 de outubro à 21 de novembro

    Sagitário 22 de novembro à 21 de dezembro

    Capricórnio 22 de dezembro à 20 de janeiro -> 01/01 a 20/01

    Aquário 21 de janeiro à 19 de fevereiro -> 21/01 a 19/02

    Peixes 20 de fevereiro à 20 de março -> 20/02 a 20/03

    JAN -> Cap/Aqu
    FEV -> Aqu/Pei
    MAR -> Ari/Tou
    ABR -> Tou/Gem
    MAI -> Gem/Can
    JUN -> Can/Leo
    JUL -> Leo/Vir
    AGO -> Vir/Lib
    SET -> Lib/Esc
    OUT -> Esc/Sag
    NOV -> Sag/Cap
     */
    public static void main(String[] args) {

        Period period = Period.between(LocalDate.of(2021, 3, 21), LocalDate.of(2021, 4, 20));


        int days = period.getDays();

        LocalDate inicio = LocalDate.of(2021, 3, 21);
        LocalDate fim = LocalDate.of(2021, 4, 20);

        LocalDate data = LocalDate.of(2021, 4, 21);

        boolean aries = data.isAfter(inicio.minusDays(1)) && data.isBefore(fim.plusDays(1));



        System.out.println(inicio);
        System.out.println(fim);
        System.out.println(data);


        System.out.println("Aries: "+aries);

        /*
        JAN -> Cap/Aqu
        FEV -> Aqu/Pei
        MAR -> Ari/Tou
        ABR -> Tou/Gem
        MAI -> Gem/Can
        JUN -> Can/Leo
        JUL -> Leo/Vir
        AGO -> Vir/Lib
        SET -> Lib/Esc
        OUT -> Esc/Sag
        NOV -> Sag/Cap
                */
        int mes = 12;
        int dia = 25;

        LocalDate dataAtual = LocalDate.of(LocalDate.now().getYear(), mes, dia);

        System.out.println("Mes: "+mes);


        if(mes == 12 && dia >= 22 || mes == 1 && dia <= 20) {
            System.out.println("Capricornio");
        } else if(mes == 1 && dia >= 21 || mes == 2 && dia <= 19) {
            System.out.println("Aquário");
        }

    }

    private static void definirSigno(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.of(LocalDate.now().getYear(),
                dataNascimento.getMonthValue(),
                dataNascimento.getDayOfMonth());

        switch (dataAtual.getMonth()) {
            case JANUARY:

        }
    }
}
