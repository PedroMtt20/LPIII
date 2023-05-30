// package LISTA7.questao5;

public class Main {
    public static void main(String[] args) {
        double valorGramas = 500;

        // Convertendo de gramas para outras unidades
        double valorKg = ConversorUnidade.gramasParaKg(valorGramas);
        System.out.println(valorGramas + " gramas = " + valorKg + " kg");

        double valorLibras = ConversorUnidade.gramasParaLibras(valorGramas);
        System.out.println(valorGramas + " gramas = " + valorLibras + " libras");

        double valorOnças = ConversorUnidade.gramasParaOnças(valorGramas);
        System.out.println(valorGramas + " gramas = " + valorOnças + " onças");

        // Convertendo de kg para outras unidades
        double valorGramas2 = ConversorUnidade.kgParaGramas(valorKg);
        System.out.println(valorKg + " kg = " + valorGramas2 + " gramas");

        double valorLibras2 = ConversorUnidade.kgParaLibras(valorKg);
        System.out.println(valorKg + " kg = " + valorLibras2 + " libras");

        double valorOnças2 = ConversorUnidade.kgParaOnças(valorKg);
        System.out.println(valorKg + " kg = " + valorOnças2 + " onças");

        // Convertendo de libras para outras unidades
        double valorGramas3 = ConversorUnidade.librasParaGramas(valorLibras);
        System.out.println(valorLibras + " libras = " + valorGramas3 + " gramas");

        double valorKg2 = ConversorUnidade.librasParaKg(valorLibras);
        System.out.println(valorLibras + " libras = " + valorKg2 + " kg");

        double valorOnças3 = ConversorUnidade.librasParaOnças(valorLibras);
        System.out.println(valorLibras + " libras = " + valorOnças3 + " onças");

        // Convertendo de onças para outras unidades
        double valorGramas4 = ConversorUnidade.onçasParaGramas(valorOnças);
        System.out.println(valorOnças + " onças = " + valorGramas4 + " gramas");

        double valorKg3 = ConversorUnidade.onçasParaKg(valorOnças);
        System.out.println(valorOnças + " onças = " + valorKg3 + " kg");

        double valorLibras3 = ConversorUnidade.onçasParaLibras(valorOnças);
        System.out.println(valorOnças + " onças = " + valorLibras3 + " libras");
    }
}
