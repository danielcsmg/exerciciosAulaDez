import java.util.Scanner;

public class exercicioDoisMetodo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String meuNome = leitor.nextLine();

        leitor.close();

        System.out.println(apresentarNome(meuNome));
    }

    public static String apresentarNome(String nome){
        return "Meu nome é " + nome;
    }
}
