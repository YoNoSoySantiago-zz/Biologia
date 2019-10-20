package model;

public class Galloansarae extends Paleognatos
{
	private boolean domesticasOCaza;
	private boolean monogamaOPoligama;
	
	public Galloansarae(int numeroHuesosPatas, double longitudTercerDedo, boolean domesticasOCaza, boolean monogamaOPoligama)
	{
		super(numeroHuesosPatas, longitudTercerDedo);
		this.domesticasOCaza=domesticasOCaza;
		this.monogamaOPoligama=monogamaOPoligama;
	}
	public boolean getDomsticaOCaza()
	{
		return domesticasOCaza;
	}
	public boolean getMonogamaOPoligama()
	{
		return monogamaOPoligama;
	}
	
}