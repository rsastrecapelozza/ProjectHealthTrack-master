package br.com.fiap.health.track;

/**
 * Classe mãe para tipo de alimentos e atividade física
 */
public class Tipo {

    private final int id;
    private String nome;
    private int quantidadeCalorias;

    /**
     *
     * @param id Id do tipo
     * @param nome Nome do tipo
     * @param quantidadeCalorias Quantidade de calorias
     */
    public Tipo(int id, String nome, int quantidadeCalorias) {
        this.id = id;
        this.nome = nome;
        this.quantidadeCalorias = quantidadeCalorias;
    }

    public int getId() {
        return id;
    }

    public int getQuantidadeCalorias() {
        return quantidadeCalorias;
    }

    public void setQuantidadeCalorias(int quantidadeCalorias) {
        this.quantidadeCalorias = quantidadeCalorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calcularCalorias (int caloriasAtuais, int quantidadeCalorias){
        return this.quantidadeCalorias;
    }

}
