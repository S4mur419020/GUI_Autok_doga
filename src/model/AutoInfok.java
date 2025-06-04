
package model;


public class AutoInfok {
    private String rendszam;
    private int datum;
    private String fizmod;
    private double tav ;
    private int osszeg;
    private int borravalo;
    private boolean donyazik;

    public AutoInfok(String rendszam, int datum, String fizmod, double tav, int osszeg, int borravalo, boolean donyazik) {
        this.rendszam = rendszam;
        this.datum = datum;
        this.fizmod = fizmod;
        this.tav = tav;
        this.osszeg = osszeg;
        this.borravalo = borravalo;
        this.donyazik = donyazik;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getDatum() {
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

    public boolean isDonyazik() {
        return donyazik;
    }

    @Override
    public String toString() {
        return "AutoInfok{" + "rendszam=" + rendszam +
               ", datum=" + datum + ", fizmod=" + fizmod +
               ", tav=" + tav + ", osszeg=" + osszeg +
               ", borravalo=" + borravalo + ", donyazik=" + donyazik + '}';
    }
    
}
