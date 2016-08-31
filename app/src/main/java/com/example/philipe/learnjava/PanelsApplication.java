package com.example.philipe.learnjava;

import android.app.Application;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by philipe on 4/17/16.
 */
public class PanelsApplication extends Application {

    private List<Panel> paineis;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void criarPaineisPadrao(){
        paineis.add(new Panel(R.drawable.seta_direita, "introdução a Java"));
        paineis.add(new Panel(R.drawable.seta_direita, "Maquina Virtual Java"));
        paineis.add(new Panel(R.drawable.seta_direita, "Variáveis"));
        paineis.add(new Panel(R.drawable.seta_direita, "Tipos primitivos"));
        paineis.add(new Panel(R.drawable.seta_direita, "Strings"));
        paineis.add(new Panel(R.drawable.seta_direita, "Capturando entrada do usuário"));

    }

    public List<Panel> getPaineis(){
        return paineis;
    }
}
