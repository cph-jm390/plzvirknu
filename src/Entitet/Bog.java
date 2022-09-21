package Entitet;

public class Bog {
private int bogId;
private String title;
private String forfatter;

    public Bog(String title, String forfatter) //objekt til DB
    {
        this.title = title;
        this.forfatter = forfatter;
    }

    public Bog(int bogId, String title, String forfatter) //db til objekt
    {
        this.bogId = bogId;
        this.title = title;
        this.forfatter = forfatter;


    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int bogId) {
        this.bogId = bogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }
}
