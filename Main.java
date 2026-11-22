public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CURSOS ===");
        System.out.println();

        Curso curso1 = new Curso("Desenvolvimento Java", "Carlos Silva", 40, 800.00);
        Curso curso2 = new Curso("Banco de Dados", "Ana Souza", 30, 450.00);
        Curso curso3 = new Curso("Lógica de Programação", "Marcos Lima", 20, 500.00);

        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();
    }
}