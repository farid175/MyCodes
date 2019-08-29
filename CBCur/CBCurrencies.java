public class CBCurrencies {
    private String ValType;
    private String Type;
    private String Valute;
    private String Code;
    private String Nominal;
    private String Name;
    private Double Value;

    @Override
    public String toString() {
        return "CBCurrencies{" +
                "ValType='" + ValType + '\'' +
                ", Type='" + Type + '\'' +
                ", Valute='" + Valute + '\'' +
                ", Code='" + Code + '\'' +
                ", Nominal='" + Nominal + '\'' +
                ", Name='" + Name + '\'' +
                ", Value=" + Value +
                '}';
    }

    public String getValType() {
        return ValType;
    }

    public void setValType(String valType) {
        ValType = valType;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getValute() {
        return Valute;
    }

    public void setValute(String valute) {
        Valute = valute;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getNominal() {
        return Nominal;
    }

    public void setNominal(String nominal) {
        Nominal = nominal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }
}
