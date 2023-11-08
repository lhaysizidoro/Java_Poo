public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor da classe
    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    // Método para calcular o salário anual
    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para obter o nome completo do funcionário
    public String obterNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public static void main(String[] args) {
        // Criando três objetos da classe Funcionario
        Funcionario funcionario1 = new Funcionario("João", "Silva", 3000);
        Funcionario funcionario2 = new Funcionario("Maria", "Souza", 4000);
        Funcionario funcionario3 = new Funcionario("Lucas", "Almeida", 3500);

        // Calculando e exibindo o salário anual dos funcionários
        System.out.println("Salário anual de " + funcionario1.obterNomeCompleto() + ": " + funcionario1.calcularSalarioAnual());
        System.out.println("Salário anual de " + funcionario2.obterNomeCompleto() + ": " + funcionario2.calcularSalarioAnual());
        System.out.println("Salário anual de " + funcionario3.obterNomeCompleto() + ": " + funcionario3.calcularSalarioAnual());
    }
}
