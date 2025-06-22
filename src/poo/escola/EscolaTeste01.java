package poo.escola;

public class EscolaTeste01 {
    public static void main(String[] args) {

        Escola escola = new Escola();
        escola.setNome("Firmino Jose");

        escola.adicionarAluno(new Aluno("João", 15));
        escola.adicionarAluno(new Aluno("Maria", 14));

        escola.listarAlunos();
        escola.imprimir();
    }
}
