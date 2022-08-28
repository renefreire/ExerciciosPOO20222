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

class Contato
{
    String nome;
    String endereco;
    String telRes;
    String telCom;
    String telCel;
    String email;
    Contato prox;
    
    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    String getEndereco(){
        return endereco;
    }
    void setEndereco(String endereco){
        this.endereco = endereco;
    }
    String getTelRes(){
        return telRes;
    }
    void setTelRes(String telRes){
        this.telRes = telRes;
    }
    String getTelCom(){
        return telCom;
    }
    void setTelCom(String telCom){
        this.telCom = telCom;
    }
    String getTelCel(){
        return telCel;
    }
    void setTelCel(String telCel){
        this.telCel = telCel;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email = email;
    }
    Contato getProx(){
        return prox;
    }
    void setProx(Contato prox){
        this.prox = prox;
    }
}
