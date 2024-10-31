package universidade;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    // Construtor
    public Aluno(int numeroMatriculad, float indiceDesempenho) {
        this.numeroMatricula = numeroMatricula;
        this.indiceDesempenho = indiceDesempenho;
    }

    // Metodos

    // Criar 2 metodos


    public void aumentaIndiceDesempenho(float aumentaIndiceDesempenho) {
        this.indiceDesempenho += aumentaIndiceDesempenho;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getId() {
        return id;
    }

    
}