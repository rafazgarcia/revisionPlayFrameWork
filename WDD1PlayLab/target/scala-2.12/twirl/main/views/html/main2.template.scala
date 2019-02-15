
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

object main2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
			<link rel="icon" type="image/png" href=""""),_display_(/*5.45*/routes/*5.51*/.Assets.versioned("images/favicon.png")),format.raw/*5.90*/("""">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="public/stylesheets/main2.css">
	<style>
	    .footer """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/(""" """),format.raw/*10.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*10.74*/("""}"""),format.raw/*10.75*/("""
	    """),format.raw/*11.6*/(""".sidecol """),format.raw/*11.15*/("""{"""),format.raw/*11.16*/(""" """),format.raw/*11.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*11.65*/("""}"""),format.raw/*11.66*/("""
	    """),format.raw/*12.6*/(""".sidecol h2 """),format.raw/*12.18*/("""{"""),format.raw/*12.19*/(""" """),format.raw/*12.20*/("""font-weight: bold; """),format.raw/*12.39*/("""}"""),format.raw/*12.40*/("""
	    """),format.raw/*13.6*/(""".midcol h1 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*13.75*/("""}"""),format.raw/*13.76*/("""
	    """),format.raw/*14.6*/(""".midcol h3 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""text-align: center; color: steelblue; """),format.raw/*14.57*/("""}"""),format.raw/*14.58*/("""
	    """),format.raw/*15.6*/(""".redtext """),format.raw/*15.15*/("""{"""),format.raw/*15.16*/(""" """),format.raw/*15.17*/("""color: red; """),format.raw/*15.29*/("""}"""),format.raw/*15.30*/("""
	"""),format.raw/*16.2*/("""</style>
	<title>OFM """),_display_(/*17.14*/pagename),format.raw/*17.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*26.12*/if(pagename == "Home")/*26.34*/ {_display_(Seq[Any](format.raw/*26.36*/("""class="active"""")))}),format.raw/*26.51*/("""><a href=""""),_display_(/*26.62*/routes/*26.68*/.HomeController.index()),format.raw/*26.91*/("""">Home</a></li>
		    <li """),_display_(/*27.12*/if(pagename == "On Sale")/*27.37*/ {_display_(Seq[Any](format.raw/*27.39*/("""class ="active"""")))}),format.raw/*27.55*/("""><a href=""""),_display_(/*27.66*/routes/*27.72*/.HomeController.onsale()),format.raw/*27.96*/("""">On sale</a></li>
			<li """),_display_(/*28.9*/if(pagename == "About Us")/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""class="active"""")))}),format.raw/*28.51*/("""><a href=""""),_display_(/*28.62*/routes/*28.68*/.HomeController.aboutus()),format.raw/*28.93*/("""">About us</a></li>
			<li """),_display_(/*29.9*/if(pagename == "Page One")/*29.35*/{_display_(Seq[Any](format.raw/*29.36*/("""class="active"""")))}),format.raw/*29.51*/("""><a href=""""),_display_(/*29.62*/routes/*29.68*/.HomeController.pageone()),format.raw/*29.93*/("""">Page One</a></li>
			<li """),_display_(/*30.9*/if(pagename == "Page Two")/*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""class="active"""")))}),format.raw/*30.51*/("""><a href=""""),_display_(/*30.62*/routes/*30.68*/.HomeController.pagetwo()),format.raw/*30.93*/("""">Page Two</a></li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-6">
		    <div class="well sidecol">
			<h2>Extra Pages :)</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
              """),_display_(/*46.16*/content),format.raw/*46.23*/("""
		    """),format.raw/*47.7*/("""</div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
    </body>
</html>


"""))
      }
    }
  }

  def render(pagename:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename) => (content) => apply(pagename)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 15 10:19:55 GMT 2019
                  SOURCE: /home/wdd/revisionPlayFrameWork/WDD1PlayLab/app/views/main2.scala.html
                  HASH: 4aabd08fd96e0a1298a0f718da153df350425695
                  MATRIX: 953->1|1080->35|1184->113|1198->119|1257->158|1468->341|1497->342|1526->343|1612->401|1641->402|1674->408|1711->417|1740->418|1769->419|1845->467|1874->468|1907->474|1947->486|1976->487|2005->488|2052->507|2081->508|2114->514|2153->525|2182->526|2211->527|2295->583|2324->584|2357->590|2396->601|2425->602|2454->603|2520->641|2549->642|2582->648|2619->657|2648->658|2677->659|2717->671|2746->672|2775->674|2824->696|2853->704|3119->943|3150->965|3190->967|3236->982|3274->993|3289->999|3333->1022|3387->1049|3421->1074|3461->1076|3508->1092|3546->1103|3561->1109|3606->1133|3659->1160|3694->1186|3733->1187|3779->1202|3817->1213|3832->1219|3878->1244|3932->1272|3967->1298|4006->1299|4052->1314|4090->1325|4105->1331|4151->1356|4205->1384|4240->1410|4279->1411|4325->1426|4363->1437|4378->1443|4424->1468|4994->2011|5022->2018|5056->2025
                  LINES: 28->1|33->2|36->5|36->5|36->5|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|48->17|48->17|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|77->46|77->46|78->47
                  -- GENERATED --
              */
          