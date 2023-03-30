package singleton;

public class Parametro {

    private Parametro() {};
    private static Parametro instance = new Parametro();
    public static Parametro getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String usuarioLogado;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}


