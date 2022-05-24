package engcomp.std.labrest.services.dto;

import java.util.ArrayList;
import java.util.Date;

import engcomp.std.labrest.entities.Hospedagem;

public class ResponseHospedagem {
    private Date data_consulta = new Date();
    private int quantidade;
    private ArrayList<Hospedagem> hospedagens = new ArrayList<>();

    public ResponseHospedagem(Hospedagem h) {
        this.hospedagens.add(h);
        this.quantidade = this.hospedagens.size();
    }

    public Date getData_consulta() {
        return this.data_consulta;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Hospedagem> getHospedagens() {
        return this.hospedagens;
    }

    public void setHospedagens(ArrayList<Hospedagem> hospedagens) {
        this.hospedagens = hospedagens;
    }
}
