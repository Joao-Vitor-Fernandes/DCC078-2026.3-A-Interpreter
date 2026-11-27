package padroescomportamentais.interpreter;

public class Emprestimo {
    private double valor;
    private int parcelas;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double calcularParcela() {
        return Banco.calcularParcela(this.valor, this.parcelas);
    }
}
