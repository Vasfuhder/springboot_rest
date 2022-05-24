package engcomp.std.labrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import engcomp.std.labrest.entities.Hospedagem;
import engcomp.std.labrest.exceptions.HospedagemException;
import engcomp.std.labrest.services.HospedagemService;
import engcomp.std.labrest.services.dto.ResponseHospedagem;

@RestController
@RequestMapping("/hospedagens")
public class HospedagemController {
    @GetMapping("/{id}")
    public ResponseHospedagem buscar(@PathVariable(value = "id") String id) {
        return HospedagemService.buscar(id);
    }

    @PostMapping
    public ResponseHospedagem criarHospedagem(@RequestBody Hospedagem h) {
        return HospedagemService.criar(h);
    }

    @ExceptionHandler(HospedagemException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String exceptionHandler(HospedagemException e) {
        return e.getMessage();
    }
}
