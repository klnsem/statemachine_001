package se.kne.statemachine;

public class FullKopp extends State {

    @Override
    public void isHappening() {
        System.out.println("koppen är full!");
    }

    @Override
    public void fillCup(Kaffekopp kaffekopp) {
        System.out.println("Koppen är redan full!");
    }

    @Override
    public void emptyCup(Kaffekopp kaffekopp) {
        kaffekopp.setNewState(kaffekopp.getStates().get("tom"));
    }
}
