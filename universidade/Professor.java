package universidade;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int id;
    private String departamento;

    // Construtores
    public Professor(int id, String departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    public Professor() {
    }

    // Metodos

    // Falta criar 2 métodos

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
