import java.util.Scanner;

public class App {

    public static String[] vetor(){
        String[] texto = new String[3];

        for(int i = 0; i < texto.length; i++){
            texto[i] = "1";
        }

        return texto;
    }

    public static int texto(String textoAqui){
        System.out.println("Teste aqui");
        System.out.println(textoAqui);

        int variavel = 1;

        return variavel;
    }

    public static void nomeSobrenome(String nome, String sobrenome){
        System.out.println("Olá, " + nome + " " + sobrenome);
        return;
    }

    public static void testeUm(String nome){
        System.out.println("Hello World!" + nome);
        int texto = texto("Olá");
        System.out.println(texto);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        testeUm("Daniel");
        String[] teste = vetor();
        for(int i = 0; i < 3; i++){
            System.out.println(teste[i]);
        }

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = leitor.nextLine();

        nomeSobrenome(nome, sobrenome);
    }
}
