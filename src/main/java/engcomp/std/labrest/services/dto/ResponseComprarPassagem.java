package engcomp.std.labrest.services.dto;

public class ResponseComprarPassagem {
    private String id;
    private String mensagem = "Compra realizada com sucesso!";
    public ResponseComprarPassagem() {}
    public ResponseComprarPassagem(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
