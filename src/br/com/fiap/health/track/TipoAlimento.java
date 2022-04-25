package br.com.fiap.health.track;

/**
 * Classe do tipo de alimento
 */
public class TipoAlimento extends Tipo{
    public TipoAlimento(int id, String nome, int quantidadeCalorias) {
        super(id, nome, quantidadeCalorias);
    }

    @Override
    public int calcularCalorias(int caloriasAtuais, int quantidadeCalorias) {
        return caloriasAtuais + quantidadeCalorias;
    }
}
