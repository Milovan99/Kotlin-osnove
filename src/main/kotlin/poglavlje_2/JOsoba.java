package poglavlje_2;

public class JOsoba {

    String ime;
    Integer godine;
    Double visina;

    JOsoba(String i,Integer g,Double v){
        ime = i;
        godine = g;
        visina=v;
    }

    public double getVisina(){
        return visina;
    }
    public void setVisina(double visina){
        this.visina=visina;
    }

    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }

    public int getGodine(){
        return  godine;
    }
    public void setGodine(Integer godine){
        this.godine=godine;
    }
}

