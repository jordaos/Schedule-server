package br.com.mv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    @NotNull
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    private String email;

    @OneToMany(mappedBy = "people")
    private List<Phone> telefones;
}
