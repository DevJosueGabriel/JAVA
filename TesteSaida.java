public class TesteSaida {
    public static void main(String[] args) {
    double num,quad;
    num = Double.parseDouble(System.console().readLine());
    quad = num * num;
    System.out.printf("%.0f ao quadrado e %.0f\n",num,quad);
    }
}