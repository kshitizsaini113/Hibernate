package com.kshitizsaini113.Entity;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressID;
    @Column(length = 50)
    private String addressStreet;
    @Column(length = 50, name = "address_city")
    private String addressCity;
    private boolean addressCityMetro;
    @Transient
    private String addressDescription;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address() {
    }

    public Address(int addressID, String addressStreet, String addressCity, boolean addressCityMetro, String addressDescription, Date addedDate, byte[] image) {
        this.addressID = addressID;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCityMetro = addressCityMetro;
        this.addressDescription = addressDescription;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public boolean isAddressCityMetro() {
        return addressCityMetro;
    }

    public void setAddressCityMetro(boolean addressCityMetro) {
        this.addressCityMetro = addressCityMetro;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressCityMetro=" + addressCityMetro +
                ", addressDescription='" + addressDescription + '\'' +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return getAddressID() == address.getAddressID() && isAddressCityMetro() == address.isAddressCityMetro() && Objects.equals(getAddressStreet(), address.getAddressStreet()) && Objects.equals(getAddressCity(), address.getAddressCity()) && Objects.equals(getAddressDescription(), address.getAddressDescription()) && Objects.equals(getAddedDate(), address.getAddedDate()) && Arrays.equals(getImage(), address.getImage());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getAddressID(), getAddressStreet(), getAddressCity(), isAddressCityMetro(), getAddressDescription(), getAddedDate());
        result = 31 * result + Arrays.hashCode(getImage());
        return result;
    }
}
