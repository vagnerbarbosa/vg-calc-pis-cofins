package br.com.lojaoriodopeixe.vg.calc.pis.cofins.interfaces;

import java.math.BigDecimal;
import java.util.List;

/**
 * Interface para os objetos do tipo Calculator, onde serão contidos as
 * assinaturas para o mesmo.
 *
 * @author Vagner Barbosa (contato@vagnerbarbosa.com)
 *
 * @since 07/06/2015
 *
 * @version 0.9
 */
public interface Calculator {

    public BigDecimal getPIS(BigDecimal value);

    public BigDecimal getCONFINS(BigDecimal value);

    public BigDecimal getTotalValue(List<BigDecimal> values);

}
