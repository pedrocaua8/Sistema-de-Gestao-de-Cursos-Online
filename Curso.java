public class Curso {
    protected String titulo;
    protected String instrutor;
    protected int cargaHoraria;
    protected double precoPorHora;

    public Curso(String titulo, String instrutor, int cargaHoraria, double precoPorHora) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
        this.precoPorHora = precoPorHora;
    }

    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Preço por Hora: R$ " + precoPorHora);
    }

    public double calcularCusto() {
        return cargaHoraria * precoPorHora;
    }

    public void gerarRelatorio() {
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.printf("Custo Total: R$ %.2f\n", calcularCusto());
    }
}