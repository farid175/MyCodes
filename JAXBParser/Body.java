import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    @XmlElement(name = "SEED")
    private List<Seed> seeds;

    public List<Seed> getSeeds() {
        return seeds;
    }
}
