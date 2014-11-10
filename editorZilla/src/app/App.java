package app;

import view.View;
import controller.Controller;


public class App {

	public static void main(String[] args) {
       
        Controller controller = new Controller();
        new View(controller).setVisible(true);

    }
}
