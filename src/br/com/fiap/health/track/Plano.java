package br.com.fiap.health.track;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Classe de domínio da entidade Plano do aplicativo
 */
public class Plano implements Serializable {

    private static final long serialVersionUID = 1L;
    int codPlano;
    String nomePlano;
    int codAssinatura;
    LocalDate dtAssinatura;
    String tipoAssinatura;
    double valorAssinatura;

    /**
     * @param codPlano        Código do plano
     * @param nomePlano       Nome do plano
     * @param codAssinatura   Código de assinatura
     * @param dtAssinatura    Data da assinatura do plano
     * @param tipoAssinatura  Tipo da assinatura
     * @param valorAssinatura Valor da assinatura
     */
    public Plano(int codPlano, String nomePlano, int codAssinatura,
                 LocalDate dtAssinatura, String tipoAssinatura, double valorAssinatura) {
        this.codPlano = codPlano;
        this.nomePlano = nomePlano;
        this.codAssinatura = codAssinatura;
        this.dtAssinatura = dtAssinatura;
        this.tipoAssinatura = tipoAssinatura;
        this.dtAssinatura = LocalDate.now();
        this.valorAssinatura = valorAssinatura;
    }

    public String consultaPlano() {
        return nomePlano;
    }

    /**
     * @param tipo_assinatura Nova assinatura definida
     */
    public void trocaPlano(String tipo_assinatura) {
        this.tipoAssinatura = tipo_assinatura;
    }
}

