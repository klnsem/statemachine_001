package se.kne.statemachine;

abstract class State {

    abstract public void isHappening();
    abstract public void fillCup(Kaffekopp kaffekopp);
    abstract public void emptyCup(Kaffekopp kaffekopp);

}
