public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.8;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("lançamento que estão curtindo");
        } else {
            System.out.println("Filme retrô");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Não inclui no plano");
        }
    }
}
