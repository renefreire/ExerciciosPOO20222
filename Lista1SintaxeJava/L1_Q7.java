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
7 - O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa 
com os funcionários pedindo que cada um avaliasse a qualidade das refeições 
informando uma nota de 0 a 100. O setor quer saber o percentual de funcionários 
que considera as refeições péssimas (nota entre 0 e 25), ruins (nota acima de 25
e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100). 
Escreva um programa que leia as notas informadas e imprima o percentual de 
funcionários que votou em cada faixa. A entrada de dados deve terminar quando 
for lido um valor que não pertença a nenhum dos intervalos acima.
*/

import java.util.Scanner;

public class L1_Q7 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        double pessima = 0, ruim = 0, boa = 0, otima = 0, total = 0, nota;
        System.out.println("Avaliação das Refeições do Restaurante\n");
        System.out.print("Digite uma nota de 0 a 100 para as refeições");
        System.out.println(" (digite uma nota inválida para encerrar):");
        nota = teclado.nextDouble();
        while ((nota >= 0.0)&&(nota <= 100.0))
        {
            total++;
            if ((nota >= 0.0)&&(nota <= 25.0))
                pessima++;
            else if ((nota > 25.0)&&(nota <= 50.0))
                ruim++;
            else if ((nota > 50.0)&&(nota <= 75.0))
                boa++;
            else if ((nota > 75.0)&&(nota <= 100.0))
                otima++;
            nota = teclado.nextDouble();
        }
        System.out.println("\nDistribuição das notas:");
        System.out.println("Péssima = " + 100*(pessima/total) + "%");
        System.out.println("Ruim = " + 100*(ruim/total) + "%");
        System.out.println("Boa = " + 100*(boa/total) + "%");
        System.out.println("Ótima = " + 100*(otima/total) + "%");
    }
}
