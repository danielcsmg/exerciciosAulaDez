import java.util.Scanner;

public class exercicioUmMetodo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int num = leitor.nextInt();

        leitor.close();

        int resultadoDoSomatorio = somatorio(num);

        System.out.println(resultadoDoSomatorio);
    }

    public static int somatorio (int numDigitado){
        int soma = 0;
        for(int i = 0; i <= numDigitado; i++){
            soma += i;
        }
        return soma;
    }
}
