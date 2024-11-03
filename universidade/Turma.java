package universidade;

import java.util.ArrayList;
import java.util.List;


/*  === Minha versão da Turma ===

public class Turma {
    private int numAlunos;
    private int numMonitores;
    private int professor;
    private ArrayList monitores;
    private ArrayList alunos;

    public Turma(int numAlunos, int numMonitores, int professor, ArrayList monitores, ArrayList alunos) {
        this.numAlunos = numAlunos;
        this.numMonitores = numMonitores;
        this.professor = professor;
        this.monitores = monitores;
        this.alunos = alunos;
    }
*/

public class Turma {
    private int id;
    private String departamento;
    private Professor professor;
    private String disciplina;
    private ArrayList<Monitor> monitores;
    private ArrayList<Aluno> alunos;
    private int numAlunos;
    private int numMonitores;

    public Turma(){

    }
    // === Minha versão
    public Turma(Professor professor, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos) {
        this.professor = new Professor(id, departamento);
        this.disciplina = disciplina;
    }

    /*  === Versão original ===
    public Turma(int id, String departamento, String disciplina) {
        this.professor = new Professor(id, departamento);
        this.disciplina = disciplina;
    }
*/

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

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Turma do Professor " + professor.getId() + " do departamento de " + professor.getDepartamento() + " disciplina " + getDisciplina();
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumMonitores(int numMonitores) {
        this.numMonitores = numMonitores;
    }

    public int getNumMonitores() {
        return numMonitores;
    }

    public void setMonitores(ArrayList<Monitor> monitores) {
        this.monitores = monitores;
    }

    public ArrayList<Monitor> getMonitores() {
        return monitores;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    
}