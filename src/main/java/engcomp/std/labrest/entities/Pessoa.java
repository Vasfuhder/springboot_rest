package engcomp.std.labrest.entities;

public class Pessoa {
    private long id;
    private String nome;
    private String email;

    public Pessoa() {}
    
    public Pessoa(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
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

}
