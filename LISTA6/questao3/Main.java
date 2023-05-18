public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Pedro", "pedro@example.com", "123456789", "01/01/1990");
        Contato contato2 = new Contato("Karina", "karina@example.com", "987654321", "15/06/1985");

        System.out.println("Contato 1:");
        contato1.imprimirContato();
        System.out.println("Idade do Contato 1: " + contato1.calcularIdade() + " anos");

        System.out.println();

        System.out.println("Contato 2:");
        contato2.imprimirContato();
        System.out.println("Idade do Contato 2: " + contato2.calcularIdade() + " anos");

        System.out.println();

        // Testando setters
        contato2.setNome("Karina Silva");
        contato2.setEmail("karinasilva@example.com");
        contato2.setTelefone("987654321");
        contato2.setDataNascimento("15/06/1985");

        System.out.println("Contato 2 apos alteracoes:");
        contato2.imprimirContato();
        System.out.println("Idade do Contato 2: " + contato2.calcularIdade() + " anos");
    }
}
