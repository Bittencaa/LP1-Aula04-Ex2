package com.company;

public class Divisao implements OperacaoMatematica{
    int resultado;
    @Override
    public int realizarOperacao(int a, int b) {
        resultado = a / b;
        return resultado;
    }
}
