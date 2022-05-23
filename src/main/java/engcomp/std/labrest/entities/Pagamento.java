package engcomp.std.labrest.entities;

public class Pagamento {

    private String numero_cartao;
    private String validade;
    private String nome_escrito;
    private int cvv;
    private int parcelamento;

    public Pagamento() {}

    public Pagamento(String numeroCartao, String validade, String nomeEscrito, int cvv, int parcelamento) {
        this.numero_cartao = numeroCartao;
        this.validade = validade;
        this.nome_escrito = nomeEscrito;
        this.cvv = cvv;
        this.parcelamento = parcelamento;
    }


    public String getValidade() {
        return this.validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }    

    public String getNumero_cartao() {
        return this.numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public String getNome_escrito() {
        return this.nome_escrito;
    }

    public void setNome_escrito(String nome_escrito) {
        this.nome_escrito = nome_escrito;
    }    

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getParcelamento() {
        return this.parcelamento;
    }

    public void setParcelamento(int parcelamento) throws Exception {
        if (parcelamento < 1 || parcelamento > 12)
            throw new Exception("Quantidade de parcelamento inválida");
        this.parcelamento = parcelamento;
    }
}