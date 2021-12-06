import model.Estagiario;
import model.Funcionario;
import model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Vendedor funcionario = new Funcionario("Joao");
        ((Funcionario)funcionario).setAnosEmpresa(5);
        funcionario.vender();
        funcionario.vender();
        funcionario.vender();
        funcionario.vender();
        funcionario.vender();

        Vendedor afiliado = ((Funcionario)funcionario).obterAfiliado("Maria");

        afiliado.vender();
        afiliado.vender();

        Vendedor estagiario = new Estagiario("Helena");
        estagiario.vender();
        estagiario.vender();

        funcionario.mostrarCategoria();
        afiliado.mostrarCategoria();
        estagiario.mostrarCategoria();

    }
}
