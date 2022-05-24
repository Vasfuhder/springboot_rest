package engcomp.std.labrest.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import engcomp.std.labrest.entities.enums.Hotel;

public class Hospedagem {
    private UUID id = UUID.randomUUID();
    private Hotel hotel;
    private Calendar data_entrada;
    private Calendar data_saida;
    private ArrayList<Integer> quartos;
    private ArrayList<Pessoa> pessoas;
    private Pagamento pagamento;

    public Hospedagem() {}

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Calendar getData_entrada() {
        return this.data_entrada;
    }

    public void setData_entrada(Calendar data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Calendar getData_saida() {
        return this.data_saida;
    }

    public void setData_saida(Calendar data_saida) {
        this.data_saida = data_saida;
    }

    public ArrayList<Integer> getQuartos() {
        return this.quartos;
    }

    public void setQuartos(ArrayList<Integer> quartos) {
        this.quartos = quartos;
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
