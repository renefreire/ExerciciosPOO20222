/*
Universidade Federal Fluminense
Centro Tecnológico
Instituto de Computação
Curso de Graduação em Ciência da Computação
Disciplina: TCC00328 - Programação Orientada a Objetos
Prof.: Vânia de Oliveira Neves
Turma: A1

Aluno: Rene Cruz Freire
Matrícula: 819031057
Email: renefreire@id.uff.br

2022/2
*/

/*
Lista de Exercícios 1
2 - Escreva um programa que efetue a leitura de três valores reais R, S e T,
imprimindo qual deles é o maior.
*/

import java.util.Scanner;

public class L1_Q2 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        double R, S, T;
        System.out.println("Encontre o maior numero\n");
        System.out.println("Digite tres numeros:");
        System.out.print("R = ");
        R = teclado.nextDouble();
        System.out.print("S = ");
        S = teclado.nextDouble();
        System.out.print("T = ");
        T = teclado.nextDouble();
        if (R > S)
            if (R > T)
                System.out.println("\nO maior numero é " + R);
            else
                System.out.println("\nO maior numero é " + T);
        else if (S > T)
            System.out.println("\nO maior numero é " + S);
        else
            System.out.println("\nO maior numero é " + T);
    }    
}
