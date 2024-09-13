package br.edu.view;

import br.edu.model.Autor;
import br.edu.model.Emprestimo;
import br.edu.model.Livro;
import br.edu.model.Usuario;

import javax.print.attribute.standard.DateTimeAtProcessing;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Livro livro= new Livro();
        livro.setId(1);
        livro.setTitulo("uma casa no fundo do lago");
        livro.setNumero_livro(321);
        livro.setAutor("Josh Malerman");
        livro.setDisponivel(livro.isDisponivel());

        Autor pessoa=new Autor();
        pessoa.setId(1);
        pessoa.setNome("Josh Malerman");
        pessoa.setIdade(49);
        pessoa.setCidade("Southfield, Michigan, EUA");
        pessoa.setLivros("uma casa no fundo do lago");

        Usuario leitor=new Usuario();
        leitor.setId(1);
        leitor.setNome("Lucas caetano ferreira");
        leitor.setBairro("alto recreio");
        leitor.setNumero_casa(584);
        leitor.setCpf("02707611190");

        Emprestimo emprestimo=new Emprestimo();
        emprestimo.setId(1);
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(leitor);
        emprestimo.setLocaldata(LocalDate.EPOCH);
        emprestimo.setLocaldata(LocalDate.EPOCH);


    }

}
