package ru.aiteko.ObjectData;

import java.util.Objects;

public class Name{
    private String first;
    private String middle;
    private String last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }
    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(first, name.first) &&
                Objects.equals(middle, name.middle) &&
                Objects.equals(last, name.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, middle, last);
    }

    @Override
    public String toString() {
        return "name:" +
                " " + first +
                " " + middle +
                " " + last;
    }
}