public class Delta {
    public static void main(String[] args){
        double A,B,C,D;
        
        System.out.print("Digite o valor de A: ");
        A = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o valor de B: ");
        B = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o valor de C: ");
        C = Double.parseDouble(System.console().readLine());

        D = B * B - 4 * A * C;
        System.out.printf("%1f", D);

        if(D < 0) {
            System.out.print("A equacao nao possui raizes reais.");
        }
        if(D > 0) {
            System.out.print("A equacao possui duas raizes reais.");
        }
            else {
                System.out.print("A equacao possui uma unica raiz.");
            }
        }
    }
