package Fundamentos.solved.classesTeste.ex033;

public class Computer {

    private int ComputerChoice;

    public Computer(int computerChoice) {
        ComputerChoice = computerChoice;
    }

    public int getComputerChoice() {
        return ComputerChoice;
    }

    public  boolean comparador(int computerChoice, int jogadorChoice){
        if (computerChoice == jogadorChoice){
            return true;
        }else {
            return false;
        }
    }
}
