package controllers;

import play.mvc.*;

import views.html.*;
import de.htwg.se.tablut.Tablut;
import de.htwg.se.tablut.aview.TextUI;
import de.htwg.se.tablut.bcontroller.IController;

public class TablutController extends Controller {
	Tablut tablut = Tablut.getInstance();
	TextUI tui = tablut.getTui();
	IController controller = tablut.getController();
	
    public Result game() {
    	tui.funktion("9");
        return ok(game.render(controller));
    }
    
    public Result help() {
        return ok(help.render("Bist jetzt in help dude."));
    }
    
    public Result controls() {
        return ok(controls.render("Bist jetzt in controls dude"));
    }
}