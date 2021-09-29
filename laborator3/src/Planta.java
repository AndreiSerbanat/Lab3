public class Planta {

    public String nume;
    public String culoare;
    private boolean fruct;
    private double pret;

    public Planta(){

    }

    public Planta(String nume, String culoare, int marime, boolean fruct){
        this.nume = nume;
        this.culoare = culoare;
        this.fruct = fruct;
        this.pret = pret;
    }

    public void getFruct()
    {
        if(this.fruct == true)
            System.out.println("Planta are fruct");
        else
            System.out.println("Planta nu are fruct");
    }

    public void getPret()
    {
        System.out.println("Planta are pretul de :" + this.pret);
    }

    public void setFruct(boolean fruct)
    {
        this.fruct = fruct;
        System.out.println("S-a setat fruct= " + fruct);
    }

    public void setPret(double pret)
    {
        this.pret = pret;
        System.out.println("S-a setat pretul: " + pret);
    }

    public boolean areFruct()
    {
        if (this.fruct == true)
            return true;
        else
            return false;
    }

    public boolean copt()
    {
        if(this.culoare == "verde")
            return false;
        else
            return true;
    }

}
