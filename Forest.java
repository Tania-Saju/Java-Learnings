package org.jsp.tight.coupling;

public class Forest {
	public void animalFood(Dog d) {
		d.eat();
	}

	public void animalFood(Monkey m) {
		m.eat();

	}

	public void animalFood(Lion l) {

		l.eat();

	}
}