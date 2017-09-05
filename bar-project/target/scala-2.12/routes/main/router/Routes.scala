
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mingina/Workspace/bars/bar-project/conf/routes
// @DATE:Tue Sep 05 23:45:37 EAT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  UserController_1: controllers.UserController,
  // @LINE:13
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    UserController_1: controllers.UserController,
    // @LINE:13
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, UserController_1, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """name<[^/]+>""", """controllers.HomeController.index(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.userGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.userPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """name<[^/]+>""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_userGet1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_userGet1_invoker = createInvoker(
    UserController_1.userGet(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userGet",
      Nil,
      "GET",
      this.prefix + """user""",
      """GET    /                           controllers.HomeController.newUser()""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_userPost2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_userPost2_invoker = createInvoker(
    UserController_1.userPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userPost",
      Nil,
      "POST",
      this.prefix + """user""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(name))
      }
  
    // @LINE:8
    case controllers_UserController_userGet1_route(params) =>
      call { 
        controllers_UserController_userGet1_invoker.call(UserController_1.userGet())
      }
  
    // @LINE:9
    case controllers_UserController_userPost2_route(params) =>
      call { 
        controllers_UserController_userPost2_invoker.call(UserController_1.userPost())
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
