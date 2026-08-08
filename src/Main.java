import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Cadastrar usuarioComum");
        System.out.println("2 cadastrar criadorConteudo");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1 :
                System.out.println("Digite seu id");
                Long id = scanner.nextLong();
                scanner.nextLine();
                System.out.println("Digite seu nome");
                String nome = scanner.next();
                System.out.println("Digite seu email");
                String email = scanner.next();
                System.out.println("Digite sua senha");
                String senha = scanner.next();

                UsuarioComum Uc = new UsuarioComum(id,nome,email,senha);
                Uc.exibirPerfil();
                break;
        }
    }
}