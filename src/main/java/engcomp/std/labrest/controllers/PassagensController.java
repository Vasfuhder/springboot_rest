package engcomp.std.labrest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import engcomp.std.labrest.exceptions.VooException;
import engcomp.std.labrest.services.PassagensService;
import engcomp.std.labrest.services.dto.ComprarPassagemDTO;
import engcomp.std.labrest.services.dto.ResponseComprarPassagem;
import engcomp.std.labrest.services.dto.ResponsePassagem;

@RestController
@RequestMapping("/passagens")
public class PassagensController {

    Logger log = LoggerFactory.getLogger(PassagensController.class);
    
    @PostMapping
    public ResponseComprarPassagem comprar(@RequestBody ComprarPassagemDTO dto) throws VooException {
        log.info("Compra realizada!");
        return PassagensService.comprar(dto);
    }

    @GetMapping
    public ResponsePassagem buscar() {
        log.info("Busca realizada!");
        return PassagensService.buscar();
    }

    @GetMapping("/{id}")
    public ResponsePassagem buscarPorId(@PathVariable(value = "id") String id) {
        log.info("Passagem "+id+" buscada!");
        return PassagensService.buscarPorId(id);
    }

    @ExceptionHandler(VooException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String exceptionHandler(VooException e) {
        return e.getMessage();
    }
}
