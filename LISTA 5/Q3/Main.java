public class Main {
    public static void main(String[] args) {
        // Criando um novo contato
        Contato contato = new Contato("Pedro Elias", "pedro.elias@example.com", "9999-8888", "05/08/1995");

        // Imprimindo os dados do contato
        System.out.println("Dados do contato:");
        contato.imprimirContato();

        // Alterando o telefone do contato
        String novoTelefone = "9876-5432";
        contato.setTelefone(novoTelefone);

        // Imprimindo os dados do contato atualizados
        System.out.println("\nDados do contato atualizados:");
        contato.imprimirContato();

        // Calculando a idade do contato
        int idade = contato.calcularIdade();
        System.out.println("Idade: " + idade);
    }
}
