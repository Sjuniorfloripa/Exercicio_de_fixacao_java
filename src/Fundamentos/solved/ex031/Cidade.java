package Fundamentos.solved.ex031;

public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificarString(){
        String []separarnome = nome.split(" ");
        if (separarnome[0].equalsIgnoreCase("santo")){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nome;
    }
}
