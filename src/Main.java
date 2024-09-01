import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Hotel California = new Hotel(6);

        //Error, supera la cantidad permitida (8)
        California.ocuparHabitacion(5,5);

        California.ocuparHabitacion(4,1);
        California.ocuparHabitacion(3,3);
        California.ocuparHabitacion(4,3);

        int cantPersonasEnElHotel = California.cantPersonasHotel();

        System.out.println("La cantidad de personas en el Hotel es de: "+cantPersonasEnElHotel);

        int cantPersonasMayores = California.contarHabitacionesCon(4);

        System.out.println("La cantidad de habitaciones con la misma cantidad de adultos es de: "+cantPersonasMayores);

        int hab[] = California.ArrayPorHabitantes();
        System.out.println(Arrays.toString(hab));

    }
}