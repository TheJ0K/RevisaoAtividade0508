/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * LA
 */
package revisaoatividade0508;

import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;
    private String email;
    private String endereco;
    private int numeroEndereco;
    private String cidade;
    private String estado;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void cadastrarPessoa(){
        Scanner ler = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Digite o seu nome: ");
        setNome(ler.nextLine());
        System.out.println("Digite o seu RG: ");
        setRg(ler.nextLine());
        System.out.println("Digite o seu Endereço: ");
        setEndereco(ler.nextLine());
        System.out.println("Digite o seu Número do endereço: ");
        setNumeroEndereco(ler.nextInt());
    }
    
    public void mostrarPessoa(){
        System.out.println("Nome: "+getNome());
        System.out.println("RG: "+getRg());
        System.out.println("Endereco: "+getEndereco());
        System.out.println("Número Endereco: "+getNumeroEndereco());
    }
    
    
}
