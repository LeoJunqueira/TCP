package universidade;

import java.util.ArrayList;
import java.util.List;

class Turma {
    private int id;
    private String departamento;
    private Professor professor;
    private String disciplina;

    public Turma(){

    }

    public Turma(int id, String departamento, String disciplina) {
        this.professor = new Professor(id, departamento);
        this.disciplina = disciplina;
    }

    // Método para criar e adicionar um novo professor à turma (em caso de uso de construtor vazio)
    public void adicionarProfessor(int id, String departamento) {
        this.professor = new Professor(id, departamento);
    }

    public void adicionarDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Turma do Professor " + professor.getId() + " do departamento de " + professor.getDepartamento() + " disciplina " + getDisciplina();
    }
}