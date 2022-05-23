package engcomp.std.labrest.entities;

import java.util.UUID;

public class Pessoa {
    
    private UUID id = UUID.randomUUID();
    private String nome;
    private String email;
    private String numero;
    private int idade;

    public Pessoa() {}
    
    public Pessoa(String nome, String email, String numero, int idade) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.numero = numero;
        this.idade = idade;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
