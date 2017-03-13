package demo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wshen on 3/10/2017.
 */
public class BigDecimalEntity {
    private BigDecimal aa;
    private BigDecimal bb;
    private BigDecimal cc;
    private int aInt;
    private String aString;
    private List<InnerEntity> innerEntities;

    public BigDecimal getAa() {
        return aa;
    }

    public void setAa(BigDecimal aa) {
        this.aa = aa;
    }

    public BigDecimal getBb() {
        return bb;
    }

    public void setBb(BigDecimal bb) {
        this.bb = bb;
    }

    public BigDecimal getCc() {
        return cc;
    }

    public void setCc(BigDecimal cc) {
        this.cc = cc;
    }

    public int getaInt() {
        return aInt;
    }

    public void setaInt(int aInt) {
        this.aInt = aInt;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public List<InnerEntity> getInnerEntities() {
        return innerEntities;
    }

    public void setInnerEntities(List<InnerEntity> innerEntities) {
        this.innerEntities = innerEntities;
    }

    @Override
    public String toString() {
        return "BigDecimalEntity{" +
                "aa=" + aa +
                ", bb=" + bb +
                ", cc=" + cc +
                ", aInt=" + aInt +
                ", aString='" + aString + '\'' +
                ", innerEntities=" + innerEntities +
                '}';
    }
}
