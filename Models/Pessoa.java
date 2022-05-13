package Models;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;

    private String email;

    private LocalDate dataNascimento;

    private Boolean desenvolvedor;

    private int idade;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Boolean getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(Boolean desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}

