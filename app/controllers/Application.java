package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Controller for the home page.
   * @return Returns the rendered index template.
   */
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
