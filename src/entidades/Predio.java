package entidades;

public class Predio {
    String bloco;
    int andares;
    Apartamento apto1;
    Apartamento apto2;

    // construtor padrão
    public Predio(){
        apto1 = new Apartamento();
        apto1.andar = 1;
        apto1.area = 45;
        apto1.numero = 10;

        apto2 = new Apartamento();
        apto2.andar = 2;
        apto2.area = 45;
        apto2.numero = 20;

        andares = 2;
    }

    @Override
    public String toString() {
        String mensagem = "[predio: " + andares + "andares" + "; bloco: " + bloco + "]\n";

        mensagem = mensagem + "\t" + apto1.toString() + "\n\t" + apto2.toString();

        return mensagem;
    }
}
