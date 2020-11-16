package observers.observersImpl;

import observers.Observer;

public class ObserverImpl2 implements Observer{

	double lastState;
	@Override
	public void update(int etat) {
		if(etat-lastState>0) {
			System.out.println("Observer 2 Augmentation pression ");
		
		}
		else if(etat-lastState<0) {
			System.out.println("Observer 2 depression pression ");	
		}
		else
			System.out.println("Observer 2 stabilite pression ");

		lastState=etat;

	}

}
