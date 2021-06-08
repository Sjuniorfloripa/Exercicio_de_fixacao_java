package Fundamentos.solved.classesTeste.ex039;

public class Segmento {

    private double segmento1;
    private double segmento2;
    private double segmento3;

    public Segmento() {
    }

    public double getSegmento1() {
        return segmento1;
    }

    public void setSegmento1(double segmento1) {
        this.segmento1 = segmento1;
    }

    public double getSegmento2() {
        return segmento2;
    }

    public void setSegmento2(double segmento2) {
        this.segmento2 = segmento2;
    }

    public double getSegmento3() {
        return segmento3;
    }

    public void setSegmento3(double segmento3) {
        this.segmento3 = segmento3;
    }

    public String analizarTriangulo(){
        if (getSegmento1() < getSegmento2() + getSegmento3() &&
                getSegmento2() < getSegmento1() + getSegmento3() &&
                getSegmento3() < getSegmento1() + getSegmento2()){
           return "Os segmentos informados FORMAM um triangulo.";
        }else {
           return "Os segmentos informados NÃO FORMAM um triangulo.";
        }

    }
}
