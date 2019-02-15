
package views.html

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

object aboutus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("About Us")/*1.18*/{_display_(Seq[Any](format.raw/*1.19*/("""
	"""),format.raw/*2.2*/("""<h1>About the online flee market</h1>
	<h3>So, the thing about us is... The place where you can buy anything and sell anyting<br/> (as long as it is legal and morally ok)</h3>
""")))}),format.raw/*4.2*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 15 09:36:30 GMT 2019
                  SOURCE: /home/wdd/revisionPlayFrameWork/WDD1PlayLab/app/views/aboutus.scala.html
                  HASH: cdc7ed90407925991fed9bd8e9b288dacae73b5b
                  MATRIX: 1032->1|1056->17|1094->18|1123->21|1331->200
                  LINES: 33->1|33->1|33->1|34->2|36->4
                  -- GENERATED --
              */
          