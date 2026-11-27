package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    @Test
    void deveCalcularParcelaComFormula() {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setValor(1000.0);
        emprestimo.setParcelas(10);

        assertEquals(120.0, emprestimo.calcularParcela(), 0.01);
    }

}
