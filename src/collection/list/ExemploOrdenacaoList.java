package collection.list;

/* Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto;
Gato 2 = nome: Simba, idade: 6, cor: tigrado;
Gato 3 = nome: Jon, idade 12, cor: amarelo;
 */

public class ExemploOrdenacaoList {
    public static void main(String[] args) {


    }
}

class Gato {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
}