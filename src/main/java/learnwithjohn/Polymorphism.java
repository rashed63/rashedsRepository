package learnwithjohn;

public class Polymorphism {
    public static void main(String[] args) {


        //polymorphism is an object oriented concept
        //polymorphism means many shapes;
        Plant plant1 = new Plant();
        plant1.grow();

        Tree tree = new Tree();
        Plant plant2 = tree;
        plant2.grow();
        tree.shedLeaves();
        doGrow(tree);
        //not relatable to this code but still usegul to know<
        //API= Application Programming Interface!
    }
    public static void doGrow(Plant plant1){
        plant1.grow();

    }
}
