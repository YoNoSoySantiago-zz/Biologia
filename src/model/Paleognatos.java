package model;

public class Paleognatos extends Neornithes
{
	private int numeroHuesosPaladar;
	
	public Paleognatos(double longitudCola, double densidadOsea, String rangoMetabolico, int numeroHuesosPaladar)
	{
		super(longitudCola, densidadOsea, rangoMetabolico);
		this.numeroHuesosPaladar=numeroHuesosPaladar;
	}
	public int getNumeroHuesosPaladar()
	{
		return numeroHuesosPaladar;
	}
}