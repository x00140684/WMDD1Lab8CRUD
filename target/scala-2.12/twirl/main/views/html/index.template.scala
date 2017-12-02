
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""


"""),_display_(/*4.2*/main("Products Page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/(""" 
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p> 
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
          """),format.raw/*19.62*/("""
        """),_display_(/*20.10*/for(p<-products) yield /*20.26*/{_display_(Seq[Any](format.raw/*20.27*/("""
            """),format.raw/*21.13*/("""<tr> 
                <td>"""),_display_(/*22.22*/p/*22.23*/.getId),format.raw/*22.29*/("""</td> 
                <td>"""),_display_(/*23.22*/p/*23.23*/.getName),format.raw/*23.31*/("""</td> 
                <td>"""),_display_(/*24.22*/p/*24.23*/.getDescription),format.raw/*24.38*/("""</td> 
                <td>"""),_display_(/*25.22*/p/*25.23*/.getStock),format.raw/*25.32*/("""</td> 
                <td id="priceAlRight">&euro; """),_display_(/*26.47*/("%.2f".format(p.getPrice))),format.raw/*26.74*/("""</td>
            </tr> 
        """)))}),format.raw/*28.10*/("""
      """),format.raw/*29.7*/("""</tbody> 
  </table> 
  """)))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 15:08:00 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab8CRUD/app/views/index.scala.html
                  HASH: ab454939c169aba3bb9442a93c9c325a1596b1fa
                  MATRIX: 962->1|1089->33|1118->37|1147->58|1186->60|1216->64|1629->500|1666->510|1698->526|1737->527|1778->540|1832->567|1842->568|1869->574|1924->602|1934->603|1963->611|2018->639|2028->640|2064->655|2119->683|2129->684|2159->693|2239->746|2287->773|2352->807|2386->814
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|60->28|61->29
                  -- GENERATED --
              */
          