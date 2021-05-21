package Fundamentos.solved.classesTeste;

public class Data {

    public String dia;
    public String mes;
    public String ano;

    public Data(){}

    public Data(String diaPadrao, String mesPadrao, String anoPadrao){
        dia = diaPadrao;
        mes = mesPadrao;
        ano = anoPadrao;
    }

    public String obterDataFormatada(){
        return String.format("%s / %s / %s",dia, mes, ano);
    }

}
