package entity;

public class Placement {
    private String kota;
    private int umk;

    public Placement(String kota, int umk) {
        this.kota = kota;
        this.umk = umk;
    }
    public String getKota() {return kota;}
    public int getUmk() {return umk;}
}
