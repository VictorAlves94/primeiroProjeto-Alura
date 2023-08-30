import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1){
            System.out.println("De uma nota para o filme ou -1 para incerrar");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }
        if (nota != 0) {
            System.out.println("Media de avaliação : " + mediaAvaliacao / totalNotas);
        }

    }
}
