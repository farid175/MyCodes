import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SaxMain {
    public static void main(String[] args) {
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            CBCurHandle handler = new CBCurHandle();
            parser.parse("https://www.cbar.az/currencies/"+ LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))+".xml",handler);

            System.out.println("Sax Parsed");
            List<CBCurrencies> cbc = handler.getCbCurrenciesList();
            cbc.forEach(System.out::println);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
