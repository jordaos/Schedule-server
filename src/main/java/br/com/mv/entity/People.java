package br.com.mv.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class People {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @NotNull
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    private String email;

    @OneToMany
    private List<Phone> telefones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Phone> telefones) {
        this.telefones = telefones;
    }

    public People(String nome, String cpf, Date dataNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
}
