package entidades;

public class Apartamento {
    int numero;
    int andar;

    void addMorador(String nome, int idade){
        Morador morador = new Morador();
        morador.nome = nome;
        morador.idade = idade;
        System.out.println("Morador Adicionado com Sucesso");
    }
}
