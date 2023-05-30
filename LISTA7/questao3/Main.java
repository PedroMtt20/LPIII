
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Data
        Data data = new Data();

        // Definindo uma data utilizando o método setData
        data.setData(25, 5, 2023);

        // Imprimindo a data formatada
        System.out.println("Data: " + Data.dayToPrintShort(data));
        System.out.println("Data por extenso: " + Data.dayToPrintLong(data));
        System.out.println("Dia da semana: " + Data.dayOfWeek(data));

        // Verificando se o ano é bissexto
        System.out.println("Ano bissexto: " + Data.isBisexto(data));

        // Obtendo o número de dias até o final do ano
        System.out.println("Dias ate o final do ano: " + Data.howManyDaysUntilEndYear(data));

        // Obtendo o número de dias até o próximo mês
        System.out.println("Dias ate o proximo mes: " + Data.howManyDaysUntilNextMonth(data));
    }
}
