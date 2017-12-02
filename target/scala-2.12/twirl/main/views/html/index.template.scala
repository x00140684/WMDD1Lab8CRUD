
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

    """),format.raw/*7.69*/("""
    """),_display_(/*8.6*/if(flash.containsKey("success"))/*8.38*/{_display_(Seq[Any](format.raw/*8.39*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-success">
            """),_display_(/*10.14*/flash/*10.19*/.get("success")),format.raw/*10.34*/("""
        """),format.raw/*11.9*/("""</div>
    """)))}),format.raw/*12.6*/("""

  """),format.raw/*14.3*/("""<table class="table table-bordered table-hover table-condensed"> 
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
          """),format.raw/*27.62*/("""
        """),_display_(/*28.10*/for(p<-products) yield /*28.26*/{_display_(Seq[Any](format.raw/*28.27*/("""
            """),format.raw/*29.13*/("""<tr> 
                <td>"""),_display_(/*30.22*/p/*30.23*/.getId),format.raw/*30.29*/("""</td> 
                <td>"""),_display_(/*31.22*/p/*31.23*/.getName),format.raw/*31.31*/("""</td> 
                <td>"""),_display_(/*32.22*/p/*32.23*/.getDescription),format.raw/*32.38*/("""</td> 
                <td>"""),_display_(/*33.22*/p/*33.23*/.getStock),format.raw/*33.32*/("""</td> 
                <td id="priceAlRight">&euro; """),_display_(/*34.47*/("%.2f".format(p.getPrice))),format.raw/*34.74*/("""</td>
            </tr> 
        """)))}),format.raw/*36.10*/(""" """),format.raw/*36.32*/("""
      """),format.raw/*37.7*/("""</tbody> 
  </table> 
  <p>
        <a href=""""),_display_(/*40.19*/routes/*40.25*/.HomeController.addProduct()),format.raw/*40.53*/("""">
            <button class="btn btn-primary">Add a product</button>
        </a>
  </p>
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
                  DATE: Sat Dec 02 22:19:59 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab8CRUD/app/views/index.scala.html
                  HASH: d5e89ad98601b7629f654681f96fc57245dafa3a
                  MATRIX: 962->1|1089->33|1118->37|1147->58|1186->60|1216->64|1287->172|1318->178|1358->210|1396->211|1431->220|1505->267|1519->272|1555->287|1591->296|1633->308|1664->312|2036->707|2073->717|2105->733|2144->734|2185->747|2239->774|2249->775|2276->781|2331->809|2341->810|2370->818|2425->846|2435->847|2471->862|2526->890|2536->891|2566->900|2646->953|2694->980|2759->1014|2788->1036|2822->1043|2895->1089|2910->1095|2959->1123
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|59->27|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|68->36|68->36|69->37|72->40|72->40|72->40
                  -- GENERATED --
              */
          