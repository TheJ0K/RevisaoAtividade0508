/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoatividade0508;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class BancoDeDados {
    public static List<Empresa> listaDeEmpresas = new ArrayList<>();
    public static List<Pessoa> listaDePessoas = new ArrayList<>();
    
    
    public static List<Pessoa> getListaDePessoas(){
        return listaDePessoas;
    }
    
    public static List<Empresa> getListaDeEmpresas(){
        return listaDeEmpresas;
    }
}
