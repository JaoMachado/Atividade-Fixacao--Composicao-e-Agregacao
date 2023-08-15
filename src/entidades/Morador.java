package entidades;

public class Morador {
    String nome;
    char sexo;
    int idade;

    // redefinir o metodo toString
    //Override => sobrescrever

    @Override
    public String toString() {
        return "[nome: " + nome + " ; sexo: " + sexo + "; idade: " + idade + "]";
    }
}
