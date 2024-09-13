package br.edu.model;

public class Livro {
    private int id;
    private String titulo;
    private int numero_livro;
    private String autor;
    private boolean disponivel;

    public Livro() {
    }

    public Livro(int id, String titulo, int numero_livro, String autor, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.numero_livro = numero_livro;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_livro() {
        return numero_livro;
    }

    public void setNumero_livro(int numero_livro) {
        this.numero_livro = numero_livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
