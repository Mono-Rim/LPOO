package Controller;

import Model.Atleta;
import Model.Time;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class TimeController {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta(
                1L, "123-456-123-11", "Carlos", "Silva", new GregorianCalendar(2000,1,2)
        );
        Atleta atleta2 = new Atleta(
                    2L, "65464654", "Junior", "Ferraz", new GregorianCalendar(2000,1,2)
        );
        Atleta atleta3 = new Atleta(
                        3L, "6435645", "Jeferson", "Nunes", new GregorianCalendar(2000,1,2)
        );

        List<Atleta> atletas = new ArrayList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);

        Time time1 = new Time(1L, "GM3", "SP", atletas);

        System.out.println("Time: ");
        System.out.println(time1);

        atletas.remove(atleta3);
        System.out.println("\n\n Time sem um jogador: ");
        System.out.println(time1);



    }
}
