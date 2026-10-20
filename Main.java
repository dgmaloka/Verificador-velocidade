import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o limite da via?");
        int limite = entrada.nextInt();
        while (limite <= 0) {
            System.out.println("Limite inválido! Digite novamente: ");
            limite = entrada.nextInt();
        }

        System.out.println("Digite sua velocidade: ");
        int velocidade = entrada.nextInt();
        while (velocidade < 0) {
            System.out.println("Velocidade inválida! Digite novamente: ");
            velocidade = entrada.nextInt();
        }

        if (velocidade < limite) {
            System.out.println("Velocidade baixa!");
        } else if (velocidade == limite) {
            System.out.println("Velocidade correta!");
        } else if (velocidade <= limite * 1.1) {
            System.out.println("Atenção! Você está perto do limite!");
        } else {
            System.out.println("Perigo!!! Acima da velocidade!");
            int excesso = velocidade - limite;
            System.out.println("Você ultrapassou a velocidade em: " + excesso + "Km/h");
        }

        entrada.close();
    }
}
