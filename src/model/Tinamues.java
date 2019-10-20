package model;

public class Tinamues extends Paleognatos
{
	private double velocidadTierra;
	
	public Tinamues(int numeroHuesosPaladar, double velocidadTierra)
	{
		super(numeroHuesosPaladar);
		this.velocidadTierra=velocidadTierra;
	}
	public double getVelocidadTierra()
	{
		return velocidadTierra;
	}
	
}