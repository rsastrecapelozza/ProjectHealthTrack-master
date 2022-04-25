package br.com.fiap.health.track;

import java.time.LocalDate;

/**
 * Classe de domínio da entidade de relatório da saúde
 */
public class RelatorioDeSaude {

    private String statusPressao;
    private int idOperacaoSaude;
    private LocalDate dtOperacaoSaude;
    private double valorPeso;
    private double valorPressaoSistolica;
    private double valorPressaDiastolica;


    /**
     * @param idOperacaoSaude       Id da operação do relatório
     * @param dtOperacaoSaude       Data de montagem do relatório
     * @param valorPeso             Valor do peso da pessoa
     * @param valorPressaDiastolica Valor da pressão diastólica da pessoa
     * @param valorPressaoSistolica Valor da pressão sistólica da pessoa
     */
    public RelatorioDeSaude(int idOperacaoSaude, LocalDate dtOperacaoSaude, double valorPeso,
                            double valorPressaoSistolica, double valorPressaDiastolica) {
        this.idOperacaoSaude = idOperacaoSaude;
        this.dtOperacaoSaude = dtOperacaoSaude;
        this.valorPeso = valorPeso;
        this.valorPressaoSistolica = valorPressaoSistolica;
        this.valorPressaDiastolica = valorPressaDiastolica;
        this.statusPressao = calculaPressaoArterial();
    }

    public double getValor_peso() {
        return valorPeso;
    }

    /**
     * @return o status da pressão arterial
     */
    public String calculaPressaoArterial() {
        double valorPressaDiastolica = this.valorPressaDiastolica;
        double valorPressaoDiastolica = this.valorPressaoSistolica;
        if (valorPressaoSistolica > 140 || valorPressaoDiastolica > 90) {
            return "ELEVADA";
        } else if (valorPressaoSistolica < 120 || valorPressaoDiastolica < 80) {
            return "ABAIXO DO NORMAL";
        } else {
            return "NORMAL";
        }
    }


}
