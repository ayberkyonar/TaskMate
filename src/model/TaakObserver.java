package model;

public class TaakObserver implements Observer {
    private Sprint sprint;

    public TaakObserver(Sprint sprint) {
        this.sprint = sprint;
    }

    @Override
    public void update() {
        System.out.println();
        System.out.println("Succesvol! Een taak is toegevoegd aan de sprint: " + sprint);
        System.out.println("Het aantal taken in de sprint is nu: " + sprint.getAantalTaken());
        System.out.println();
    }
}