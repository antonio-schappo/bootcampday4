package PraticaIntegradora1.Exercicio2;

public class NaoPereciveis extends Produto {

    private String tipo;

    public NaoPereciveis(String nome, Double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    //    Crie a classe NaoPereciveis, ela terá um atributo chamado tipo que será uma
//    String. Crie os setters, getters, construtor e método toString(); nesta classe o
//    método calcular() fará exatamente o mesmo que na classe Produto.
}
