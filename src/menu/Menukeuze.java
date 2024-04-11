package menu;

public abstract class Menukeuze {

    private String titel;

    public Menukeuze(String titel){
        this.titel = titel;
    }

    public String getTitel(){
        return titel;
    }

    abstract public void voerMenukeuzeUit();


}
