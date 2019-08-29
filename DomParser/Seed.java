import java.time.LocalDate;

public class Seed {

    private long ID;
    private String NAME;
    private long CODE;
    private String HIBRID_NAME;
    private String PATENT_NUMBER;
    private LocalDate START_DATE;
    private String PATENT_OWNER;
    private LocalDate END_DATE;
    private long START_REGISTER_DATE;

    @Override
    public String toString() {
        return "Seed{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", CODE=" + CODE +
                ", HIBRID_NAME='" + HIBRID_NAME + '\'' +
                ", PATENT_NUMBER='" + PATENT_NUMBER + '\'' +
                ", START_DATE=" + START_DATE +
                ", PATENT_OWNER='" + PATENT_OWNER + '\'' +
                ", END_DATE=" + END_DATE +
                ", START_REGISTER_DATE=" + START_REGISTER_DATE +
                '}';
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public long getCODE() {
        return CODE;
    }

    public void setCODE(long CODE) {
        this.CODE = CODE;
    }

    public String getHIBRID_NAME() {
        return HIBRID_NAME;
    }

    public void setHIBRID_NAME(String HIBRID_NAME) {
        this.HIBRID_NAME = HIBRID_NAME;
    }

    public String getPATENT_NUMBER() {
        return PATENT_NUMBER;
    }

    public void setPATENT_NUMBER(String PATENT_NUMBER) {
        this.PATENT_NUMBER = PATENT_NUMBER;
    }

    public LocalDate getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(LocalDate START_DATE) {
        this.START_DATE = START_DATE;
    }

    public String getPATENT_OWNER() {
        return PATENT_OWNER;
    }

    public void setPATENT_OWNER(String PATENT_OWNER) {
        this.PATENT_OWNER = PATENT_OWNER;
    }

    public LocalDate getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(LocalDate END_DATE) {
        this.END_DATE = END_DATE;
    }

    public long getSTART_REGISTER_DATE() {
        return START_REGISTER_DATE;
    }

    public void setSTART_REGISTER_DATE(long START_REGISTER_DATE) {
        this.START_REGISTER_DATE = START_REGISTER_DATE;
    }
}
