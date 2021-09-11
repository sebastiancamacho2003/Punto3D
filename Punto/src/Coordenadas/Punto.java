package Coordenadas;

public class Punto {

    protected double x;
    protected double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x1) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(x= " + getX() + ", y= " + getY() + " )";
    }

    public double calcularDistancia(Punto parametros) {
        double x1, x2;
        x1 = x - parametros.getX();
        x2 = y - parametros.getY();

        return (Math.sqrt(Math.pow(x1, 2)) + (Math.pow(x2, 2)));

    }

    public double calcularDistancia() {
        double x1, x2;
        x1 = x;
        x2 = y;
        return (Math.sqrt(Math.pow(x1, 2)) + (Math.pow(x2, 2)));
    }

    public double cambiarX(Punto parametro) {

        double x1;
        x1 = x + parametro.getX();
        return x1;

    }

    public double cambiarY(Punto parametro) {

        double y1;
        y1 = y + parametro.getY();
        return y1;

    }

}
