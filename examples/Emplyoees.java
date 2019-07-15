package Package3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Isci isci = new Isci("Tural","Hesenov");
        System.out.println("Ad "+ isci.ad + " Soyad "+ isci.soyad + " Maas " +isci.maasHesabla());

        Isci isci1 = new MaasliIsci("Alim","Qasimov", new BigDecimal(1000));

        System.out.println("Ad " +isci1.ad +" Soyad " +isci1.soyad + " Maas " + isci1.maasHesabla());

        Isci isci2 = new SaatHesabliIsci("Taleh","Yuzbeyov",new BigDecimal(20),200);

        System.out.println("Ad " +isci2.ad +" Soyad " +isci2.soyad + " Maas " + isci2.maasHesabla());

        Isci isci3 = new ProyektIsci("Huseyn","Suleymanov",new BigDecimal(24),new BigDecimal(100000));

        System.out.println("Ad " +isci3.ad +" Soyad " +isci3.soyad + " Maas " + isci3.maasHesabla());

        Isci isci4 = new VoenIsci("Ali","Aliyev",new BigDecimal(2500));

        System.out.println("Ad " +isci4.ad +" Soyad " +isci4.soyad + " Maas " + isci4.maasHesabla());

        Isci isci5 = new PartTimeIsci("Adem","Eminov",new BigDecimal(2133));

        System.out.println("Ad " +isci5.ad +" Soyad " +isci5.soyad + " Maas " + isci5.maasHesabla());




    }
}

  package Package3;

import java.math.BigDecimal;

public class Isci {
    protected String ad;
    protected String soyad;


    public Isci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public BigDecimal maasHesabla() {
        return BigDecimal.ZERO;
    }
}


package Package3;

import java.math.BigDecimal;

public class MaasliIsci extends Isci {
    private BigDecimal maas;

    public MaasliIsci(String ad, String soyad, BigDecimal maas) {
        super(ad, soyad);
        this.maas = maas;

    }
    @Override
    public BigDecimal maasHesabla() {
        return maas;
    }
}


package Package3;

import java.math.BigDecimal;

public class SaatHesabliIsci extends Isci {

    private BigDecimal saatqiymeti;
    private int saatsayi;

    public SaatHesabliIsci(String ad, String soyad, BigDecimal saatqiymeti, int saatsayi) {
        super(ad,soyad);
        this.saatqiymeti = saatqiymeti;
        this.saatsayi = saatsayi;
    }

    @Override
    public BigDecimal maasHesabla() {
        return saatqiymeti.multiply(BigDecimal.valueOf(saatsayi));
    }
}


package Package3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProyektIsci extends Isci {
    private BigDecimal muddet;
    private BigDecimal budce;

    public ProyektIsci(String ad, String soyad, BigDecimal muddet, BigDecimal budce) {
        super(ad,soyad);
        this.muddet = muddet;
        this.budce = budce;
    }

    @Override
    public BigDecimal maasHesabla() {
        return budce.divide(muddet,2, RoundingMode.FLOOR);
    }

}


package Package3;

import java.math.BigDecimal;

public class VoenIsci extends Isci {
    private BigDecimal xidmetlerincemideyeri;

    public VoenIsci(String ad, String soyad, BigDecimal xidmetlerincemideyeri) {
        super(ad, soyad);
        this.xidmetlerincemideyeri = xidmetlerincemideyeri;
    }

    @Override
    public BigDecimal maasHesabla() {
        return xidmetlerincemideyeri;
    }
}



package Package3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PartTimeIsci extends Isci {
    private BigDecimal maas;

    public PartTimeIsci(String ad, String soyad, BigDecimal maas) {
        super(ad, soyad);
        this.maas = maas;
    }

    @Override
    public BigDecimal maasHesabla() {
        return maas.divide(BigDecimal.valueOf(2),2, RoundingMode.FLOOR);
    }
}
