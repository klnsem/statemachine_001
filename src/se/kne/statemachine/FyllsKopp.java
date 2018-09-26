package se.kne.statemachine;

public class FyllsKopp extends State {

    @Override
    public void isHappening() {
        System.out.println("koppen halvfylld");
    }

    @Override
    public void fillCup(Kaffekopp kaffekopp) {
        kaffekopp.setNewState(kaffekopp.getStates().get("full"));
    }

    @Override
    public void emptyCup(Kaffekopp kaffekopp) {
        kaffekopp.setNewState(kaffekopp.getStates().get("tom"));
    }
}
