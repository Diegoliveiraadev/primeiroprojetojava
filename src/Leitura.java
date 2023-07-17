import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme");
        String filme = leitura.nextLine();
        System.out.println("Qual ao de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação de 0 a 10");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme + anoDeLancamento + avaliacao);
    }
}
