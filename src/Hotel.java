import java.lang.reflect.Array;

public class Hotel {

    private Habitacion[] habitaciones;

    public Hotel (int cantHabitaciones){
        if(cantHabitaciones > 0) {
            this.habitaciones = new Habitacion[cantHabitaciones];

            for (int i = 0; i < cantHabitaciones; i++) {
                this.habitaciones[i] = new Habitacion(0, 0);
            }
        }
    }

    public void ocuparHabitacion(int mayores, int menores) {

        if ((mayores + menores) <= 8) {
            for (int i = 0; i < habitaciones.length ; i++) {
                if(!this.habitaciones[i].estaOcupada()){
                    this.habitaciones[i].setMayores(mayores);
                    this.habitaciones[i].setMenores(menores);
                    break;
                }

            }
        } else {
            System.out.println("La cantidad de personas supera las permitidas.");
        }
    }

    public int cantPersonasHotel(){
        int cantPersonasTotal = 0;
        for (int i = 0; i < habitaciones.length ; i++) {
            cantPersonasTotal += habitaciones[i].getMayores() + habitaciones[i].getMenores();

        }
        return cantPersonasTotal;
    }

    public int contarHabitacionesCon(int mayores){
        int contadorMayores = 0;
        if(mayores > 0 && mayores <= 8){
            for(Habitacion h : this.habitaciones){
                if(h.getMayores() == mayores){
                    contadorMayores++;
                }
            }

        } else {
            System.out.println("La cantidad indicada de mayores no corresponde con la cantidad de personas permitidas por habitacion");
        }

        return contadorMayores;
    }

    public int[] ArrayPorHabitantes(){
        int[] personasPorHabitacion = new int[9];
        int cantidad = 0;

        for (int i = 0; i < personasPorHabitacion.length ; i++) {
            for (int j = 0; j < this.habitaciones.length ; j++) {
                 cantidad = this.habitaciones[j].getMayores() + this.habitaciones[j].getMenores();
                 if(cantidad == i){
                     personasPorHabitacion[i]++;
                 }

                 cantidad = 0;

            }


        }

        return personasPorHabitacion;
    }






}
