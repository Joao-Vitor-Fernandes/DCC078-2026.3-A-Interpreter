package padroescomportamentais.interpreter;

public class Banco {

    public static String formula = "valor * 0.02 * parcelas + valor / parcelas";

    public static double calcularParcela(double valor, int parcelas) {
        String expressao;
        expressao = formula.replace("valor", Double.toString(valor));
        expressao = expressao.replace("parcelas", Integer.toString(parcelas));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
