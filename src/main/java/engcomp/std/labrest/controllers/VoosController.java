package engcomp.std.labrest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import engcomp.std.labrest.services.VoosService;
import engcomp.std.labrest.services.dto.ResponseBuscarVoos;

@RestController
@RequestMapping("/voos")
public class VoosController {
    @GetMapping
    public ResponseBuscarVoos buscarTodos() {
        return VoosService.buscarVoos();
    }

    @GetMapping("/{id}")
    public ResponseBuscarVoos buscarId(@PathVariable(value = "id") String id) {
        return VoosService.buscarId(id);
    }

    @GetMapping("/ida")
    public ResponseBuscarVoos buscar(@RequestParam("origem") String origem, @RequestParam("destino") String destino,
            @RequestParam("ida") String ida) {
        return VoosService.buscarVoos(origem, destino, ida);
    }
}
