package com.company;

public class Subtracao implements OperacaoMatematica{
    int resultado;
    @Override
    public int realizarOperacao(int a, int b) {
        resultado = a - b;
        return resultado;
    }
}
