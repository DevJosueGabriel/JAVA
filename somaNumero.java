public class somaNumero{
    public static void main(String[] args) {
        double num, soma;
        soma = 0;
        for(double i = 1;i<=10;i++) {
            System.out.printf("Digite o " + i + " numero: ");
            num = Double.parseDouble(System.console().readLine());
            soma = soma + num;
        }
        System.out.printf("O valor da soma e: %.0f \n", soma);
    }
}