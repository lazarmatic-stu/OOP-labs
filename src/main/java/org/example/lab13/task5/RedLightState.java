package org.example.lab13.task5;

interface TrafficLightState {
    void transitionToRed(TrafficLightContext context);
    void transitionToGreen(TrafficLightContext context);
    void transitionToYellow(TrafficLightContext context);
}

class RedLightState implements TrafficLightState {
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Already in red state.");
    }

    public void transitionToGreen(TrafficLightContext context) {
        context.setState(new GreenLightState());
        System.out.println("Changing to Green.");
    }

    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Cannot change directly from Red to Yellow.");
    }
}

class YellowLightState implements TrafficLightState {
    public void transitionToRed(TrafficLightContext context) {
        context.setState(new RedLightState());
        System.out.println("Changing to Red.");
    }

    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Cannot change directly from Yellow to Green.");
    }

    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Already in Yellow state.");
    }
}

class GreenLightState implements TrafficLightState {
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Cannot change directly from Green to Red.");
    }

    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Already in Green state.");
    }

    public void transitionToYellow(TrafficLightContext context) {
        context.setState(new YellowLightState());
        System.out.println("Changing to Yellow.");
    }
}

class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        state = new RedLightState(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void transitionToRed() {
        state.transitionToRed(this);
    }

    public void transitionToGreen() {
        state.transitionToGreen(this);
    }

    public void transitionToYellow() {
        state.transitionToYellow(this);
    }
}

class Main{
    public static void main(String[] args){
        TrafficLightContext context = new TrafficLightContext();
        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
    }
}
