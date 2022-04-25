package br.com.fiap.health.track;

import java.time.LocalDate;

/**
 * Classe main da aplicação Health Track
 * Criado por Julia Bodin, Carolina Nascimento, Guilherme Marques e Ricardo Sastre
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Boas vindas ao Health Track");
        System.out.println("===========================");
        Usuario usuario =
                new Usuario("José da Silva", "25/04/1999", "Masculino", 1.70, "email@email.com",
                            "123");

        System.out.println("O primeiro usuário do Health Track é: " + usuario);
        System.out.println(
                "A altura do " + usuario.getNomeCompleto() + " é " + usuario.getAltura());


        RelatorioDeSaude relatorioDeSaude = new RelatorioDeSaude(1, LocalDate.now(),
                                                                 50, 80,
                                                                 120);
        System.out.println("A pressão do " + usuario.getNomeCompleto() + " está " +
                           relatorioDeSaude.calculaPressaoArterial());
    }
}
