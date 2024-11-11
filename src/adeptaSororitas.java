import java.io.Serializable;

public class adeptaSororitas implements Serializable {
//ATRIBUTOS
    private int cod;
    private String nome;
    private int puntos;

//CONSTRUCTORES
    public adeptaSororitas() {

    }
    public adeptaSororitas(int cod, String nome, int puntos) {
        this.cod = cod;
        this.nome = nome;
        this.puntos = puntos;
    }

//GETTERS SETTERS
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "adeptaSororitas{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
