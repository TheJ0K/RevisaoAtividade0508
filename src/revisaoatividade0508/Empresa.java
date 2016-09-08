/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoatividade0508;

import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private String endereco;
    private int numeroEndereco;
    private String cidade;
    private String estado;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCNPJ(){
        return cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    
    public void cadastrarEmpresa(){
        Scanner ler = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Digite o seu nome: ");
        setNome(ler.nextLine());
        System.out.println("Digite o seu CNPJ: ");
        setCNPJ(ler.nextLine());
        System.out.println("Digite o seu Endereço: ");
        setEndereco(ler.nextLine());
        System.out.println("Digite o seu Número do endereço: ");
        setNumeroEndereco(ler.nextInt());
    }
    
    public void mostrarEmpresa(){
        System.out.println("Nome: "+getNome());
        System.out.println("CNPJ: "+getCNPJ());
        System.out.println("Endereco: "+getEndereco());
        System.out.println("Número Endereco: "+getNumeroEndereco());
    }
    
    
    
    
}
