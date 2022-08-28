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
8 - Faça uma classe celular em que cada celular contém uma bateria, cada bateria
é caracterizada pela capacidade de carga (medida em unidades u inteiras) e pelo
nível de carga. Com o seu celular você pode enviar mensagens de texto e fazer
ligações mas, obviamente, ambas as funções afetam o nível da bateria: uma 
mensagem de texto consome uma unidade de carga e uma chamada consome uma unidade
de carga a cada 5 segundos. Também é possível saber o nível de carga do celular.
Implemente as classes com todos os métodos que julgar apropriados para simular
objetos reais e, em seguida, instancie os objetos e faça alguns testes.
*/

import java.io.IOException;

public class L2_Q8 {
    public static void main(String[] args) throws IOException{
        Celular celular = new Celular();
        
        celular.painel();
        celular.mensagem();
        celular.mensagem();
        celular.mensagem();
        celular.mensagem();
        celular.painel();
        celular.ligacao();
        celular.painel();
        celular.recarga();
        celular.painel();
    }   
}
