package TesteMesa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double sub, x, api;
        double media;

        System.out.println("Descubra sua média de Linguagem de Programação I");

        System.out.print("Digite a nota da P1: ");
        double p1 = sc.nextDouble();
        System.out.print("Digite a nota da E1: ");
        double e1 = sc.nextDouble();
        System.out.print("Digite a nota da E2: ");
        double e2 = sc.nextDouble();


        media = (p1 + e1 + e2) / 3.0;

        if (media < 6) {
            System.out.print("Sua média parcial é menor que 6. Digite o valor da SUB: ");
            sub = sc.nextDouble();
        } else {
            System.out.println("Sua média parcial é maior que 6. Não é necessário fazer a SUB.");
            sub = 0.0;
        }

        System.out.print("Digite a nota da X: ");
        x = sc.nextDouble();
        System.out.print("Digite a nota da API: ");
        api = sc.nextDouble();

        System.out.printf("Suas notas são: P1: %.2f | E1: %.2f | E2: %.2f | SUB: %.2f | X: %.2f | API: %.2f", p1, e1, e2, sub, x, api);


        double soma = p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + x + sub * 0.15;

        double calc1 = soma * 0.5;
        double calc2 = 0.0;

        if (soma > 5.9) {
            calc2 = api * 0.5;
        }

        double resultado = calc1 + calc2;

        System.out.printf(" Resultado: %.2f", resultado);

        sc.close();
    }
}