package Controller;


import Model.Animal;
import Model.Cachorro;
import Model.Passaro;
import Model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro(1,2);
        Cachorro c3 = new Cachorro(1,1);
        Passaro p1 = new Passaro();
        Passaro p2 = new Passaro(2,1,1);
        Passaro p3 = new Passaro(2,1,2);
        Peixe pe1 = new Peixe();
        Peixe pe2 = new Peixe(1,2,3);
        Peixe pe3 = new Peixe(4,5,6);

        List<Animal> animais = new ArrayList<>();
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(p1);
        animais.add(p2);
        animais.add(p3);
        animais.add(pe1);
        animais.add(pe2);
        animais.add(pe3);
        System.out.println(animais);

        animais.forEach((p)->{
            p.desenhar();
            if(p instanceof Passaro){
                p.mover(2,2);
            }else if (p instanceof Peixe){
                p.mover(2,2);
            }else if (p instanceof Cachorro) {
                p.mover(2, 2);
            }
        });

        System.out.println("\n Posição atual:");
        System.out.println(animais);

        animais.forEach((p)->{
            if(p instanceof Cachorro){
                p.mover(8,8);
                p.desenhar();
            }
        });

        System.out.println("\nPosição dos cachorros:");
        System.out.println(animais);

        animais.forEach((p)->{
            if(p instanceof Passaro){
                ((Passaro)p).mover(5,5, 5);
                p.desenhar();
            }else if (p instanceof Peixe){
                ((Peixe)p).mover(5,5, 5);
                p.desenhar();
            }
        });

        System.out.println("\n Posição atual:");
        System.out.println(animais);

    }
}