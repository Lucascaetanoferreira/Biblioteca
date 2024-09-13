package br.edu.model;

public class Autor {
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    private String livros;

    public Autor() {
    }

    public Autor(int id, String nome, int idade, String cidade, String livros) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.livros = livros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }
}

