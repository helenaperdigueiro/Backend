package mesa.service.impl;

import mesa.model.Tipo;
import mesa.model.Usuario;
import mesa.service.IDownload;

public class DownloadProxy implements IDownload {
    private DownloadService downloadService = new DownloadService();

    @Override
    public void download(Usuario usuario) {
        if(usuario.getTipo().equals(Tipo.PREMIUM)) {
            downloadService.download(usuario);
        } else {
            System.out.println("Você quer se tornar Premium?");
        }
    }
}
