import abstraction.Conifer;
import abstraction.Deciduous;

public class Main {
    public static void main(String[] args) {
        Conifer coniferTree = new Conifer(4.5, 20, 20) {
            @Override
            public void grow() {
                System.out.println("Urosłem i mam igły!");

            }
        };
        System.out.println(coniferTree);
        coniferTree.shedCones();
        coniferTree.shedNeedles();

        Deciduous deciduousTree = new Deciduous(6.0, 30, true) {
            @Override
            public void grow() {
                System.out.println("Urosłem i  mam liście!");
            }
        };

        System.out.println(deciduousTree);
        deciduousTree.grow();
    }
}
