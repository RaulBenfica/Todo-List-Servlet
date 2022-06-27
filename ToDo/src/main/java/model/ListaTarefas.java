/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author benfi
 */
public class ListaTarefas {
    
    private List<Tarefa> listTarefas = new ArrayList<>();
    
    public ListaTarefas() {
    }
    
    public void create(Tarefa tarefa){
        listTarefas.add(tarefa);
    }
    
    public List<Tarefa> read(){
        return listTarefas;
    }
    
}
