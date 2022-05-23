package engcomp.std.labrest.entities;

import java.util.ArrayList;
import java.util.UUID;

import engcomp.std.labrest.entities.enums.TipoPassagem;

public class Passagem {
    private UUID id;
    private TipoPassagem tipo;
    private Voo voo_ida;
    private Voo voo_volta = null;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Integer> assentos;
    private Pagamento pagamento;

    public Passagem(TipoPassagem tipo, Voo voo_ida, ArrayList<Pessoa> pessoas, ArrayList<Integer> assentos, Pagamento pagamento) {
        this.id = UUID.randomUUID();
        this.tipo = tipo;
        this.voo_ida = voo_ida;
        this.pessoas = pessoas;
        this.assentos = assentos;
        this.pagamento = pagamento;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public TipoPassagem getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoPassagem tipo) {
        this.tipo = tipo;
    }

    public Voo getVoo_ida() {
        return this.voo_ida;
    }

    public void setVoo_ida(Voo voo_ida) {
        this.voo_ida = voo_ida;
    }

    public Voo getVoo_volta() {
        return this.voo_volta;
    }

    public void setVoo_volta(Voo voo_volta) {
        this.voo_volta = voo_volta;
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public ArrayList<Integer> getAssentos() {
        return this.assentos;
    }

    public void setAssentos(ArrayList<Integer> assentos) {
        this.assentos = assentos;
    }
}
