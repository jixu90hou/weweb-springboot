package demo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wshen on 3/10/2017.
 */
public class InnerEntity {
    private BigDecimal innerAa;
    private BigDecimal innerBb;
    private String innerString;
    private List<InnerInnerEntity> innerInnerEntities;

    public BigDecimal getInnerAa() {
        return innerAa;
    }

    public void setInnerAa(BigDecimal innerAa) {
        this.innerAa = innerAa;
    }

    public BigDecimal getInnerBb() {
        return innerBb;
    }

    public void setInnerBb(BigDecimal innerBb) {
        this.innerBb = innerBb;
    }

    public String getInnerString() {
        return innerString;
    }

    public void setInnerString(String innerString) {
        this.innerString = innerString;
    }

    public List<InnerInnerEntity> getInnerInnerEntities() {
        return innerInnerEntities;
    }

    public void setInnerInnerEntities(List<InnerInnerEntity> innerInnerEntities) {
        this.innerInnerEntities = innerInnerEntities;
    }

    @Override
    public String toString() {
        return "InnerEntity{" +
                "innerAa=" + innerAa +
                ", innerBb=" + innerBb +
                ", innerString='" + innerString + '\'' +
                ", innerInnerEntities=" + innerInnerEntities +
                '}';
    }
}
