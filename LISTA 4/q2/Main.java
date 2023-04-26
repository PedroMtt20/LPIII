public class Main {
    public static void main(String[] args) {

        // Criando um objeto da classe Contato
        Contato contato = new Contato();

        // Inicializando o contato com informações
        contato.inicializarContato("Pedro Elias", "pedroSantiago88@gmail.com", "999999999", "31/10/2002");

        // Imprimindo as informações do contato
        System.out.println("Informacoes do contato:");
        contato.imprimirContato();

        // Calculando a idade do contato
        int idade = contato.calcularIdade();
        System.out.println("Idade: " + idade);

        // Alterando o email do contato
        contato.setEmail("pedromtt322@gmail.com");
        System.out.println("Email atualizado: " + contato.getEmail());

    }
}