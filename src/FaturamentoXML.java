import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
// import org.w3c.dom.Node;  
// import org.w3c.dom.Element;  
import java.io.File;  
public class FaturamentoXML{  
	public static void main(String argv[]) throws Exception{  
		File dados = new File("dados.xml");

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(dados);

		XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
		
		XPathExpression expr = xpath.compile("//dia[valor > 0]");

		NodeList dia = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

		for(int i = 0; i < dia.getLength(); i ++) {
			System.out.println("dia" + xpath.evaluate("dia", dia.item(i)));
			System.out.println("valor" + xpath.evaluate("valor", dia.item(i)));
		}	
	} 
}  