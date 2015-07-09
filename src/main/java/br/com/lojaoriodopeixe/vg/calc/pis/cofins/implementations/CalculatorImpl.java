package br.com.lojaoriodopeixe.vg.calc.pis.cofins.implementations;

import br.com.lojaoriodopeixe.vg.calc.pis.cofins.interfaces.Calculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Classe para os objetos do tipo Calculator, onde serão contidos os métodos
 * para o mesmo.
 *
 * @author Vagner Barbosa (contato@vagnerbarbosa.com)
 *
 * @since 07/06/2015
 *
 * @version 1.0
 */
public class CalculatorImpl implements Calculator {

    /* Constante com o valor BigDecimal que representa a alíquota do PIS não-cumulativo de 1,65% */
    private static final BigDecimal PIS = new BigDecimal("0.0165");
    /* Constante com o valor BigDecimal que representa a alíquota do COFINS não-cumulativo de 7,60% */
    private static final BigDecimal CONFINS = new BigDecimal("0.076");

    /* Construtor Padrão */
    public CalculatorImpl() {
    }

    /* Metódo que calcula o valor do PIS não-cumulativo com base no valor do tipo BigDecimal informado */
    @Override
    public BigDecimal getPIS(BigDecimal value) {
        return value.multiply(PIS).setScale(2, RoundingMode.UP);
    }

    /* Metódo que calcula o valor do COFINS não-cumulativo com base no valor do tipo BigDecimal informado */
    @Override
    public BigDecimal getCONFINS(BigDecimal value) {
        return value.multiply(CONFINS).setScale(2, RoundingMode.UP);
    }

    /* Metódo que calcula o valor a soma de uma lista de BigDecimal informado */
    @Override
    public BigDecimal getTotalValue(List<BigDecimal> values) {
        BigDecimal sum = new BigDecimal("0");
        for (BigDecimal i : values) {
            sum = sum.add(i);
        }
        return sum.setScale(2, RoundingMode.UP);
    }
}
