import java.util.ArrayList;
import java.util.Scanner;
class SistemaCursosOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        System.out.println("########## Cadastro de Cursos ##########");
        String continuar;
        do {
            System.out.print("Digite o tipo de curso (1-Programação, 2-Design): ");
            int tipo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Instrutor: ");
            String instrutor = sc.nextLine();
            System.out.print("Carga Horária: ");
            int carga = sc.nextInt();
            System.out.print("Preço por Hora: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            if (tipo == 1) {
                System.out.print("Linguagem: ");
                String linguagem = sc.nextLine();
                cursos.add(new CursoDeProgramacao(titulo, instrutor, carga, preco, linguagem));
            } else if (tipo == 2) {
                System.out.print("Ferramenta: ");
                String ferramenta = sc.nextLine();
                cursos.add(new CursoDeDesign(titulo, instrutor, carga, preco, ferramenta));
            } else {
                System.out.println("Tipo inválido!");
            }

            System.out.print("Deseja cadastrar outro curso? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n########## Relatório Consolidado ##########");
        for (Curso c : cursos) {
            System.out.println("------------------------------------------");
            c.gerarRelatorio();
        }
    }
}