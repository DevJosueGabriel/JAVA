public class diferencaNumero {
    public static void main(String[] args){
        double n1, n2, dif;
        System.out.println("Digite o primeiro numero: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o segundo numero: ");
        n2 = Double.parseDouble(System.console().readLine());
        dif = n1 - n2;
        if(n1 == n2) {
            System.out.print("Os dois numeros sao iguais");
        }
    else{
        System.out.printf("A diferenca dos dois valores e: %.1f", dif );
    }
    }

}