
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> animaux = new ArrayList<Animal>();
        animaux.add(new Chat(new LeChat()));
        animaux.add(new Vache(new LaVache()));
        for (Animal a : animaux) {
            a.forme();
            a.cri();
        }
    }
}

