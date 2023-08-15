package entidades;
public class App {
    public static void main(String[] args) throws Exception {
        Morador johnFall = new Morador();
        johnFall.nome = "John Fall";
        johnFall.idade = 29;
        johnFall.sexo = 'M';

        Apartamento apto = new Apartamento();
        apto.andar =  1;
        apto.numero = 10;
        apto.area = 45;
        // inclui morador
        apto.addMorador(johnFall);

        System.out.println(apto);
    }
}
