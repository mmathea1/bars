
package views.html.user

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<h1>New User</h1>

"""),_display_(/*5.2*/flash/*5.7*/.getOrDefault("success", "")),format.raw/*5.35*/("""

"""),_display_(/*7.2*/helper/*7.8*/.form(action = routes.UserController.userPost())/*7.56*/ {_display_(Seq[Any](format.raw/*7.58*/("""
  """),_display_(/*8.4*/helper/*8.10*/.CSRF.formField),format.raw/*8.25*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(userForm("name"))),format.raw/*9.38*/("""
  """),_display_(/*10.4*/helper/*10.10*/.inputText(userForm("age"))),format.raw/*10.37*/("""
  """),_display_(/*11.4*/helper/*11.10*/.inputRadioGroup(userForm("sex"), Seq("male" -> "male", "female" -> "female"))),format.raw/*11.88*/("""
  """),format.raw/*12.3*/("""<input type="submit" value="submit"/>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[UserData]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[UserData]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 05 20:24:45 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/bars/bar-project/app/views/user/form.scala.html
                  HASH: d14878634b87bc8c29abd9459c7774123788fb75
                  MATRIX: 960->1|1081->27|1111->31|1158->53|1170->58|1218->86|1248->91|1261->97|1317->145|1356->147|1386->152|1400->158|1435->173|1465->178|1479->184|1527->212|1558->217|1573->223|1621->250|1652->255|1667->261|1766->339|1797->343|1867->383
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|45->13
                  -- GENERATED --
              */
          