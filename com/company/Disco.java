package com.company;
import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titulo;
    private int anoLancamento;
    private List<String> faixas;
    private Artista artista;

    public Disco(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void addFaixa(String faixa) {
        faixas.add(faixa);
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
public String toString() {
    String artistaInfo = (artista != null) ? " - Artista: " + artista.getNome() : "";
    return "Disco: " + titulo + " (" + anoLancamento + ")" + artistaInfo + "\nFaixas: " + faixas;
    }
}
