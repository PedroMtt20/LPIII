public class Main {
    public static void main(String[] args) {
        // cria uma instância de Time com a hora atual
        Time agora = new Time(12, 30, 0);

        // imprime a hora atual
        System.out.print("Agora e: ");
        agora.prnTime();

        // adiciona 10 segundos e imprime a hora atualizada
        agora.addSeconds(10);
        System.out.print("10 segundos depois: ");
        agora.prnTime();

        // cria uma outra instancia de Time
        Time outraHora = new Time(22, 15, 0);

        // calcula a diferenca em segundos entre as duas horas
        int diferenca = agora.cron(outraHora);
        System.out.println(
                "Diferenca em segundos entre " + agora.getTime() + " e " + outraHora.getTime() + ": " + diferenca);

        // verifica se a hora atual e AM ou PM
        if (agora.isAm()) {
            System.out.println("Agora e AM");
        } else {
            System.out.println("Agora e PM");
        }

        // tenta definir uma hora invalida (hora > 24) e imprime a hora atualizada
        agora.setTime(25, 0, 0);
        System.out.print("Hora apos tentar definir uma hora invalida: ");
        agora.prnTime();

    }
}
