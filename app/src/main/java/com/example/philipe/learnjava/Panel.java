package com.example.philipe.learnjava;

/**
 * Created by philipe on 4/17/16.
 */
public class Panel {

    private int idImagem;
    private String nomePanel;

    public Panel(int id, String nomePanel){
        this.idImagem = id;
        this.nomePanel = nomePanel;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public String getNomePanel() {
        return nomePanel;
    }

    public void setNomePanel(String nomePanel) {
        this.nomePanel = nomePanel;
    }
}
