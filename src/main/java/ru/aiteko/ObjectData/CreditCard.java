package ru.aiteko.ObjectData;

import java.util.Objects;

public class CreditCard{
    private String number;
    private String cvv;
    private String issuer;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public CreditCard(String number, String cvv, String issuer) {
        this.number = number;
        this.cvv = cvv;
        this.issuer = issuer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(number, that.number) &&
                Objects.equals(cvv, that.cvv) &&
                Objects.equals(issuer, that.issuer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, cvv, issuer);
    }
}