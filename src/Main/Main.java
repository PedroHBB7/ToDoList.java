import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Login");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            usuario u = new usuario();
            System.out.print("Nome: ");
            u.setNome(sc.nextLine());
            System.out.print("Email: ");
            u.setEmail(sc.nextLine());
            System.out.print("Senha: ");
            u.setSenha(sc.nextLine());

            if (register.cadastrar(u)) {
                System.out.println("Usuário cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar.");
            }

        } else if (opcao == 2) {
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            usuario u = login.autenticar(email, senha);
            if (u != null) {
                System.out.println("Bem-vindo, " + u.getNome());

                // Adicionar tarefa
                tarefa t = new tarefa();
                System.out.print("Título da tarefa: ");
                t.setTitulo(sc.nextLine());
                System.out.print("Descrição: ");
                t.setDescricao(sc.nextLine());
                t.setStatus("pendente");
                t.setUsuarioId(u.getId());

                if (ToDoList.adicionarTarefa(t)) {
                    System.out.println("Tarefa adicionada com sucesso!");
                }

                // Listar tarefas
                System.out.println("\nSuas tarefas:");
                for (tarefa tarefa : ToDoList.listarTarefas(u.getId())) {
                    System.out.println("- " + tarefa.getTitulo() + " (" + tarefa.getStatus() + ")");
                }

            } else {
                System.out.println("Email ou senha incorretos.");
            }
        }

        sc.close();
    }
}
