import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class JAXBMain {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Seeds.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Seeds seeds = (Seeds) unmarshaller.unmarshal(new StreamSource("https://sc.opendata.az/file/552"));
            seeds.getBody().getSeeds().forEach(System.out::println);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
