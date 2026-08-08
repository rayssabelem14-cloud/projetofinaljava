import java.util.Date;

public class UsuarioComum extends Usuario {
    protected Date dataCadastro;

    public UsuarioComum(Long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    public void visualizarConteudos() {
    }

    @Override
    public void atualizarDados() {

    }
}






















