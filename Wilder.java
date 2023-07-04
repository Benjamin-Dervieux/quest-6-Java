public class Wilder {

    private String firstname;
    private boolean aware;

    Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //method
    public  String whoAmI(){
        return "Je m'appelle " + this.getFirstname() + " et je suis " + this.isAware();
    }

    //getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware (){
        return this.aware;
    }

    //setters
    public void setFirstname( String firstname){
        this.firstname = firstname;
    }

    public void setAware(boolean aware){
        this.aware = aware;
    }

public String firstnameAndAge() {
    String message = " et je suis ";
    if (this.isAware()) {
        return message + "Aware !!!";
    } else {
        return message + "je ne suis pas Aware";
    }
}

}