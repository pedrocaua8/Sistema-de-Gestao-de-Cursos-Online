class CursoDeProgramacao extends Curso {
    private String linguagem;

    public CursoDeProgramacao(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String linguagem) {
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        this.linguagem = linguagem;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Linguagem: " + linguagem);
    }

    @Override
    public double calcularCusto() {
        double custo = super.calcularCusto();
        if (cargaHoraria > 50) {
            custo *= 0.9; 
        }
        return custo;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.printf("Custo Total: R$ %.2f\n", calcularCusto());
    }
}