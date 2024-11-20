package esercizio3;

import java.util.Date;

public class Cliente {
    private String codiceCliente;
    public String nome;
    public String cognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String codiceCliente, String nome, String cognome, String email) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = new Date();
    }

    public void stampaCliente(){
        System.out.println("--------------------------Cliente");
        System.out.println("Codice: " + codiceCliente);
        System.out.println("Nome: " + nome + " " + cognome);
        System.out.println("Email: " +email);
        System.out.println("Data iscrizione: " + dataIscrizione);
    }
}
