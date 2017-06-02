package th.ku.fscishl.example.controller;

import th.ku.fscishl.example.model.Animal;
import th.ku.fscishl.example.view.WindowView;

public class MyController {
	public void startApplication() {
		WindowView window = new WindowView("Example of Animal");
		Animal animal = new Animal("Dog jung");
		window.setResult(animal.getName());
		window.render();
	}
}