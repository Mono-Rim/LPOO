package Controller;

import Model.Aviao;
import Model.Navio;
import Model.Personagem;
import Model.Tanque;

import java.util.ArrayList;
import java.util.List;

public class PersonagemController {
    public static void main(String[] args) {

        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao(1,1,1);
        Navio n1 = new Navio();
        Navio n2 = new Navio(2,2);
        Tanque t1 = new Tanque();
        Tanque t2 = new Tanque(3,3);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(a1);
        personagens.add(a2);
        personagens.add(n1);
        personagens.add(n2);
        personagens.add(t1);
        personagens.add(t2);
        System.out.println("\n Posição inicial dos personagens:");
        System.out.println(personagens);

        personagens.forEach((p) -> {
           p.desenhar();
           if(p instanceof Aviao){
               ((Aviao)p).mover(2,2,2);
           }else if (p instanceof Navio){
               p.mover(4,4);
           }else if (p instanceof Tanque) {
               p.mover(6, 6);
           }
        });

        System.out.println("\n Nova posição dos personagens:");
        System.out.println(personagens);





}
}