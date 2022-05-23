package engcomp.std.labrest.services.dto;

import java.util.ArrayList;
import java.util.Date;

import engcomp.std.labrest.dao.DBMock;
import engcomp.std.labrest.entities.Passagem;

public class ResponsePassagem {
    private Date data_consulta = new Date();
    private int quantidade;
    private ArrayList<Passagem> passagens = DBMock.db.get("passagens");

    public ResponsePassagem() {
        this.quantidade = passagens.size();
    }

    public ResponsePassagem(String id) {
        for (Passagem p : (ArrayList<Passagem>) DBMock.db.get("passagens")) {
            if (p.getId().toString().equals(id)) {
                passagens.clear();
                passagens.add(p);
                break;
            }
        }
        this.quantidade = passagens.size();
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_consulta() {
        return this.data_consulta;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public ArrayList<Passagem> getPassagens() {
        return this.passagens;
    }

    public void setPassagens(ArrayList<Passagem> passagens) {
        this.passagens = passagens;
    }
}
