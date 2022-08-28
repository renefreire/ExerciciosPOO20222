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
5 - Escreva uma classe Televisao sabendo que o estado de uma televisão se 
caracteriza por estar ligada ou desligada, pelo volume (que está entre 0 e 10), 
pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso ou
não. Crie métodos para ligar/desligar a televisão, mudar o canal (canal 
específico, canal anterior, próximo canal) e silenciar a televisão. Instancie um
objeto dessa classe, utilize seus métodos para mudar de canal, ligar e desligar 
a TV, silenciar ou dessilenciar a TV e, por último, imprima o estado da TV.
*/

public class L2_Q5 {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        System.out.println("Televisão\n");
        televisao.exibeTV();
        televisao.onOff();
        televisao.decCanal();
        televisao.decCanal();
        televisao.decCanal();
        televisao.exibeTV();
        televisao.defCanal(98);
        televisao.incCanal();
        televisao.incCanal();
        televisao.incCanal();
        televisao.incCanal();
        televisao.exibeTV();
        televisao.incVolume();
        televisao.incVolume();
        televisao.incVolume();
        televisao.incVolume();
        televisao.exibeTV();
        televisao.modoSilencioso();
        televisao.incVolume();
        televisao.incVolume();
        televisao.incVolume();
        televisao.exibeTV();
        televisao.onOff();
        televisao.exibeTV();
    }
    
}
