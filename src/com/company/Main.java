package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha, n1, n2;

        System.out.println("Digite o número correspondente à operação que deseja realizar: ");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        escolha = scan.nextInt();
        System.out.println("Digite dois números para realizar a operação ");
        System.out.println("_____________________________________________");
        System.out.println("Primeiro número");
        n1 = scan.nextInt();
        System.out.println("_____________________________________________");
        System.out.println("Segundo número");
        n2 = scan.nextInt();


        switch (escolha) {
            case 1:
                Soma s = new Soma();
                s.realizarOperacao(n1,n2);
                System.out.println(s.resultado);
                break;
            case 2:
                Subtracao sub = new Subtracao();
                sub.realizarOperacao(n1,n2);
                System.out.println(sub.resultado);
                break;
            case 3:
                Multiplicacao m = new Multiplicacao();
                m.realizarOperacao(n1,n2);
                System.out.println(m.resultado);
                break;
            case 4:
                Divisao d = new Divisao();
                d.realizarOperacao(n1,n2);
                System.out.println(d.resultado);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
