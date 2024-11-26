package com.company;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;
    private List<Artista> artistas;

    public Catalogo() {
        discos = new ArrayList<>();
        artistas = new ArrayList<>();
    }

    public void cadastrarDisco(Disco disco) {
        discos.add(disco);
    }

    public void cadastrarArtista(Artista artista, String tituloDisco) {
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {
                disco.setArtista(artista);
                artistas.add(artista);
                return;
            }
        }
        System.out.println("Disco nao encontrado.");
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
        } else {
            for (Disco disco : discos) {
                System.out.println(disco);
            }
        }
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
    }

    public void removerArtista(String nome) {
        artistas.removeIf(artista -> artista.getNome().equalsIgnoreCase(nome));
        discos.forEach(disco -> {
            if (disco.getArtista() != null && disco.getArtista().getNome().equalsIgnoreCase(nome)) {
                disco.setArtista(null);
            }
        });
    }
}
