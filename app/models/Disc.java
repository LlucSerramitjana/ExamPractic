package models;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;
@Entity
public class Disc extends Model{
    public String titol;

    @ManyToOne
    public Cantant cantant;

    public Disc(String titol){
        this.titol=titol;
    }

}
