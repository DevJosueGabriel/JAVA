public class Teste{
    public static void main(String[] args) {
        double N1,N2,N3,N4,RES;
        System.out.println("Programa para calcular media de notas");
        System.out.println("Digite a primeira nota: ");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a segunda nota: ");
        N2 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a terceira nota: ");
        N3 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a quarta nota: ");
        N4 = Double.parseDouble(System.console().readLine());

        RES = (N1+N2+N3+N4) / 4;
        System.out.printf("A media e de: %f.2", RES);
    }
}