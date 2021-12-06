package mesa.service.impl;

import mesa.model.Usuario;
import mesa.service.IDownload;

public class DownloadService implements IDownload {

    @Override
    public void download(Usuario usuario) {
        System.out.println("Você fez um download!");
    }
}
