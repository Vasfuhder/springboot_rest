package engcomp.std.labrest.resources;

public class Saudacao {
    private final long id;
    private final String nome;

    public Saudacao(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public long getId() {
        return this.id;
    }


    public String getNome() {
        return this.nome;
    }

}