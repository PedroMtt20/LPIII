public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.inicializarContato("Pedro Elias", "pedromt@gmail.com", "73991079313", "25/04/2002");
        contato.imprimirContato();
        System.out.println("Idade: " + contato.calcularIdade());
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Email: " + contato.getEmail());
    }
}
