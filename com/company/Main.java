package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nCATALOGO DE DISCOS");
            System.out.println("1. Cadastrar Disco");
            System.out.println("2. Cadastrar Artista");
            System.out.println("3. Remover Disco");
            System.out.println("4. Remover Artista");
            System.out.println("5. Lista de Discos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Titulo do disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano de lancamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    Disco disco = new Disco(titulo, ano);
                    System.out.print("Quantas faixas? ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nome da faixa: ");
                        disco.addFaixa(scanner.nextLine());
                    }
                    catalogo.cadastrarDisco(disco);
                }
                case 2 -> {
                    System.out.print("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Genero musical: ");
                    String genero = scanner.nextLine();
                    System.out.print("Titulo do disco: ");
                    String tituloDisco = scanner.nextLine();
                    Artista artista = new Artista(nome, genero);
                    catalogo.cadastrarArtista(artista, tituloDisco);
                }
                case 3 -> {
                    System.out.print("Titulo do disco a remover: ");
                    String titulo = scanner.nextLine();
                    catalogo.removerDisco(titulo);
                }
                case 4 -> {
                    System.out.print("Nome do artista a remover: ");
                    String nome = scanner.nextLine();
                    catalogo.removerArtista(nome);
                }
                case 5 -> catalogo.listarDiscos();
                case 6 -> System.out.println("Saindo");
                default -> System.out.println("Erro");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
