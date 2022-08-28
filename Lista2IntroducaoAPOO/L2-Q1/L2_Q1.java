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
Lista de Exercícios 2
1 -  Faça um programa de agenda telefônica, com as classes Agenda e Contato
*/

import java.util.Scanner;

public class L2_Q1 {
    public static int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Encontrar um contato");
        System.out.println("2 - Incluir um contato");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Ver todos os contatos");
        System.out.println("5 - Remover todos os contatos");
        System.out.println("0 - Sair");
        System.out.print("-> ");
        int n = teclado.nextInt();
        System.out.println("");
        return n;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       
        Agenda agenda = new Agenda();
        agenda.criaAgenda();
        System.out.println("Agenda Telefônica\n");
        int n = menu();
        while (n != 0){
            switch (n){
                case 1 -> {
                    // Encontrar um contato
                    if (!agenda.agendaVazia()){
                        System.out.print("Pesquisar contato: ");
                        agenda.buscaContato(teclado.next());
                    }else
                        System.out.println("Agenda vazia!");
                }
                case 2 -> {
                    // Incluir um contato
                    System.out.print("Nome: ");
                    agenda.insereContato(teclado.next());
                }
                case 3 -> {
                    // Excluir um contato
                    if (!agenda.agendaVazia()){
                        System.out.print("Nome: ");
                        agenda.removeContato(teclado.next());
                        System.out.println("Contato removido!");
                    }else
                        System.out.println("Agenda vazia!");
                }
                case 4 -> {
                    // Ver todos os contatos
                    if (!agenda.agendaVazia()){
                        agenda.exibeAgenda();
                    }else
                        System.out.println("Agenda vazia!");
                }
                case 5 -> {
                    // Remover todos os contatos
                    agenda.apagaAgenda();
                    System.out.println("Agenda apagada!");
                }
                default -> System.out.println("Digite uma opção válida!");
            }
            System.out.println("");
            n = menu();
        }
    }
}
