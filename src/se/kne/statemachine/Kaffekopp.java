package se.kne.statemachine;

import java.util.HashMap;
import java.util.Map;

class Kaffekopp {
    private Map<String, State> states = new HashMap<>();
    private State currentState;

    private boolean isFull = false;

    public Kaffekopp() {
        states.put("tom", new TomKopp());
        states.put("full", new FullKopp());
        states.put("fylls", new FyllsKopp());

        currentState = states.get("tom");
    }

    public void happening() {
        currentState.isHappening();
    }

    public void fillCoffee() {
        currentState.fillCup(this);
    }
    public void drinkCoffee() {
        currentState.emptyCup(this);
    }

    public void setNewState(State newState) {
        currentState = newState;
    }

    public Map<String, State> getStates() {
        return states;
    }

}
