public class faixa {
    public static void main(String[] args){
        double num;

        System.out.print("Digite o numero: ");
        num = Double.parseDouble(System.console().readLine());
        
        if(num>= 1 && num<= 9) {
            System.out.print("O numero esta na faixa permitida.");
        }
        else {
            System.out.print("O numero esta fora da faixa permitida.");
        }
    }
}