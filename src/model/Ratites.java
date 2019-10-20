package model;

public class Ratites extends Paleognatos
{
	private boolean presentanOrquilla;
	
	public Ratites(int numeroHuesosPaladar, boolean presentanOrquilla)
	{
		super(numeroHuesosPaladar);
		this.presentanOrquilla=presentanOrquilla;
	}
	public boolean getPresentaOrquilla()
	{
		return presentanOrquilla;
	}
}