
package Coordenadas;

public class Punto3D extends Punto {
	
	private double z;

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z=z;
	}
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double distanciaPunto(Punto3D parametro) {
		double x, y, z;
		x = this.x - parametro.getX();
		y = this.y - parametro.getY();
		z = this.z - parametro.getZ();

		return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2)));
	}

	
	public double distanciaPunto() {

		double x = this.x, y = this.y, z = this.z;
		return Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2) + (Math.pow(z, 2))));
	}

	public Double cambiarZ(Punto3D parametro) {

		double z1;
		z1 = z + parametro.getZ();
		return z1;

	}
	public double cambiarX(Punto3D parametro) {

        double x1;
        x1 = x + parametro.getX();
        return x1;

    }

    public double cambiarY(Punto3D parametro) {

        double y1;
        y1 = y + parametro.getY();
        return y1;

    }

	public String toString() {
		return "Punto3D [z=" + z + "]";
	}

}
