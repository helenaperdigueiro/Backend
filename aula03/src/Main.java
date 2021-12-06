import model.Estagiario;
import model.Funcionario;
import model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Vendedor funcionario01 = new Funcionario("Joao");
        funcionario01.setAnosEmpresa(2);
        funcionario01.vender();
        ((Funcionario) funcionario01).adicionarAfiliado("Maria");
        funcionario01.mostrarCategoria();

        Vendedor estagiario01 = new Estagiario("Mario");
        estagiario01.vender();
        estagiario01.mostrarCategoria();
    }
}
