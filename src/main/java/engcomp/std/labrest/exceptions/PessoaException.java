package engcomp.std.labrest.exceptions;

public class PessoaException extends RuntimeException {
    public PessoaException(long id) {
        super("Não foi possível encontrar pessoa com id: " + id);
    }
}
