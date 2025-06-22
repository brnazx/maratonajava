package poo.escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Escola() {
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado na escola: " + nome);
        } else {
            System.out.println("Alunos da escola " + nome + ":");
            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome() + " (Idade: " + aluno.getIdade() + ")");
            }
        }
    }

    public void imprimir() {
        System.out.println("\nEscola: " + nome);
        listarAlunos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return new ArrayList<>(this.alunos);
    }
}