public class OperadorTernario {
    public static void main(String[] args) {
        int a = 30, b = 40, maiorNum = 0;

        // o operador ternário é usado para verificar qual valor é maior: a ou b
        // a expressão (a > b) ? a : b verifica se a é maior que b
        // se for (a>b) seja true, o valor de a é atribuído à variável maior
        // caso contrário, o valor de b é atribuído à variável maior
        maiorNum = (a > b) ? a : b;

        System.out.println("O maior número é: " + maiorNum);
    }
}
