package engcomp.std.labrest.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

import engcomp.std.labrest.entities.Hospedagem;
import engcomp.std.labrest.entities.Voo;
import engcomp.std.labrest.entities.enums.Destino;
import engcomp.std.labrest.entities.enums.Origem;

public class DBMock {
    static public HashMap<String, ArrayList> db = new HashMap<>();
    static private String[] empresas = { "LATAM", "GOL", "AZUL" };

    static {
        db.put("voos", inicializarVoos());
        db.put("passagens", new ArrayList<>());
        db.put("hospedagem", inicializarHospedagens());
    }

    static ArrayList<Voo> inicializarVoos() {
        Random r = new Random();
        ArrayList<Voo> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Calendar saida = Calendar.getInstance();

            String empresa = empresas[r.nextInt(empresas.length)];
            saida.add(Calendar.HOUR_OF_DAY, r.nextInt(48));

            Calendar chegada = (Calendar) saida.clone();
            int duracaoMinutos = r.nextInt(1, 4) * 60;
            chegada.add(Calendar.HOUR_OF_DAY, duracaoMinutos / 60);

            Origem origem = Origem.values()[r.nextInt(Origem.values().length)];
            Destino destino = Destino.values()[r.nextInt(Destino.values().length)];
            while (destino.toString().equals(origem.toString()))
                destino = Destino.values()[r.nextInt(Destino.values().length)];

            v.add(new Voo(empresa, saida, chegada, duracaoMinutos, origem, destino));
        }
        return v;
    }

    static ArrayList<Hospedagem> inicializarHospedagens() {
        ArrayList<Hospedagem> h = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            h.add(new Hospedagem());
        }
        return h;
    }
}
