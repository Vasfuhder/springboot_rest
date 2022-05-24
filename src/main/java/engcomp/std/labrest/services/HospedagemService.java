package engcomp.std.labrest.services;

import java.util.ArrayList;

import engcomp.std.labrest.dao.DBMock;
import engcomp.std.labrest.entities.Hospedagem;
import engcomp.std.labrest.exceptions.HospedagemException;
import engcomp.std.labrest.services.dto.ResponseHospedagem;

public class HospedagemService {
    public static ResponseHospedagem buscar(String id) {
        for (Hospedagem h : (ArrayList<Hospedagem>) DBMock.db.get("hospedagem")) {
            if (h.getId().toString().equals(id))
                return new ResponseHospedagem(h);
        }
        throw new HospedagemException("Hospedagem não encontrada");
    }

    public static ResponseHospedagem criar(Hospedagem h) {
        DBMock.db.get("hospedagem").add(h);
        return new ResponseHospedagem(h);
    }
}
