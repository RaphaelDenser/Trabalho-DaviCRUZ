import java.util.Scanner;

public class BibliotecaView {
    private Scanner scanner;

    public BibliotecaView() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Biblioteca Menu:");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Emprestar Livro");
        System.out.println("4. Devolver Livro");
        System.out.println("5. Sair");
    }

    public String solicitarTitulo() {
        System.out.print("Digite o título do livro: ");
        return scanner.nextLine();
    }

    public String solicitarAutor() {
        System.out.print("Digite o autor do livro: ");
        return scanner.nextLine();
    }

    public int solicitarOpcao() {
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
