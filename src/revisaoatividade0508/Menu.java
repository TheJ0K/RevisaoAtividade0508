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
public class Menu{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int resposta = 0;
        while(resposta!=5){
            System.out.println("[1] - Cadastrar Empresa");
            System.out.println("[2] - Cadastrar Pessoa");
            System.out.println("[3] - Listar Empresa");
            System.out.println("[4] - Listar Pessoa");
            System.out.println("[5] - Sair");
            resposta = ler.nextInt();
            switch(resposta){
                case 1:
                    Empresa emp = new Empresa();
                    emp.cadastrarEmpresa();
                    BancoDeDados.getListaDeEmpresas().add(emp);
                    break;
                case 2:
                    Pessoa p = new Pessoa();
                    p.cadastrarPessoa();
                    BancoDeDados.getListaDePessoas().add(p);
                    break;
                case 3:
                    for(int x = 0; x <BancoDeDados.getListaDeEmpresas().size();x++){
                        BancoDeDados.getListaDeEmpresas().get(x).mostrarEmpresa();
                    }
                    break;    
                case 4:
                    for(int x = 0; x <BancoDeDados.getListaDePessoas().size();x++){
                        BancoDeDados.getListaDePessoas().get(x).mostrarPessoa();
                    }
                    break;
                case 5:
                    System.out.println("Saindooo .....");
                    break;
                default:
                    System.out.println("Valor Inválido, tente novamente");
                    break;
            
            }
        }
    }
}
