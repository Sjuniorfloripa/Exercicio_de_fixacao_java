package Fundamentos.solved.classesTeste.ex032;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pessoa {

    private String nome;
    private List<String> nomeSeparado = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(List<String> nomeSeparado) {
        this.nomeSeparado = Arrays.asList(nome.split(" "));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomeSeparado() {
        return nomeSeparado;
    }

    public void setNomeSeparado(List<String> nomeSeparado) {
        this.nomeSeparado = nomeSeparado;
    }

    public boolean verificarSilva(){
        if (nome.contains("silva")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
