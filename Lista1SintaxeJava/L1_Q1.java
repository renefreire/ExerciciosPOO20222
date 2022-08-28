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
1 - Escreva um programa que recebe como parâmetro um número inteiro n. A função
deve ler n valores e retornar quantos desses valores são negativos.
*/

import java.util.Scanner;

public class L1_Q1 
{
    public static int negativos(int n) 
    {
        Scanner teclado = new Scanner(System.in);
        int neg = 0, num;
        for (int i = 1; i <= n; i++)
        {
            System.out.print("N" + i + " = ");
            num = teclado.nextInt();
            if (num < 0){
                neg++;
            }
        }
        return neg;
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int n, negs;
        System.out.print("\nContador de números negativos\n\n");
        System.out.print("Quantos números terá a sequência? -> ");
        n = teclado.nextInt();
        negs = negativos(n);
        System.out.println("\nHá " + negs + " números negativos na sequência.");
    }
}
