
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("On Sale")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
	"""),format.raw/*2.2*/("""<h1>On sale here</h1>
	<h4>Note that all products are second hand, unless otherwise stated.</h4>
	<table class="table table-bordered table-hover table-condensed">
		<thead>
		<!-- The header row-->
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Stock</th>
			<th>Price</th>
		</tr>
		</thead>
		<tbody>
		<!-- Product row(s) -->
		<tr>
			<td>1</td>
			<td>Television</td>
			<td>Sony 42" LCD</td>
			<td>1</td>
			<td>100.00</td>
		</tr>
		<!-- Product row(s) -->
		<tr>
			<td>2</td>
			<td>Book</td>
			<td>Mysteries of the Universe</td>
			<td>1</td>
			<td>3.00</td>
		</tr>
		</tbody>
	</table>
""")))}),format.raw/*34.2*/("""



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
                  DATE: Fri Feb 15 10:22:43 GMT 2019
                  SOURCE: /home/wdd/revisionPlayFrameWork/WDD1PlayLab/app/views/onsale.scala.html
                  HASH: 8d50fac65f753ff5487d6ed4f23a38bb497a5574
                  MATRIX: 1031->1|1054->16|1092->17|1121->20|1808->677
                  LINES: 33->1|33->1|33->1|34->2|66->34
                  -- GENERATED --
              */
          