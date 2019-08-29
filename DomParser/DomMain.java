import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DomMain {
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("seed.xml");

            Element root = document.getDocumentElement();

            NodeList nodeList = root.getElementsByTagName("SEED");

            List<Seed> seedList = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    Seed seed = new Seed();

                    String data = element.getElementsByTagName("ID").item(0).toString();
                    seed.setID(Long.parseLong(data));

                    data = element.getElementsByTagName("NAME").item(0).toString();
                    seed.setNAME(data);

                    data = element.getElementsByTagName("CODE").item(0).toString();
                    seed.setCODE(Long.parseLong(data));

                    data = element.getElementsByTagName("HIBRID_NAME").item(0).toString();
                    seed.setHIBRID_NAME(data);

                    data = element.getElementsByTagName("PATENT_NUMBER").item(0).toString();
                    seed.setPATENT_NUMBER(data);

                    data = element.getElementsByTagName("START_DATE").item(0).toString();
                    seed.setSTART_DATE(LocalDate.parse(data));

                    data = element.getElementsByTagName("PATENT_OWNER").item(0).toString();
                    seed.setPATENT_OWNER(data);

                    data = element.getElementsByTagName("END_DATE").item(0).toString();
                    seed.setEND_DATE(LocalDate.parse(data));

                    data = element.getElementsByTagName("START_REGISTER_DATE").item(0).toString();
                    seed.setSTART_REGISTER_DATE(Long.parseLong(data));

                    seedList.add(seed);

                    System.out.println("DOM Parsed");
                    seedList.forEach(System.out::println);


                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
