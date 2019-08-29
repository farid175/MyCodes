import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class CBCurHandler extends DefaultHandler {
    List<CBCurrencies> cbCurrenciesList;

    private CBCurrencies tempCbC;
    private boolean isNominal = false;
    private boolean isName = false;
    private boolean isValue = false;
    private String type = "";
    private String code = "";

    public List<CBCurrencies> getCbCurrenciesList() {
        return cbCurrenciesList;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start Document");
        cbCurrenciesList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element = " +qName);

        if (qName.equals("ValType")) {
            type = attributes.getValue("Type");
        }else if (qName.equals("Valute")) {
            tempCbC = new CBCurrencies();
            code = attributes.getValue("Code");
            tempCbC.setCode(code);
            tempCbC.setType(type);

        }else if (qName.equals("Nominal")) {
            isNominal = true;
        }else if (qName.equals("Name")) {
            isName = true;
        }else if (qName.equals("Value")) {
            isValue = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String data = new String(ch ,start ,length);
        System.out.println("Data = " + data);

        if (isNominal) {
            tempCbC.setNominal(data);
        }else if (isName) {
            tempCbC.setName(data);
        }else if (isValue) {
            tempCbC.setValue(Double.parseDouble(data));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End elementd = " + qName);
        if (qName.equals("Valute")) {
            cbCurrenciesList.add(tempCbC);
            tempCbC = null;
        }else if (qName.equals("Nominal")) {
            isNominal = false;
        }else if (qName.equals("Name")) {
            isName = false;
        }else if (qName.equals("Value")) {
            isValue = false;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document");
    }


}
