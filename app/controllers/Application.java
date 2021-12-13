package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void InicialitzarBaseDades(){
        Cantant cantant1 = new Cantant("Cantant1").save();
        Cantant cantant2 = new Cantant("Cantant2").save();

        Disc disc1 = new Disc("disc1").save();
        Disc disc2 = new Disc("disc2").save();



        cantant1.discs.add(disc1);
        disc1.cantant = cantant1;
        cantant1.discs.add(disc2);
        disc2.cantant = cantant1;

        disc1.save();
        disc2.save();


        cantant1.save();
        cantant2.save();
    }

    public static void NombreDiscs(String nom){

        Cantant c1 = Cantant.find("byNom", nom).first();

        if(c1 != null){
            int numDisc = 0;
            for(Disc d : c1.discs){
                if(d != null){
                    numDisc++;
                }
                renderText(numDisc);
            }
        }
        else{
            renderText("No hi ha dades d'aquest cantant");
        }
    }
}