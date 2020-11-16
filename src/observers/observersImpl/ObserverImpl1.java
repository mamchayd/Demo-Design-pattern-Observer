package observers.observersImpl;

import observers.Observer;

public class ObserverImpl1 implements Observer{

	private double somme;
	@Override
	public void update(int etat) {
		somme+=etat;
		System.out.println("Observer1 somme="+somme);
	}

}
