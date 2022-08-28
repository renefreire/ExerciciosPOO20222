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
5 - Escreva um programa recebe um valor N inteiro e que, se N for positivo, 
retorna o fatorial de N (N!). Se não for possível calcular o fatorial, a função 
deve imprimir uma mensagem e retornar o valor -1.
*/

import java.util.Scanner;

public class L1_Q5 
{
    public static long fat(long N)
    {
        if (N < 0)
            return -1;
        else if (N == 0)
            return 1;
        else
            return N*fat(N-1);
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        long N, f;
        System.out.println("Cálculo do fatorial\n");
        System.out.print("N = ");
        N = teclado.nextLong();
        f = fat(N);
        if (f == -1)
            System.out.println("Não existe fatorial de número negativo!");
        else
            System.out.println("N! = " + f);
    }
}
