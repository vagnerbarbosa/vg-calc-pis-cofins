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
 * @version 1.1
 */
public interface Calculator {
    
    /**
     * Metódo que calcula o valor do PIS não-cumulativo com base no valor do tipo BigDecimal informado.
     * @param value Valor a ser informado para o calculo do PIS
     * @return Valor do PIS
    **/
    public abstract BigDecimal getPIS(BigDecimal value);
    
    /**
     * Metódo que calcula o valor do COFINS não-cumulativo com base no valor do tipo BigDecimal informado.
     * @param value Valor a ser informado para o calculo do COFINS
     * @return Valor do CONFINS
    **/
    public abstract BigDecimal getCONFINS(BigDecimal value);

    /**
     * Metódo que calcula o valor da soma de uma lista de BigDecimal.
     * @param values Parametro que de ser passado contendo uma lista de valores do tipo BigDecimal
     * @return Valor da soma dos valores
    **/            
    public abstract BigDecimal getTotalValue(List<BigDecimal> values);

}
