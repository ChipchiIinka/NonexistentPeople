package ru.aiteko.ObjectData;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Datum{
    private long id;
    private Status status;
    public Name name;
    private BigDecimal monthlySalary;
    private LocalDateTime birthday;
    private String username;
    private String password;
    private ArrayList<String> emails;
    private String phoneNumber;
    public Location location;
    private String website;
    private String domain;
    public Job job;
    public CreditCard creditCard;
    private String uuid;
    private String objectId;

    public Datum(long id, Status status, Name name, BigDecimal monthlySalary,
                 LocalDateTime birthday, String username, String password,
                 ArrayList<String> emails, String phoneNumber, Location location,
                 String website, String domain, Job job, CreditCard creditCard,
                 String uuid, String objectId) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
        this.emails = emails;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.website = website;
        this.domain = domain;
        this.job = job;
        this.creditCard = creditCard;
        this.uuid = uuid;
        this.objectId = objectId;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }

    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(BigDecimal monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }
    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Job getJob() {
        return job;
    }
    public void setJob(Job job) {
        this.job = job;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getObjectId() {
        return objectId;
    }
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datum datum = (Datum) o;
        return id == datum.id && status == datum.status &&
                Objects.equals(name, datum.name) &&
                Objects.equals(monthlySalary, datum.monthlySalary) &&
                Objects.equals(birthday, datum.birthday) &&
                Objects.equals(username, datum.username) &&
                Objects.equals(password, datum.password) &&
                Objects.equals(emails, datum.emails) &&
                Objects.equals(phoneNumber, datum.phoneNumber) &&
                Objects.equals(location, datum.location) &&
                Objects.equals(website, datum.website) &&
                Objects.equals(domain, datum.domain) &&
                Objects.equals(job, datum.job) &&
                Objects.equals(creditCard, datum.creditCard) &&
                Objects.equals(uuid, datum.uuid) &&
                Objects.equals(objectId, datum.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, monthlySalary, birthday,
                username, password, emails, phoneNumber, location, website,
                domain, job, creditCard, uuid, objectId);
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", status=" + status +
                ", name=" + name +
                ", monthlySalary=" + monthlySalary +
                ", birthday='" + birthday + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emails=" + emails +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location=" + location +
                ", website='" + website + '\'' +
                ", domain='" + domain + '\'' +
                ", job=" + job +
                ", creditCard=" + creditCard +
                ", uuid='" + uuid + '\'' +
                ", objectId='" + objectId + '\'' +
                '}';
    }
}