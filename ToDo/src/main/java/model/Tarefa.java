/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author benfi
 */
public class Tarefa {
    
    private String descricao;
    private Boolean importante;

    public Tarefa() {
    }

    public Tarefa(String descricao, Boolean importante) {
        this.descricao = descricao;
        this.importante = importante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String tarefa) {
        this.descricao = tarefa;
    }

    public Boolean isImportante() {
        return importante;
    }

    public void setImportante(Boolean importante) {
        this.importante = importante;
    }
    
}
