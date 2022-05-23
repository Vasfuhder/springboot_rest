package engcomp.std.labrest.services;

import engcomp.std.labrest.services.dto.ResponseBuscarVoos;

public class VoosService {
    public static ResponseBuscarVoos buscarVoos() {
        return new ResponseBuscarVoos();
    }
    
    public static ResponseBuscarVoos buscarVoos(String origem, String destino, String ida) {
        return new ResponseBuscarVoos(origem, destino, ida);
    }

    public static ResponseBuscarVoos buscarId(String id) {
        return new ResponseBuscarVoos(id);
    }
}
