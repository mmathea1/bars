package controllers;

/**import models.Bar;**/
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index()
    {
        return redirect(controllers.routes.HomeController.hello("Avator"));
    }

    public Result hello(String name){
        return ok("Hello " +name);
    }



}
