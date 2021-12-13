package models;
import java.util.*;
import javax.persistence.*;
import play.db.jpa.Model;

@Entity
public class Cantant extends Model {

    public String nom;

    @OneToMany
    public List<Disc> discs = new ArrayList();

    public Cantant(String nom){
        this.nom = nom;
    }
}
