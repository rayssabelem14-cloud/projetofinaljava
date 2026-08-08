import java.util.Date;

public class UsuarioPremium extends Usuario implements Monetizavel {
    private Date dataInicioPremium;
    private Date dataFimPremium;

    public UsuarioPremium(Long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    @Override
    public void atualizarDados() {

    }

    @Override
    public void exibirPerfil() {

    }

    @Override
    public void desativarMonetizacao() {

    }

    @Override
    public void ativarMonetizacao() {

    }
}















