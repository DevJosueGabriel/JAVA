public class mediaNotas01 {
    public static void main(String[] args) {
        double n1,n2,n3,n4, soma = 0, media = 0;

        System.out.print("Digita a primeira nota: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digita a segunda nota: ");
        n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Digita a terceira nota: ");
        n3 = Double.parseDouble(System.console().readLine());
        System.out.print("Digita a quarta nota: ");
        n4 = Double.parseDouble(System.console().readLine());
        soma = n1+n2+n3+n4;
        media = soma/4;
        System.out.printf("A media da turma foi de: " + media);

        if(media <= 5) {
            System.out.print("\nA turma esta abaixo da media.");
        }
        else {
            System.out.print("\n A turma esta acima da media");
        }

    }
}