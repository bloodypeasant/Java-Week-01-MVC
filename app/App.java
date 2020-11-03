package app;

import app.controller.Controller;
import app.model.Model;
import app.sprite.Sprite;
import app.view.View;
import static utilities.Console.*;

import java.util.ArrayList;

public class App {

  private Controller controller;
  private Model model;
  private View view;
  public ArrayList<Sprite> sprites = new ArrayList<>();

  public App() {
    log(YELLOW, "Constructing app");
    model = new Model(this);
    view = new View(this);
    controller = new Controller(this);
    sprites.add(new Sprite("app/images/ship.png", 0.5, 400, 300, 200));
    init();
    run();
    fin();
  }

  private void fin() {
    log(YELLOW, "Finalizing app");
    model.fin();
    view.fin();
    controller.fin();
  }

  private void init() {
    log(YELLOW, "Initializing app");
    for (Sprite sprite : sprites) {
      sprite.init();
    }
    model.init();
    view.init();
    controller.init();
  }

  private void run() {
    log(YELLOW, "Running app");
    model.run();
    view.run();
    controller.run();
  }

}
