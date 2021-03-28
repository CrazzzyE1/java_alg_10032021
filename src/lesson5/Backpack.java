package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int sizeBackpack;
    private int bestCost;
    private List<Thing> things = new ArrayList<>();
    private List<Thing> thingsInBackpack = new ArrayList<>();

    public Backpack(int sizeBackpack, int countThings) {
        this.sizeBackpack = sizeBackpack;
        createThings(countThings);
    }

    public void uploadBackpack() {
        doAllSet(things);
    }

    private void createThings(int size) {
        for (int i = 0; i < size; i++) {
            things.add(new Thing());
        }
    }

    public void showAllThings() {
        for (int i = 0; i < things.size(); i++) {
            System.out.print("Things #" + (i + 1) + ": Weight: " + things.get(i).getWeight() +
                    " Cost: " + things.get(i).getCost());
            System.out.println();
        }
    }

    public void showThingsInBackpack() {
        System.out.println();
        System.out.println("Things in BlackPack");
        System.out.println("Cost: " + getCost(thingsInBackpack) + " Weight: " + getWeight(thingsInBackpack));
        for (int i = 0; i < thingsInBackpack.size(); i++) {
            System.out.print("Things #" + (i + 1) + ": Weight: " + thingsInBackpack.get(i).getWeight() +
                    " Cost: " + thingsInBackpack.get(i).getCost());
            System.out.println();
        }

    }

    private int getCost(List<Thing> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).getCost();
        }
        return result;
    }

    private int getWeight(List<Thing> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).getWeight();
        }
        return result;
    }

    public void doAllSet(List<Thing> list) {
        if (list.size() > 0)
            checkSet(list);
        for (int i = 0; i < list.size(); i++) {
            List<Thing> tmpSet = new ArrayList<>(list);
            tmpSet.remove(i);
            doAllSet(tmpSet);
        }
    }

    private void checkSet(List<Thing> list) {
        if(getWeight(list) <= sizeBackpack && getCost(list) > bestCost) {
            thingsInBackpack = list;
            bestCost = getCost(list);
        }
    }

}
