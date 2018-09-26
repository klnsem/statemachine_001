package se.kne.statemachine;

public class TomKopp extends State {

    @Override
    public void isHappening() {
        System.out.println("koppen är tom");
    }

    @Override
    public void fillCup(Kaffekopp kaffekopp) {
        kaffekopp.setNewState(kaffekopp.getStates().get("fylls"));
    }

    @Override
    public void emptyCup(Kaffekopp kaffekopp) {
        System.out.println("koppen är redan tom!");
    }
}
