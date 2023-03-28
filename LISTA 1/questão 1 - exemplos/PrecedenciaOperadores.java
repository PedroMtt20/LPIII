public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 2;
        int resultado1 = a + b * c; // primeiro multiplica b por c e depois soma com a
        int resultado2 = (a + b) * c; // primeiro soma a com b e depois multiplica o resultado por c
        int resultado3 = a / b + c; // primeiro divide a por b e depois soma com c
        int resultado4 = a % b * c; // primeiro encontra o resto da divisão de a por b e depois multiplica o resultado por c

        System.out.println("Resultado 1: " + resultado1); // imprime 25
        System.out.println("Resultado 2: " + resultado2); // imprime 30
        System.out.println("Resultado 3: " + resultado3); // imprime 2
        System.out.println("Resultado 4: " + resultado4); // imprime 10
    }
}
