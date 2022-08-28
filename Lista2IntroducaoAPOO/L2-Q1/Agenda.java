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
 Classe auxiliar do exercício 1 da lista 2
 */

import java.util.Scanner;

class Agenda {
    Contato contato;
    
    void criaAgenda(){
        contato = null;
    }
    void insereContato(String nome){
        Scanner teclado = new Scanner(System.in);
        Contato anterior = null, p = contato;
        while ((p != null)&&(p.getNome().compareToIgnoreCase(nome) < 0)){
            anterior = p;
            p = p.getProx();
        }
        Contato novo = new Contato();
        novo.setNome(nome);
        System.out.print("Endereço: ");
        novo.setEndereco(teclado.nextLine());
        System.out.print("Telefone Residencial: ");
        novo.setTelRes(teclado.nextLine());
        System.out.print("Telefone Comercial: ");
        novo.setTelCom(teclado.nextLine());
        System.out.print("Telefone Celular: ");
        novo.setTelCel(teclado.nextLine());
        System.out.print("E-mail: ");
        novo.setEmail(teclado.nextLine());
        if (anterior == null){
            novo.setProx(contato);
            contato = novo;
        }else{
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }
    void exibeAgenda(){
        System.out.println("Lista de Contatos:");
        for (Contato c = contato; c != null; c = c.getProx()){
            System.out.println(c.getNome());
        }
    }
    boolean agendaVazia(){
        return (contato == null);        
    }
    void buscaContato(String nome){
        for (Contato c = contato; c != null; c = c.getProx()){
            if (c.getNome().compareToIgnoreCase(nome) == 0){
                System.out.println("Nome: " + c.getNome());
                System.out.println("Endereço: " + c.getEndereco());
                System.out.println("Telefone Residencial: " + c.getTelRes());
                System.out.println("Telefone Comercial: " + c.getTelCom());
                System.out.println("Telefone Celular: " + c.getTelCel());
                System.out.println("E-mail: " + c.getEmail());
                return;
            }
        }
        System.out.println("Este contato não existe!");
    }
    void removeContato(String nome){
        Contato anterior = null, p = contato;
        while ((p != null)&&(p.getNome().compareToIgnoreCase(nome) != 0)){
            anterior = p;
            p = p.getProx();
        }
        if (p == null){
            System.out.println("Este contato não existe!");
            return;
        }
        if (anterior == null){
            contato = p.getProx();
        }else{
            anterior.setProx(p.getProx());
        }
    }
    void apagaAgenda(){
        while (contato != null){
            Contato aux = contato.getProx();
            contato = null;
            contato = aux;
        }
    }
}
