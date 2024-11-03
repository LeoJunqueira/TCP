package universidade;

import java.util.ArrayList;
import java.util.List;

class Monitor {
    private int id;
    private String departamento;

    public Professor(int id, String departamento) {
        this.id = id;
        this.departamento = departamento;
    }

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