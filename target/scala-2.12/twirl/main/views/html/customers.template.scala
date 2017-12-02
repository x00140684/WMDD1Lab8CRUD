
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

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""


"""),_display_(/*4.2*/main("Customer page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/(""" 
  """),format.raw/*5.3*/("""<p class="lead">Product list</p> 
  <table class="table table-bordered table-hover table-condensed"> 
      <thead> 
      <!-- The header row--> 
      <tr> 
          <th>ID</th> 
          <th>First Name</th> 
          <th>Last Name</th> 
          <th>Address</th> 
           
      </tr> 
      </thead> 
      <tbody> 
          <!-- Product row(s) --> 
          """),format.raw/*19.62*/("""
        """),_display_(/*20.10*/for(p<-customers) yield /*20.27*/{_display_(Seq[Any](format.raw/*20.28*/("""
            """),format.raw/*21.13*/("""<tr> 
                <td>"""),_display_(/*22.22*/p/*22.23*/.getId),format.raw/*22.29*/("""</td> 
                <td>"""),_display_(/*23.22*/p/*23.23*/.getFName),format.raw/*23.32*/("""</td> 
                <td>"""),_display_(/*24.22*/p/*24.23*/.getLName),format.raw/*24.32*/("""</td> 
                <td>"""),_display_(/*25.22*/p/*25.23*/.getAddress),format.raw/*25.34*/("""</td> 
                 
            </tr> 
        """)))}),format.raw/*28.10*/("""
      """),format.raw/*29.7*/("""</tbody> 
  </table> 
  """)))}))
      }
    }
  }

  def render(customers:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 15:37:16 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab8CRUD/app/views/customers.scala.html
                  HASH: fc7e84058a73d19029065d922343c0c6c441fd9f
                  MATRIX: 967->1|1096->35|1125->39|1154->60|1193->62|1223->66|1623->489|1660->499|1693->516|1732->517|1773->530|1827->557|1837->558|1864->564|1919->592|1929->593|1959->602|2014->630|2024->631|2054->640|2109->668|2119->669|2151->680|2235->733|2269->740
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|60->28|61->29
                  -- GENERATED --
              */
          