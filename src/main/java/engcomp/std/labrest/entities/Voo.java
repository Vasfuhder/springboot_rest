package engcomp.std.labrest.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

import engcomp.std.labrest.entities.enums.Configuracao;
import engcomp.std.labrest.entities.enums.Destino;
import engcomp.std.labrest.entities.enums.Origem;

public class Voo {
    private UUID id;
    private String empresa;
    private Calendar data_saida;
    private Calendar data_chegada;
    private int duracao_minutos;
    private Origem origem;
    private Destino destino;
    private ArrayList<Integer> assentos_ocupados = new ArrayList<>();

    public Voo(String empresa, Calendar data_saida, Calendar data_chegada, int duracaoMinutos, Origem origem,
            Destino destino) {
        this.id = UUID.randomUUID();
        this.empresa = empresa;
        this.data_saida = data_saida;
        this.data_chegada = data_chegada;
        this.duracao_minutos = duracaoMinutos;
        this.origem = origem;
        this.destino = destino;

        Random r = new Random();
        for (int i = 0; i < r.nextInt(5, 20); i++) {
            assentos_ocupados.add(r.nextInt(Configuracao.MAX_LUGARES));
        }
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Calendar getData_saida() {
        return this.data_saida;
    }

    public void setData_saida(Calendar data_saida) {
        this.data_saida = data_saida;
    }

    public Calendar getData_chegada() {
        return this.data_chegada;
    }

    public void setData_chegada(Calendar data_chegada) {
        this.data_chegada = data_chegada;
    }

    public int getDuracao_minutos() {
        return this.duracao_minutos;
    }

    public void setDuracao_minutos(int duracao_minutos) {
        this.duracao_minutos = duracao_minutos;
    }

    public Origem getOrigem() {
        return this.origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Destino getDestino() {
        return this.destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public ArrayList<Integer> getAssentos_ocupados() {
        return this.assentos_ocupados;
    }

    public void setAssentos_ocupados(ArrayList<Integer> assentos_ocupados) {
        this.assentos_ocupados = assentos_ocupados;
    }
}
