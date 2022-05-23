package engcomp.std.labrest.services.dto;

import java.util.ArrayList;

import engcomp.std.labrest.entities.Pagamento;
import engcomp.std.labrest.entities.Pessoa;
import engcomp.std.labrest.entities.enums.TipoPassagem;

public class ComprarPassagemDTO {
    private String id_voo;
    private ArrayList<Pessoa> pessoas;
    private TipoPassagem tipo_passagem = TipoPassagem.IDA;
    private ArrayList<Integer> assentos;
    private Pagamento pagamento;

    public ComprarPassagemDTO() {}

    public ArrayList<Integer> getAssentos() {
        return this.assentos;
    }

    public void setAssentos(ArrayList<Integer> assentos) {
        this.assentos = assentos;
    }

    public String getId_voo() {
        return this.id_voo;
    }

    public void setId_voo(String id_voo) {
        this.id_voo = id_voo;
    }    

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public TipoPassagem getTipo_passagem() {
        return this.tipo_passagem;
    }

    public void setTipo_passagem(TipoPassagem tipo_passagem) {
        this.tipo_passagem = tipo_passagem;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
