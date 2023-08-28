import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do seu filme favorito");
        String nomeFilme = teclado.nextLine();

        System.out.println("Qual o ano de lançamento");
        int anoFilme = teclado.nextInt();
        System.out.println("Avalie o filme");
        double avaliacao = teclado.nextDouble();



        System.out.println(nomeFilme);
        System.out.println(anoFilme);
        System.out.println(avaliacao);

    }
}
