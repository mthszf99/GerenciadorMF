package com.mf.GerenciadorMF.Models;


import com.fasterxml.jackson.annotation.JsonTypeId;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class ClientesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="O nome deve ser preenchido!")
    private String nome;

    @NotNull(message="O tipo de pessoa deve ser selecionado!")
    private Boolean tipoPessoa; // true = pessoa física, false= pessoa jurídica

    private String endereco;
    private Date dataNascimento;
    private String cpf;
    private String cnpj;
    private String ie;
    private String indicacao;
}
