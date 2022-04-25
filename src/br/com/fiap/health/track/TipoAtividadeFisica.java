package br.com.fiap.health.track;

/**
 * Classe do tipo de atividade física
 */
public class TipoAtividadeFisica extends Tipo {
    public TipoAtividadeFisica(int id, String nome, int quantidadeCalorias) {
        super(id, nome, quantidadeCalorias);
    }

    @Override
    public int calcularCalorias(int caloriasAtuais, int quantidadeCalorias) {
        return caloriasAtuais - quantidadeCalorias;
    }
}
