package parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeedsSaxHandler extends DefaultHandler {
    private List<Seed> seedList;

    private Seed tempSeed = null;
    private boolean isSEED = false;
    private boolean isId = false;
    private boolean isName = false;
    private boolean isCode = false;
    private boolean isHibridName = false;
    private boolean isPatentNumber = false;
    private boolean isStartDate = false;
    private boolean isPatenOwner = false;
    private boolean isEndDate = false;
    private boolean isStartRegiserDate = false;
    private boolean isHeader = false;




    public List<Seed> getSeedList() {
        return seedList;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start document");
        seedList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start element = " +qName);
        if(qName.equals("header")){
            isHeader = true;
        } else if (qName.equals("SEED")){
            isSEED = true;
            tempSeed = new Seed();
        }else if (qName.equals("ID")){
            isId = true;
        }else if (qName.equals("NAME")){
            isName = true;
        }else if (qName.equals("CODE")){
            isCode = true;
        }else if (qName.equals("HIBRID_NAME")){
            isHibridName = true;
        }else if (qName.equals("PATENT_NUMBER")){
            isPatentNumber = true;
        }else if (qName.equals("START_DATE")){
            isStartDate = true;
        }else if (qName.equals("PATENT_OWNER")){
            isPatenOwner = true;
        }else if (qName.equals("END_DATE")){
            isEndDate = true;
        }else if (qName.equals("START_REGISTER_DATE")){
            isStartRegiserDate = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String data = new String(ch ,start ,length);
        System.out.println("data = " +data);
        if (!isHeader && isId){
            tempSeed.setID(Long.parseLong(data));
        }else if (!isHeader &&isName){
            tempSeed.setNAME(data);
        }else if (!isHeader &&isCode){
            tempSeed.setCODE(Long.parseLong(data));
        }else if (!isHeader &&isHibridName){
            tempSeed.setHIBRID_NAME(data);
        }else if (!isHeader &&isPatentNumber){
            tempSeed.setPATENT_NUMBER(data);
        }else if (!isHeader &&isStartDate){
            tempSeed.setSTART_DATE(LocalDate.parse(data));
        }else if (!isHeader &&isPatenOwner){
            tempSeed.setPATENT_OWNER(data);
        }else if (!isHeader &&isEndDate){
            tempSeed.setEND_DATE(LocalDate.parse(data));
        }else if (!isHeader &&isStartRegiserDate){
            tempSeed.setSTART_REGISTER_DATE(Long.parseLong(data));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("end element = " +qName);
        if (qName.equals("header")){
            isHeader = false;
        } else if (qName.equals("SEED")){
            isSEED = false;
            seedList.add(tempSeed);
            tempSeed = null;
        }else if (qName.equals("ID")){
            isId = false;
        }else if (qName.equals("NAME")){
            isName = false;
        }else if (qName.equals("CODE")){
            isCode = false;
        }else if (qName.equals("HIBRID_NAME")){
            isHibridName = false;
        }else if (qName.equals("PATENT_NUMBER")){
            isPatentNumber = false;
        }else if (qName.equals("START_DATE")){
            isStartDate = false;
        }else if (qName.equals("PATENT_OWNER")){
            isPatenOwner = false;
        }else if (qName.equals("END_DATE")){
            isEndDate = false;
        }else if (qName.equals("START_REGISTER_DATE")){
            isStartRegiserDate = false;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end document");
    }
}
