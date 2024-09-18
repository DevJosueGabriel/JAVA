public class TesteIdade {
    public static void main(String[] args) {
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = (System.console().readLine());
        System.out.println("Digite sua idade: ");
        idade = Integer.parseInt(System.console().readLine());

        System.out.printf("Seu nome e: "+ nome + " e sua idade e: "+ idade);

        if(idade>=18) {
            System.out.println("\nVoce e maior de idade.");
        }
        else {
            System.out.println("\nVoce e menor de idade.");
        }
    }
}