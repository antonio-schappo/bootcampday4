package PraticaIntegradora1.Exercicio2;

public class Pereciveis extends Produto {
    public int diasParaVencer;

    public Pereciveis(String nome, Double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double desconto;
        switch (diasParaVencer) {
            case 1: desconto = 0.25;
            break;
            case 2: desconto = 0.33;
            break;
            case 3: desconto = 0.5;
            break;
            default: desconto = 1;
        }
        return (preco * quantidadeDeProdutos) * desconto;
    }
}

//    Crie a classe Pereciveis, que terá um atributo chamado diasParaVencer do tipo
//        int, igual a classe produto, defina setters, getters, um construtor que recebe
//        todos os atributos por parâmetro e o método toString(). Essa classe deve
//        herdar da classe Produto e sobrescrever o método calcular(), que deve fazer o
//        mesmo que a classe Produto (multiplicar o preço pelo número de produtos) e,
//        adicionalmente, reduzir o preço de acordo com o diasParaVencer:
//        a. Se faltar um (1) dia para expirar, o preço final será reduzido em 4 vezes.
//
//        b. Se faltarem dois (2) dias para expirar, o preço final será reduzido em 3
//        vezes.
//        c. Se faltarem 3 dias (3) para expirar, metade do seu preço final será
//        reduzido.