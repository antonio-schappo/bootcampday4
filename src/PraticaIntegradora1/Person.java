package PraticaIntegradora1;

public class Person {

    public String name;
    public int age;
    public String id;
    public int weight;
    public double height;

    public Person(){

    }

    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, String id, int weight, double height) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public String calculateIMC() {
        double imc = weight / Math.pow(height, 2);
        if (imc < 20) {
            return "Abaixo do peso";
        } else if(imc >= 20 && imc <= 25) {
            return "Peso Saudável";
        } else {
            return "Sobrepeso";
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Person data = {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", id = '" + id + '\'' +
                ", weight = " + weight +
                ", height = " + height +
                ", adult = " + this.isAdult() +
                ", IMC analysis = " + this.calculateIMC() +
                '}';
    }
    }

    //    Na classe Pessoa vamos implementar os seguintes métodos: calcularIMC(), a fórmula para
//    calculá-lo é: peso/(altura^2) - (peso expresso em kg e altura em metros). Se este cálculo
//    retornar um valor menor que 20, a função deve retornar -1, se retornar um número entre 20 e
//    25, o método deve retornar 0, por fim, se retornar um número maior que 25 deve retornar 1.
//    Uma vez que o método anterior foi criado, vamos adicionar o método ehMaiorIdade() que
//    deve retornar um valor booleano, levando em consideração que a maioridade será
//    considerada, a partir de 18 anos. Por fim, adicione um método toString() que retornará todas
//    as informações da pessoa.
//    Lembre-se, você pode usar os métodos da classe java.lang.Math para calcular a potência.
