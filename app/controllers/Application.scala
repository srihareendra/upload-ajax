package controllers

import play.api._
import play.api.mvc._
import java.io.File
class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
def uploadFile = Action{ implicit request =>
   
  
    Ok("Got request [" + request.body + "]")
  }
}
