import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SEED")
@XmlAccessorType(XmlAccessType.FIELD)
public class Seed {
    @XmlElement(name = "ID")
    private long id;
    @XmlElement(name = "NAME")
    private String name;
    @XmlElement(name = "CODE")
    private String code;
    @XmlElement(name = "HIBRID_NAME")
    private String hibridName;
    @XmlElement(name = "PATENT_NUMBER")
    private String patentNumber;
    @XmlElement(name = "START_DATE")
    private String startDate;
    @XmlElement(name = "PATENT_OWNER")
    private String patentOwner;
    @XmlElement(name = "END_DATE")
    private String endDate;
    @XmlElement(name = "START_REGISTER_DATE")
    private Long startRegisterDate;

    @Override
    public String toString() {
        return "Seed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hibridName='" + hibridName + '\'' +
                ", patentNumber='" + patentNumber + '\'' +
                ", startDate='" + startDate + '\'' +
                ", patentOwner='" + patentOwner + '\'' +
                ", endDate='" + endDate + '\'' +
                ", startRegisterDate=" + startRegisterDate +
                '}';
    }

}
