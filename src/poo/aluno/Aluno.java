package poo.aluno;

public class Aluno {

    private String nome;
    private String matricula;
    private final int NUMERO_NOTAS = 3;
    private double[] notas;
    private double media;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("Nenhuma nota informada.");
            return;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        this.media = soma / notas.length;
    }

    public void verificarAprovacao(double[] notas) {
        if (media >= 7.0) {
            System.out.printf("Aluno %s aprovado com média %.2f.%n", nome, media);
        } else {
            System.out.printf("Aluno %s reprovado com média %.2f.%n", nome, media);
        }
    }
}
