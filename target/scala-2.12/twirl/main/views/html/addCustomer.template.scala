
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add customer")/*7.22*/{_display_(Seq[Any](format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new customer</p>

    <!--Use the views.html.helpers package to create the form -->
    """),_display_(/*11.6*/form(action=routes.HomeController.addCustomerSubmit() , 'class -> "form-horizontal", 'role -> "form")/*11.107*/{_display_(Seq[Any](format.raw/*11.108*/("""

        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        
        """),format.raw/*17.9*/("""<!--Build the form, adding an input for each field -->
        <!-- Note the label parameter -->

        """),_display_(/*20.10*/inputText(customerForm("f_Name"),   '_label -> "First Name", 'class -> "form-control")),format.raw/*20.96*/("""
        """),_display_(/*21.10*/inputText(customerForm("l_Name"),   '_label -> "Last Name",  'class -> "form-control")),format.raw/*21.96*/("""
        """),_display_(/*22.10*/inputText(customerForm("address"), '_label -> "Address",    'class -> "form-control")),format.raw/*22.95*/("""
        

        """),format.raw/*25.9*/("""<!--Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add Customer" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.customers()),format.raw/*28.56*/(""""><!--index() ??? or index -->
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*33.22*/("""
""")))}))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 23:11:14 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab8CRUD/app/views/addCustomer.scala.html
                  HASH: 3b8c3a5bee40e54b70b4963c324ec592f13ee210
                  MATRIX: 969->1|1079->41|1124->38|1152->57|1181->61|1209->81|1247->82|1278->87|1415->198|1526->299|1566->300|1604->338|1641->437|1678->447|1691->451|1722->461|1767->479|1901->586|2008->672|2045->682|2152->768|2189->778|2295->863|2341->882|2527->1041|2542->1047|2590->1074|2754->1223
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|43->11|43->11|43->11|45->13|46->14|47->15|47->15|47->15|49->17|52->20|52->20|53->21|53->21|54->22|54->22|57->25|60->28|60->28|60->28|65->33
                  -- GENERATED --
              */
          