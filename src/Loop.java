import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De uma nota para o filme");
            nota = teclado.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Media de avaliação" + mediaAvaliacao/3);

    }
}
