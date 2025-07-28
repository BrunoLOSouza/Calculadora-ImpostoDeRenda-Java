import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do seu salario: " );
        double renda, imp1, imp2, imp3;
        renda = sc.nextDouble();
        imp1 = (renda - 2000.0) * 0.08;
        imp2 = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        imp3 = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        if (renda >=0.00 && renda <=2000.00) {
            System.out.println("Voce está isento!");
        } else if (renda >=2000.01 && renda <=3000.00) {
            System.out.printf("valor do seu imposto de renda é: %.2f R$%n", imp1);
        } else if (renda >=3000.01 && renda <=4500.00) {
            System.out.printf("valor do seu imposto de renda é: %.2f R$%n", imp2);
        } else if (renda >4500.00) {
            System.out.printf("valor do seu imposto de renda é: %.2f R$%n", imp3);
        }

        sc.close();
    }
}