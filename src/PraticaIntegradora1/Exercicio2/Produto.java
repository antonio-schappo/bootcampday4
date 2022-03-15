package PraticaIntegradora1.Exercicio2;


public class Produto {

    String nome;
    Double preco;

    Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double calcular(int quantidadeDeProdutos){
        return preco * quantidadeDeProdutos;
    }
}
