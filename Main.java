public class Main {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();

        while (true) {
            view.mostrarMenu();
            int opcao = view.solicitarOpcao();

            switch (opcao) {
                case 1:
                    String titulo = view.solicitarTitulo();
                    String autor = view.solicitarAutor();
                    controller.cadastrarLivro(titulo, autor);
                    break;
                case 2:
                    controller.listarLivros();
                    break;
                case 3:
                    // Implementar lógica para emprestar livro
                    break;
                case 4:
                    // Implementar lógica para devolver livro
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
