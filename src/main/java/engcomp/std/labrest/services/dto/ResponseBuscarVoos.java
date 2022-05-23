package engcomp.std.labrest.services.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import engcomp.std.labrest.dao.DBMock;
import engcomp.std.labrest.entities.Voo;

public class ResponseBuscarVoos {
    private Date data_consulta = new Date();
    private int quantidade;
    private ArrayList<Voo> voos_disponiveis = DBMock.db.get("voos");

    public ResponseBuscarVoos() {
        this.quantidade = voos_disponiveis.size();
    }

    public ResponseBuscarVoos(String id) {
        ArrayList<Voo> voos = new ArrayList<>();
        for (Voo v: voos_disponiveis) {
            if (v.getId().toString().equals(id)) voos.add(v);
        }
        this.setVoos_disponiveis(voos);
        this.quantidade = voos_disponiveis.size();
    }

    public ResponseBuscarVoos(String origem, String destino, String ida) {
        ArrayList<Voo> voos = new ArrayList<>();
        for (Voo v : (ArrayList<Voo>) DBMock.db.get("voos")) {
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                c.setTime(sdf.parse(ida));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if (v.getOrigem().toString().equals(origem.toUpperCase())
                    && v.getDestino().toString().equals(destino.toUpperCase())
                    && (v.getData_saida().get(Calendar.DAY_OF_YEAR) == c.get(Calendar.DAY_OF_YEAR))) {
                voos.add(v);
            }
        }
        this.setVoos_disponiveis(voos);
        this.quantidade = voos_disponiveis.size();
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

    public ArrayList<Voo> getVoos_disponiveis() {
        return this.voos_disponiveis;
    }

    public void setVoos_disponiveis(ArrayList<Voo> voos_disponiveis) {
        this.voos_disponiveis = voos_disponiveis;
    }
}
