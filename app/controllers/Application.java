package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.pueo;
/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  public static Result pueo() {
    return ok(pueo.render("Welcome to the pueo page."));
  }

}
