package br.com.fiap.cadastroaluno.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.fiap.cadastroaluno.pojo.CreateAlunoPojo;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "sobrenome", nullable = false, length = 50)
    private String sobrenome;

    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;
 	
    public Aluno() { }

    public Aluno(CreateAlunoPojo aluno) {
        this.nome = aluno.getNome();
        this.sobrenome = aluno.getSobrenome();
        this.cpf = aluno.getCpf();
    }

    public Aluno(CreateAlunoPojo aluno, Long id) {
        this.id  = id;
        this.nome = aluno.getNome();
        this.sobrenome = aluno.getSobrenome();
        this.cpf = aluno.getCpf();
    }

    public Aluno(CreateAlunoPojo aluno, Long id,List<TransacaoCartao> transacaoCartao) {
        this.id  = id;
        this.nome = aluno.getNome();
        this.sobrenome = aluno.getSobrenome();
        this.cpf = aluno.getCpf();
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}