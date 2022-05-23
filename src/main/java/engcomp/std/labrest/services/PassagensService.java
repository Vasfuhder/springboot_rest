package engcomp.std.labrest.services;

import java.util.ArrayList;
import java.util.Objects;

import engcomp.std.labrest.dao.DBMock;
import engcomp.std.labrest.entities.Passagem;
import engcomp.std.labrest.entities.Voo;
import engcomp.std.labrest.exceptions.VooException;
import engcomp.std.labrest.services.dto.ComprarPassagemDTO;
import engcomp.std.labrest.services.dto.ResponseComprarPassagem;
import engcomp.std.labrest.services.dto.ResponsePassagem;

public class PassagensService {
    public static ResponseComprarPassagem comprar(ComprarPassagemDTO dto) throws VooException {
        Voo voo = buscarVooPorId(dto.getId_voo());
        //
        if (Objects.isNull(voo))
            throw new VooException("Voo nao encontrado");
        for (Integer i : voo.getAssentos_ocupados()) {
            for (Integer j : dto.getAssentos()) {
                if (j.intValue() == i.intValue())
                    throw new VooException("Um ou mais assentos já estão ocupados");
            }
        }
        voo.getAssentos_ocupados().addAll(dto.getAssentos());
        //
        Passagem passagem = new Passagem(dto.getTipo_passagem(), voo, dto.getPessoas(), dto.getAssentos(), dto.getPagamento());
        DBMock.db.get("passagens").add(passagem);
        return new ResponseComprarPassagem(passagem.getId().toString());
    }

    private static Voo buscarVooPorId(String id) {
        for (Voo v : (ArrayList<Voo>) DBMock.db.get("voos")) {
            if (v.getId().toString().equals(id))
                return v;
        }
        return null;
    }

    public static ResponsePassagem buscar() {
        return new ResponsePassagem();
    }

    public static ResponsePassagem buscarPorId(String id) {
        return new ResponsePassagem(id);
    }
}
