package universidade;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    // Construtor
    public Aluno(int numeroMatriculad, float indiceDesempenho) {
        this.numeroMatricula = numeroMatricula;
        this.indiceDesempenho = indiceDesempenho;
    }

    // Metodos

    // Criar 2 metodos

    // Redistribuir os métodos corretamente, talvez não precise criar mais nenhum

    public void aumentaIndiceDesempenho(float aumentaIndiceDesempenho) {
        this.indiceDesempenho += aumentaIndiceDesempenho;
    }

    public void setnumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setindiceDesempenho(float indiceDesempenho) {
        this.indiceDesempenho = indiceDesempenho;
    }

    public int getnumeroMatricula() {
        return numeroMatricula;
    }

    public float getindiceDesempenho() {
        return indiceDesempenho;
    }
    
}