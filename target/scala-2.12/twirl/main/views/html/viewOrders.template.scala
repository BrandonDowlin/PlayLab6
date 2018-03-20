
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
/*1.2*/import play.api.Play.current
/*2.2*/import models.shopping._
/*3.2*/import models.products._
/*4.2*/import models.users._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(customer: models.users.Customer, orders: List[ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.60*/("""
"""),format.raw/*6.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("View Orders", customer)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
	"""),format.raw/*8.2*/("""<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-md-8">
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
		"""),format.raw/*14.3*/("""</div>
	""")))}),format.raw/*15.3*/("""

"""),_display_(/*17.2*/for(o<-orders) yield /*17.16*/{_display_(Seq[Any](format.raw/*17.17*/("""
	"""),format.raw/*18.2*/("""<label>Order Number: """),_display_(/*18.24*/o/*18.25*/.getId),format.raw/*18.31*/("""</label>
	<br>
	<label>Order Date: """),_display_(/*20.22*/o/*20.23*/.getDateString),format.raw/*20.37*/("""</label>

		

		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Id</th>
				<th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
				<th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*36.18*/if(customer.getBasket() != null)/*36.50*/ {_display_(Seq[Any](format.raw/*36.52*/("""
                    """),format.raw/*37.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*38.22*/for(i <- o.getItems()) yield /*38.44*/ {_display_(Seq[Any](format.raw/*38.46*/("""
                    """),format.raw/*39.21*/("""<tr>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getId),format.raw/*40.48*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getName),format.raw/*41.50*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getQuantity()),format.raw/*42.45*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getPrice))),format.raw/*43.64*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>                        
                    </tr>
                    """)))}),format.raw/*46.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*47.16*/("""
			"""),format.raw/*48.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*52.68*/("%.2f".format(o.getTotal()))),format.raw/*52.97*/("""</strong></p>
            </div>  
		</div>
		<div class="form-group">
				<a href=""""),_display_(/*56.15*/routes/*56.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*56.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*63.24*/("""{"""),format.raw/*63.25*/("""
		"""),format.raw/*64.3*/("""return confirm('Are you sure?');
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/("""
"""),format.raw/*66.1*/("""</script>
""")))}),format.raw/*67.2*/("""
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,orders:List[ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orders)

  def f:((models.users.Customer,List[ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orders) => apply(customer,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 18:29:29 GMT 2018
                  SOURCE: C:/Users/brand/Downloads/sdevLab6/app/views/viewOrders.scala.html
                  HASH: 548d7ffd40ab098dc3d023b5c2a613577704200e
                  MATRIX: 651->1|687->32|719->59|751->86|1113->110|1266->168|1294->170|1366->217|1403->246|1442->248|1471->251|1578->332|1619->364|1659->366|1696->376|1769->422|1783->427|1819->442|1850->446|1890->456|1921->461|1951->475|1990->476|2020->479|2069->501|2079->502|2106->508|2171->546|2181->547|2216->561|2552->870|2593->902|2633->904|2683->926|2794->1010|2832->1032|2872->1034|2922->1056|2984->1091|2994->1092|3032->1109|3095->1145|3105->1146|3145->1165|3208->1201|3218->1202|3253->1216|3323->1259|3371->1286|3441->1329|3493->1360|3603->1439|3675->1480|3707->1485|3887->1638|3937->1667|4053->1756|4068->1762|4123->1796|4372->2017|4401->2018|4432->2022|4494->2057|4522->2058|4551->2060|4593->2072
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|76->44|76->44|78->46|79->47|80->48|84->52|84->52|88->56|88->56|88->56|95->63|95->63|96->64|97->65|97->65|98->66|99->67
                  -- GENERATED --
              */
          