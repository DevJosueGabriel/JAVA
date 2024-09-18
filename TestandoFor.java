



public class TestandoFor {
    public static void main(String[] args) throws Exception {
        String nomes[];
        nomes = new String[5];

        int idade[];
        idade = new int[5];

        String profissao[];
        profissao = new String[5];

        for(int i = 0; i <5; i++) {
         System.out.println("Nome " + (i+1) + ": ");
         nomes[i]=(System.console().readLine());
         System.out.println("Idade " + (i+1) + ": ");
         idade[i]=Integer.parseInt(System.console().readLine());
         System.out.println("Profissao " + (i+1) + ": "); 
         profissao[i]=(System.console().readLine());
        } 

        for(int cont = 0; cont < 5;cont++) {
            System.out.println("Nome " + (cont+1) + ": " + nomes[cont]);
            System.out.println("Idade " + (cont+1) + ": " + idade[cont]);
            System.out.println("Profissao " + (cont+1) + ": " + idade[cont] + "\n");
        }
    }
}