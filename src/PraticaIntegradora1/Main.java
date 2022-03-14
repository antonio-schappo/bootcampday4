package PraticaIntegradora1;

public class Main {

    public static void main(String[] args){
        Person complete = new Person("João", 22, "3324510", 72, 1.73);
        Person semi = new Person("Leila", 34, "8742934");
        Person semi2 = new Person("Laila", 17, "2542691");
        Person empty = new Person();
        System.out.println(semi.calculateIMC());
        System.out.println(complete.toString());
        System.out.println(semi2.isAdult());
    }
}
