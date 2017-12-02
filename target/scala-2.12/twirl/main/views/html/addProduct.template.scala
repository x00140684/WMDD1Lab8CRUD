
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add product")/*7.21*/{_display_(Seq[Any](format.raw/*7.22*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>

    <!--Use the views.html.helpers package to create the form -->
    """),_display_(/*11.6*/form(action=routes.HomeController.addProductSubmit() , 'class -> "form-horizontal", 'role -> "form")/*11.106*/{_display_(Seq[Any](format.raw/*11.107*/("""

        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        
        """),format.raw/*17.9*/("""<!--Build the form, adding an input for each field -->
        <!-- Note the label parameter -->

        """),_display_(/*20.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*20.85*/("""
        """),_display_(/*21.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*21.99*/("""
        """),_display_(/*22.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*22.87*/("""
        """),_display_(/*23.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*23.87*/("""

        """),format.raw/*25.9*/("""<!--Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.index()),format.raw/*28.52*/(""""><!--index() ??? or index -->
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*33.22*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 22:21:01 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab8CRUD/app/views/addProduct.scala.html
                  HASH: a1e1a34db162177178f4f4481a3dacf3f6a40b4c
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1177->59|1204->78|1242->79|1273->84|1409->194|1519->294|1559->295|1597->333|1634->432|1671->442|1684->446|1715->456|1760->474|1894->581|1990->656|2027->666|2137->755|2174->765|2272->842|2309->852|2407->929|2444->939|2629->1097|2644->1103|2688->1126|2852->1275
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|43->11|43->11|43->11|45->13|46->14|47->15|47->15|47->15|49->17|52->20|52->20|53->21|53->21|54->22|54->22|55->23|55->23|57->25|60->28|60->28|60->28|65->33
                  -- GENERATED --
              */
          