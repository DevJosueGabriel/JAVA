public class TesteSaida {
    public static void main(String[] args) {
    double num,quad;
    num = Double.parseDouble(System.console().readLine());
    quad = num * num;
    System.out.printf("%f ao quadrado e %f\n",num,quad);
    }
}