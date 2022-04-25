package br.com.fiap.health.track;

import java.time.LocalDate;

/**
 * Classe de domínio da entidade Alimentos
 */
public class Alimentos {
    int seqOperacaoAlimento;
    int codOperacaoAlimento;
    LocalDate dtOperacaoAlimento;
    TipoAlimento tipoAlimento;


    /**
     * @param seqOperacaoAlimento Sequência da operação do alimento
     * @param codOperacaoAlimento Código de operação do alimento
     * @param dtOperacaoAlimento  Data de operação do alimento
     * @param tipoAlimento        Tipo do alimento consumido
     */
    public Alimentos(int seqOperacaoAlimento, int codOperacaoAlimento, LocalDate dtOperacaoAlimento,
                     TipoAlimento tipoAlimento) {
        this.seqOperacaoAlimento = seqOperacaoAlimento;
        this.codOperacaoAlimento = codOperacaoAlimento;
        this.dtOperacaoAlimento = dtOperacaoAlimento;
        this.tipoAlimento = tipoAlimento;
    }

    public LocalDate getDtOperacaoAlimento() {
        return dtOperacaoAlimento;
    }

    public void setDtOperacaoAlimento(LocalDate dtOperacaoAlimento) {
        this.dtOperacaoAlimento = dtOperacaoAlimento;
    }



}


