package com.letscode.validators;

public class MotorRegraValidacao<E> {

    public MotorRegraValidacao(RegraValidacao<E>[] regras) {
        this.regras = regras;
    }

    private RegraValidacao<E>[] regras;

    public boolean executa( E algoParaValidar ){
        boolean estaValido = true;
        for (RegraValidacao regra : regras) {
            estaValido = regra.validar(algoParaValidar);
            if(!estaValido){
               break;
            }
        }
        return estaValido;
    }
}
