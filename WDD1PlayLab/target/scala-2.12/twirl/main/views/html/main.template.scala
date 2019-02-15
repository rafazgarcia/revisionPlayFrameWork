
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
              """),_display_(/*46.16*/content),format.raw/*46.23*/("""
		    """),format.raw/*47.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
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
                  DATE: Fri Feb 15 10:16:44 GMT 2019
                  SOURCE: /home/wdd/revisionPlayFrameWork/WDD1PlayLab/app/views/main.scala.html
                  HASH: 7b6f9786a8c9da049d7e04cabcd7b778be6182ab
                  MATRIX: 952->1|1079->35|1183->113|1197->119|1256->158|1508->382|1537->383|1566->384|1652->442|1681->443|1714->449|1751->458|1780->459|1809->460|1885->508|1914->509|1947->515|1987->527|2016->528|2045->529|2092->548|2121->549|2154->555|2193->566|2222->567|2251->568|2335->624|2364->625|2397->631|2436->642|2465->643|2494->644|2560->682|2589->683|2622->689|2659->698|2688->699|2717->700|2757->712|2786->713|2815->715|2864->737|2893->745|3159->984|3190->1006|3230->1008|3276->1023|3314->1034|3329->1040|3373->1063|3427->1090|3461->1115|3501->1117|3548->1133|3586->1144|3601->1150|3646->1174|3699->1201|3734->1227|3773->1228|3819->1243|3857->1254|3872->1260|3918->1285|3972->1313|4007->1339|4046->1340|4092->1355|4130->1366|4145->1372|4191->1397|4245->1425|4280->1451|4319->1452|4365->1467|4403->1478|4418->1484|4464->1509|5024->2042|5052->2049|5086->2056
                  LINES: 28->1|33->2|36->5|36->5|36->5|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|48->17|48->17|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|77->46|77->46|78->47
                  -- GENERATED --
              */
          