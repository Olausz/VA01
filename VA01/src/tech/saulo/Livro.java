package tech.saulo;
import java.util.Scanner;

class Livro {

    private Scanner sc = new Scanner(System.in);
    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    private String autor;
    private int ano;
    private String titulo;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("Título: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Ano: "+ ano);
    }


}
