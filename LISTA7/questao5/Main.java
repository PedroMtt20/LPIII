// package LISTA7.questao5;

public class Main {
    public static void main(String[] args) {
        double valorGramas = 500;

        double valorKg = ConversorUnidade.gramasParaKg(valorGramas);
        double valorLibras = ConversorUnidade.gramasParaLibras(valorGramas);
        double valorOnças = ConversorUnidade.gramasParaOnças(valorGramas);

        System.out.println(valorGramas + " gramas equivalem a:");
        System.out.println(valorKg + " kg");
        System.out.println(valorLibras + " libras");
        System.out.println(valorOnças + " oncas");

        System.out.println();

        double valorGramasConvertido = ConversorUnidade.kgParaGramas(valorKg);
        double valorLibrasConvertido = ConversorUnidade.kgParaLibras(valorKg);
        double valorOnçasConvertido = ConversorUnidade.kgParaOnças(valorKg);

        System.out.println(valorKg + " kg equivalem a:");
        System.out.println(valorGramasConvertido + " gramas");
        System.out.println(valorLibrasConvertido + " libras");
        System.out.println(valorOnçasConvertido + " oncas");

        System.out.println();

        double valorLibras2 = 10;

        double valorGramas2 = ConversorUnidade.librasParaGramas(valorLibras2);
        double valorKg2 = ConversorUnidade.librasParaKg(valorLibras2);
        double valorOnças2 = ConversorUnidade.librasParaOnças(valorLibras2);

        System.out.println(valorLibras2 + " libras equivalem a:");
        System.out.println(valorGramas2 + " gramas");
        System.out.println(valorKg2 + " kg");
        System.out.println(valorOnças2 + " oncas");

        System.out.println();

        double valorOnças3 = 100;

        double valorGramas3 = ConversorUnidade.onçasParaGramas(valorOnças3);
        double valorKg3 = ConversorUnidade.onçasParaKg(valorOnças3);
        double valorLibras3 = ConversorUnidade.onçasParaLibras(valorOnças3);

        System.out.println(valorOnças3 + " onças equivalem a:");
        System.out.println(valorGramas3 + " gramas");
        System.out.println(valorKg3 + " kg");
        System.out.println(valorLibras3 + " libras");
    }
}
