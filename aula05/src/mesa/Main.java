package mesa;

import mesa.model.Tipo;
import mesa.model.Usuario;
import mesa.service.impl.DownloadProxy;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, Tipo.FREE);
        DownloadProxy downloadProxy = new DownloadProxy();
        downloadProxy.download(usuario);
    }
}
