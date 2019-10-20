package model;

public class Neognatos extends Neornithes
{
	private int numeroHuesosPatas;
	private double longitudTercerDedo;
	
	public Neognatos(double longitudCola, double densidadOsea, String rangoMetabolico, int numeroHuesosPatas, double longitudTercerDedo)
	{
		super(longitudCola, densidadOsea, rangoMetabolico);
		this.numeroHuesosPatas=numeroHuesosPatas;
		this.longitudTercerDedo=longitudTercerDedo;
	}
	public int getNumeroHuesosPatas()
	{
		return numeroHuesosPatas;
	}
	public double getLongitudTercerDedo()
	{
		return longitudTercerDedo;
	}
}