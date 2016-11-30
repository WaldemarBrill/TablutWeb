package controllers;

import play.mvc.*;

import views.html.*;

public class TablutController extends Controller {

    public Result game() {
        return ok(tablut.render("Bist jetzt in game dude."));
    }
    
    public Result help() {
        return ok(help.render("Bist jetzt in help dude."));
    }
    
    public Result controls() {
        return ok(controls.render("Bist jetzt in controls dude"));
    }
}