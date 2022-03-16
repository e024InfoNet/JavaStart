package br.com.albertoferes.infonet.javastart.controle;

import java.io.IOException;
import java.util.Calendar;

import static java.util.Calendar.*;

public class EstruturasDeControle {
    private static int month;
    //Requisitos - PHP, Java, C#

    public static void main(String[] args) throws IOException {
        boolean dominaPHP = true;
        boolean dominaJava = true;
        boolean dominaCSharp = true;

        boolean isCandidatoElegivel = dominaPHP && dominaJava && dominaCSharp;

        if(isCandidatoElegivel) {
            //Executamos quando a condicao é verdadeira
            System.out.println("É um candidato promissor, devemos marcar uma entrevista.");
        } else {
            //Executamos quando a condicao é falsa
            System.out.println("Não compativel com a vaga.");
        }

        int a = 30;
        int b = 10;
        int c = 20;

        if (a > b && a > c) {
            System.out.println(a +" é o maior.");
        } else {
            if (b > c) {
                System.out.println(b +" é o maior.");
            } else {
                System.out.println(c +" é o maior.");
            }
        }



        char caracter = 'ç';

        switch (caracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É uma vogal");
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("É um algarismo.");
                break;
            default:
                System.out.println("É uma consoante ou caracter especial.");
                break;
        }

        Runtime.getRuntime().exec("clear");
    }
}
