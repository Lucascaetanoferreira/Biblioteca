package br.edu.model;

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Usuario usuario;
    private LocalDate Localdata;
    private LocalDate Dataprevistadevolucao;

    public Emprestimo() {
    }

    public Emprestimo(int id, Livro livro, Usuario usuario, LocalDate localdata, LocalDate dataprevistadevolucao) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        Localdata = localdata;
        Dataprevistadevolucao = dataprevistadevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getLocaldata() {
        return Localdata;
    }

    public void setLocaldata(LocalDate localdata) {
        Localdata = localdata;
    }

    public LocalDate getDataprevistadevolucao() {
        return Dataprevistadevolucao;
    }

    public void setDataprevistadevolucao(LocalDate dataprevistadevolucao) {
        Dataprevistadevolucao = dataprevistadevolucao;
    }
}
