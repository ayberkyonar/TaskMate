package menu;

public abstract class Menukeuze {

    private String titel;

    public Menukeuze(String titel){
        this.titel = titel;
    }

    public String getNaam(){
        return titel;
    }

    abstract public void voerMenukeuzeUit();

}
