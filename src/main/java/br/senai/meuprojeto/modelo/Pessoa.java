package br.senai.meuprojeto.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {

    private Integer id;
    private String nome;
    private String telefone;
    private int idade;
    private LocalDate dataContrato;
    private BigDecimal salario;

    // Construtor completo
    public Pessoa(Integer id, String nome, String telefone, int idade, LocalDate dataContrato, BigDecimal salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.dataContrato = dataContrato;
        this.salario = salario;
    }

    // Getters e
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}