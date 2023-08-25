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



        /* na classificação usamos a media da nota que vai
         de 0 a 10 , para avaliar em ate 5 estrelas
         então convertemos para inteiro e dividimos por 2
        */
        int classificacao = (int) (media /2);
        System.out.println(classificacao);


        double tempGrausCelsius = 30.4;
        double tempFahrenheit = (tempGrausCelsius * 1.8) + 32;
        String mensage = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", tempGrausCelsius, tempFahrenheit);
        System.out.println(mensage);

        int tempFahrenheitInteira = (int) (tempGrausCelsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit inteira é: " + tempFahrenheitInteira);
    }
}