package model;

public class Neonaves extends Neognatos
{
	private double longitudPatas;
	private int numeroDedosPatas;
	
	public Neonaves( int numeroHuesosPatas, double longitudTercerDedo, double longitudPatas, int numeroDedosPatas)
	{
		super(numeroHuesosPatas, longitudTercerDedo);
		this.longitudPatas=longitudPatas;
		this.numeroDedosPatas=numeroDedosPatas;
	}	
	public double getLongitudPatas()
	{
		return longitudPatas;
	}
	public int getNumeroDedosPatas()
	{
		return numeroDedosPatas;
	}	
	
}