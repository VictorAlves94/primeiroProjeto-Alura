public class Main {
    public static void main(String[] args) {

        System.out.println("esse é o Screen Match");
        System.out.println("Top Gun: MAVERICK ");
        // incluindo ano de lançamento, nota do filme e sinopse
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento : " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
         double media = (9.8 + 6.3 + 8.00) /3;

        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                muito bom!
                Ano de lançamento : 
                """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}