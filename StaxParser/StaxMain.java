package parser.stax;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StaxMain {
    public static void main(String[] args) {
        try {

            XMLInputFactory factory = XMLInputFactory.newFactory();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("seed.xml"));

            List<Seed> seedList = new ArrayList<>();



            Seed tempSeed = null;
            boolean isHeader = false;
            boolean isSEED = false;
            boolean isID = false;
            boolean isNAME = false;
            boolean isCODE = false;
            boolean isHIBRID_NAME = false;
            boolean isPATENT_NUMBER = false;
            boolean isSTART_DATE = false;
            boolean isPATENT_OWNER = false;
            boolean isEND_DATE = false;
            boolean isSTART_REGISTER_DATE = false;

            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLEvent.START_DOCUMENT){
                    System.out.println("Start document");
                }else if (event == XMLEvent.START_ELEMENT) {
                    String name = reader.getName().toString();
                    System.out.println("Start element = " +name);
                    if (name.equals("header")) {
                        isHeader = true;
                    }else if (name.equals("SEED")){
                        isSEED = true;
                        tempSeed = new Seed();
                    } else if (name.equals("ID")) {
                        isID = true;
                    }else if (name.equals("NAME")) {
                        isNAME = true;
                    }else if (name.equals("CODE")) {
                        isCODE = true;
                    }else if (name.equals("HIBRID_NAME")) {
                        isHIBRID_NAME = true;
                    }else if (name.equals("PATENT_NUMBER")) {
                        isPATENT_NUMBER = true;
                    }else if (name.equals("START_DATE")) {
                        isSTART_DATE = true;
                    }else if (name.equals("PATENT_OWNER")) {
                        isPATENT_OWNER = true;
                    }else if (name.equals("END_DATE")) {
                        isEND_DATE = true;
                    }else if (name.equals("START_REGISTER_DATE")) {
                        isSTART_REGISTER_DATE = true;
                    }
                }else if (event == XMLEvent.CHARACTERS) {
                    String data = reader.getText();
                    System.out.println("data = " +data);
                    if(!isHeader && isID) {
                        tempSeed.setID(Long.parseLong(data));
                    }else if (!isHeader && isNAME) {
                        tempSeed.setNAME(data);
                    }else if (!isHeader && isCODE) {
                        tempSeed.setCODE(Long.parseLong(data));
                    }else if (!isHeader && isHIBRID_NAME) {
                        tempSeed.setHIBRID_NAME(data);
                    }else if (!isHeader && isPATENT_NUMBER) {
                        tempSeed.setPATENT_NUMBER(data);
                    }else if (!isHeader && isSTART_DATE) {
                        tempSeed.setSTART_DATE(LocalDate.parse(data));
                    }else if (!isHeader && isPATENT_OWNER) {
                        tempSeed.setPATENT_OWNER(data);
                    }else if (!isHeader && isEND_DATE) {
                        tempSeed.setEND_DATE(LocalDate.parse(data));
                    }else if (!isHeader && isSTART_REGISTER_DATE) {
                        tempSeed.setSTART_REGISTER_DATE(Long.parseLong(data));
                    }
                }else if (event == XMLEvent.END_ELEMENT) {
                    String name = reader.getName().toString();
                    System.out.println("End element = " +name);
                    if (name.equals("header")) {
                        isHeader = false;
                    }else if (name.equals("SEED")) {
                        isSEED = false;
                        seedList.add(tempSeed);
                        tempSeed = null;
                    }else if (name.equals("ID")) {
                        isID = false;
                    }else if (name.equals("NAME")) {
                        isNAME = false;
                    }else if (name.equals("CODE")) {
                        isCODE = false;
                    }else if (name.equals("HIBRID_NAME")) {
                        isHIBRID_NAME = false;
                    }else if (name.equals("PATENT_NUMBER")) {
                        isPATENT_NUMBER = false;
                    }else if (name.equals("START_DATE")) {
                        isSTART_DATE = false;
                    }else if (name.equals("PATENT_OWNER")) {
                        isPATENT_OWNER = false;
                    }else if (name.equals("END_DATE")) {
                        isEND_DATE = false;
                    }else if (name.equals("START_REGISTER_DATE")) {
                        isSTART_REGISTER_DATE = false;
                    }

                }else if (event == XMLEvent.END_DOCUMENT) {
                    System.out.println("End document");
                }

                System.out.println("Stax parse edildi");
                System.out.println(seedList);
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
