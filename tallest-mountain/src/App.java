import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //List to store formations
        List<Formation> formations = new ArrayList<>();
        formations.add(new Mountain(8848, "Mount Everest"));
        formations.add(new Mesa(5000, "Mesa Verde", 1000.5));
        formations.add(new Mountain(16581, "Aconcagua"));

        //display information for each formation
        for (Formation formation : formations) {
            System.out.println(formation.getInfo());
        }

        //find the tallest formation
        Formation tallest = formations.get(0);
        for (Formation formation : formations) {
            if (formation.getHeight() > tallest.getHeight()) {
                tallest = formation;
            }
        }

        //display the tallest formation
        System.out.println("The tallest formation is: " + tallest.getInfo());

        //find tallest Mesa
        Formation tallestMesa = null;
        for (Formation formation : formations) {
            if (formation instanceof Mesa) {
                if (tallestMesa == null || formation.getHeight() > tallestMesa.getHeight()) {
                    tallestMesa = formation;
                }
            }
        }
        //display the tallest Mesa
        if (tallestMesa != null) {
            System.out.println("The tallest Mesa is: " + tallestMesa.getInfo());
        } else {
            System.out.println("There are no Mesas in the list.");
        }
    }
}
