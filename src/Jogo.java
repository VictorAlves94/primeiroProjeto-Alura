import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tentativas = 1;
        int numero = 0;
        int numeroGerado = new Random().nextInt(100);


        System.out.println("Foi gerado um numero aleatorio entre 1 e 100, voce tem 5 chances para acertar e algumas dicas. Agora digite um numero ");
        numero = teclado.nextInt();

        while (numeroGerado != numero && tentativas <= 4 ){

            if (numero > numeroGerado) {
                System.out.println("essa foi a tentativa " + tentativas + " e infelizmente voce errou, tente novamente, o numero é menor!");

            }else{
                System.out.println("essa foi a tentativa " + tentativas + " e infelizmente voce errou, tente novamente, o numero é maior!");
            }
            numero = teclado.nextInt();
            tentativas = tentativas +1;
        }
        if (numeroGerado == numero) {
            System.out.println("Parabéns você Acertou o numero!!! VENCEDOR " + numeroGerado);
        } else{
            System.out.println("Infelizmente você perdeu, tente novamente. O numero era : " + numeroGerado);
        }
    }
}
