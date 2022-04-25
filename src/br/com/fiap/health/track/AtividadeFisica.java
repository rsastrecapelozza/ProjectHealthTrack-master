package br.com.fiap.health.track;

import java.time.LocalDate;

/**
 * Classe de domínio da entidade Atividade Física
 */
public class AtividadeFisica {

    int idOperacaoAtivfisica;
    LocalDate dtOperacaoAtivfisica;
    LocalDate hrInicio;
    LocalDate hrFim;
    double qtTempoTotal;
    TipoAtividadeFisica tipoAtividadeFisica;


    /**
     * @param idOperacaoAtivfisica Id da operação da atividade física
     * @param dtOperacaoAtivfisica Data de operação da atividade física
     * @param hrInicio             Hora de início da atividade
     * @param hrFim                Hora de fim da atividade
     * @param qtTempoTotal         tempo total da atividade
     * @param tipoAtividadeFisica  Tipo da atividade física
     */
    public AtividadeFisica(int idOperacaoAtivfisica, LocalDate dtOperacaoAtivfisica,
                           int codAtivfisica, String nomeAtivfisica, LocalDate hrInicio,
                           LocalDate hrFim, double qtTempoTotal, double qtCalorias,
                           TipoAtividadeFisica tipoAtividadeFisica) {
        this.idOperacaoAtivfisica = idOperacaoAtivfisica;
        this.dtOperacaoAtivfisica = dtOperacaoAtivfisica;
        this.hrInicio = hrInicio;
        this.hrFim = hrFim;
        this.qtTempoTotal = qtTempoTotal;
        this.tipoAtividadeFisica = tipoAtividadeFisica;
    }

    public LocalDate getDtOperacaoAtivfisica() {
        return dtOperacaoAtivfisica;
    }

    public void setDtOperacaoAtivfisica(LocalDate dtOperacaoAtivfisica) {
        this.dtOperacaoAtivfisica = dtOperacaoAtivfisica;
    }

    public LocalDate getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(LocalDate hrInicio) {
        this.hrInicio = hrInicio;
    }

    public LocalDate getHrFim() {
        return hrFim;
    }

    public void setHrFim(LocalDate hrFim) {
        this.hrFim = hrFim;
    }

    public double getQtTempoTotal() {
        return qtTempoTotal;
    }

    public void setQtTempoTotal(double qtTempoTotal) {
        this.qtTempoTotal = qtTempoTotal;
    }


}
