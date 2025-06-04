
package model;


public class AutoInfok {
    private String rendszam;
    private String datum;
    private String fizmod;
    private double tav ;
    private int osszeg;
    private int borravalo;
    private boolean dohanyzik;
    
    
     public AutoInfok(String sor) {
        String[] adatok = sor.split(";");
        rendszam= adatok[0];
        datum= adatok[1];
        fizmod=adatok[2];
        tav=Double.parseDouble(adatok[3]);
        osszeg=Integer.parseInt(adatok[4]);
        borravalo=Integer.parseInt(adatok[5]);
        dohanyzik=Boolean.parseBoolean(adatok[6]);
    }

    public AutoInfok(String rendszam, String datum, String fizmod, double tav, int osszeg, int borravalo, boolean dohanyzik) {
        this.rendszam = rendszam;
        this.datum = datum;
        this.fizmod = fizmod;
        this.tav = tav;
        this.osszeg = osszeg;
        this.borravalo = borravalo;
        this.dohanyzik = dohanyzik;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getDatum() {
        return datum;
    }

    public String getFizmod() {
        return fizmod;
    }

    public double getTav() {
        return tav;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public int getBorravalo() {
        return borravalo;
    }

    public boolean isDohanyzik() {
        return dohanyzik;
    }

    @Override
    public String toString() {
        return "AutoInfok{" + "rendszam=" + rendszam +
               ", datum=" + datum + ", fizmod=" + fizmod +
               ", tav=" + tav + ", osszeg=" + osszeg +
               ", borravalo=" + borravalo + ", dohanyzik=" + dohanyzik + '}';
    }
    
}
