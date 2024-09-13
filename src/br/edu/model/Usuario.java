package br.edu.model;

public class Usuario {
    private int id;
    private String nome;
    private String Cpf;
    private String bairro;
    private int numero_casa;

    public Usuario() {
    }

    public Usuario(int id, String nome, String cpf, String bairro, int numero_casa) {
        this.id = id;
        this.nome = nome;
        Cpf = cpf;
        this.bairro = bairro;
        this.numero_casa = numero_casa;
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

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }
}
