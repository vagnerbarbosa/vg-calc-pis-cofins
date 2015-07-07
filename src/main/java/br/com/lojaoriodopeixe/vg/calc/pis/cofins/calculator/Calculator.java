package br.com.lojaoriodopeixe.vg.calc.pis.cofins.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Classe para os objetos do tipo Calculator, onde serão contidos os métodos
 * para o mesmo.
 *
 * @author vagner
 * @version 0.01
 */
public class Calculator {

    public Calculator() {
    }

    private static final BigDecimal PIS = new BigDecimal("0.0165");
    private static final BigDecimal CONFINS = new BigDecimal("0.076");

    public BigDecimal getPIS(BigDecimal value) {
        return value.multiply(PIS).setScale(2, RoundingMode.UP);
    }

    public BigDecimal getCONFINS(BigDecimal value) {
        return value.multiply(CONFINS).setScale(2, RoundingMode.UP);
    }

    public BigDecimal getTotalValue(List<BigDecimal> values) {
        BigDecimal sum = new BigDecimal("0");
        for (BigDecimal i : values) {
            sum = sum.add(i);
        }
        return sum.setScale(2, RoundingMode.UP);
    }

}
