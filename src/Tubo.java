public class Tubo {
    private int altezza;
    private int raggio;

    public Tubo(int altezza, int raggio) {
        this.altezza = altezza;
        this.raggio = raggio;
    }

    public double volume(){
        double area= 3.14*(raggio^2);
        return altezza*area;
    }

    public double superficieTot(){
        double area= 3.14*(raggio^2);
        return (area*2+2*3.14*raggio*altezza);
    }

}
