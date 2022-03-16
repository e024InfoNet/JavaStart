package br.com.albertoferes.infonet.javastart.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritmeticos [ + - * / % ]
        int a = 10, b = 3;
        System.out.printf("%d + %d = %d\n", a, b, (a + b));
        System.out.printf("%d - %d = %d\n", a, b, (a - b));
        System.out.printf("%d * %d = %d\n", a, b, (a * b));
        System.out.printf("%d / %d = %d\n", a, b, (a / b));
        System.out.printf("%d %% %d = %d\n\n", a, b, (a % b));

        // Operadores Relacional [ > < >= <= == !=]
        System.out.printf("%d > %d = %B\n", a, b, (a > b));
        System.out.printf("%d < %d = %B\n", a, b, (a < b));
        System.out.printf("%d >= %d = %B\n", a, b, (a >= b));
        System.out.printf("%d <= %d = %B\n", a, b, (a <= b));
        System.out.printf("%d == %d = %B\n", a, b, (a == b));
        System.out.printf("%d != %d = %B\n\n", a, b, (a != b));

        // Operadores Logicos [ E OU NAO XOU - && || ˆ !]
        /*
        Tabela Verdade E
        V E V = V
        V E F = F
        F E V = F
        F E V = F

        expressao-logica ? instrução-01 : instrução-02;

         */
        System.out.printf("V E V = %s\n", (true && true ? "V" : "F"));
        System.out.printf("V E F = %s\n", (true && false ? "V" : "F"));
        System.out.printf("F E V = %s\n", (false && true ? "V" : "F"));
        System.out.printf("F E F = %s\n\n", (false && false ? "V" : "F"));

        System.out.printf("V OU V = %s\n", (true || true ? "V" : "F"));
        System.out.printf("V OU F = %s\n", (true || false ? "V" : "F"));
        System.out.printf("F OU V = %s\n", (false || true ? "V" : "F"));
        System.out.printf("F OU F = %s\n\n", (false || false ? "V" : "F"));

        System.out.printf("V XOU V = %s\n", (true ^ true ? "V" : "F"));
        System.out.printf("V XOU F = %s\n", (true ^ false ? "V" : "F"));
        System.out.printf("F XOU V = %s\n", (false ^ true ? "V" : "F"));
        System.out.printf("F XOU F = %s\n\n", (false ^ false ? "V" : "F"));

        System.out.printf("NÃO V = %s\n", (!true ? "V" : "F"));
        System.out.printf("NÃO F = %s\n\n", (!false ? "V" : "F"));

        // Operadores pos-incremento/pre-decremento [++ -- += -= *= /= %=]
        int incremento = 1;
        System.out.printf("++incremento = %d\n", (++incremento));

        // soma = 10;
        // soma = soma + valor;
        // soma += valor;

        int total = 1000;
        total++;
        System.out.printf("\ntotal++ = %d\n", total);
        total--;
        System.out.printf("total-- = %d\n", total);
        total *= 2 ;
        System.out.printf("total *= 2 = %d\n", total);
        total /= 2 ;
        System.out.printf("total /= 2 = %d\n", total);
        total %= 3 ;
        System.out.printf("total %%= 3 = %d\n", total);
    }
}
