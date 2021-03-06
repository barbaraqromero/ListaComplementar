package br.com.zup.listaComplementar;

public class Main {
  public static void main(String[] args) {
    //Instanciando a classe Bola
    Bola jabulani = new Bola(10, "borracha");

    //Aplicando os métodos da Bola
    jabulani.trocaCor("azul");
    jabulani.mostraCor();
    System.out.println("--------------------------");

    //Instanciando a classe Quadrado
    Quadrado cubo = new Quadrado(5);

    //Aplicando os métodos do Quadrado
    cubo.mudarValorDoLado(6);
    cubo.retornarValorDoLado();
    System.out.println("O tamanho dos lados é: " + cubo.tamanhoDoLado);
    cubo.calcularArea();
    System.out.println("A área do quadrado é: " + cubo.area);
    System.out.println("---------------------------");

    //Instanciando classe Retângulo
    Retangulo travesseiro = new Retangulo(10, 8);

    //Aplicando os métodos do Retângulo
    travesseiro.mudarValorLados(15, 12);
    travesseiro.retornarValores();
    travesseiro.calcularArea();
    travesseiro.calcularPerimetro();
    System.out.println("---------------------------");

    //Instanciando classe Pessoa
    Pessoa pessoa = new Pessoa("Barbara", 19, 67, 1.62);

    //Aplicando métodos da Pessoa
    pessoa.envelhecer(1);
    System.out.println("Sua nova idade é: " + pessoa.novaIdade);
    pessoa.engordar(5);
    System.out.println("Seu novo peso é: " + pessoa.novoPeso);
    pessoa.emagrecer(8);
    System.out.println("Seu novo peso é: " + pessoa.novoPeso);
    pessoa.crescer(0.1);
    System.out.println("Sua nova altura é: " + pessoa.novaAltura);

  }
}
