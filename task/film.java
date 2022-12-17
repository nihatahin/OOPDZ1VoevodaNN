package task;

public class film {
    ///////////////////////////////
    //Poles////////////////////////
    ///////////////////////////////
    name filmName;
    private String director;
    private String scriptWriter;
    private String composer;
    private String country;
    private String janre;
    private int year;
    private int lengthMin;
    ///////////////////////////////

    ///////////////////////////////
    //Methods//////////////////////
    ///////////////////////////////
    film(String fname, String dir, String scWr, String comp, String cntr, String janr, int y, int mins) {
        filmName = new name(fname);
        director = new String(dir);
        scriptWriter = new String(scWr);
        composer = new String(comp);
        country = new String(cntr);
        janre = new String(janr);
        year = y;
        lengthMin = mins;
    }
    ///////////////////////////////
    public String getCard()
    {
        StringBuilder card = new StringBuilder(500);

        card.append(String.format("Name:\t\t\t%s\n", filmName.getName()));
        card.append(String.format("Director:\t\t%s\n", director));
        card.append(String.format("Scriptwriter:\t\t%s\n", scriptWriter));
        card.append(String.format("Composer:\t\t%s\n", composer));
        card.append(String.format("Country:\t\t%s\n", country));
        card.append(String.format("Janre:\t\t\t%s\n", janre));
        card.append(String.format("Year:\t\t\t%d\n", year));
        card.append(String.format("Length in minutes:\t%d\n", lengthMin));
        
        return card.toString();
    }
    //----------
    
}
