public class Habitacion {

    private int mayores;
    private int menores;

    public Habitacion(int mayores, int menores) {
        this.mayores = mayores;
        this.menores = menores;
    }

    public Boolean estaOcupada(){
        return (mayores + menores) > 0;
    }

    public int getMayores() {
        return mayores;
    }

    public void setMayores(int mayores) {
        this.mayores = mayores;
    }

    public int getMenores() {
        return menores;
    }

    public void setMenores(int menores) {
        this.menores = menores;
    }
}
