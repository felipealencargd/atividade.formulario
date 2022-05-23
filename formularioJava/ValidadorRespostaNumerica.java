package aps.src.padroesDeProjeto.formularioJava;

public class ValidadorRespostaNumerica implements ValidadorResposta{

    private int tamMax;
    private int tamMin;

    @Override
    public void validarResposta(String resposta) {
        if (resposta.length() >= this.getTamMin() && resposta.length() <= this.getTamMax() &&
                resposta.matches("[+-]?\\d*(\\.\\d+)?") == true){
            System.out.println("Resposta válida");
        } else {
            System.err.println("Resposta inválida");
        }
    }

    public int getTamMax() {
        return tamMax;
    }

    public void setTamMax(int tamMax) {
        this.tamMax = tamMax;
    }

    public int getTamMin() {
        return tamMin;
    }

    public void setTamMin(int tamMin) {
        this.tamMin = tamMin;
    }
}
