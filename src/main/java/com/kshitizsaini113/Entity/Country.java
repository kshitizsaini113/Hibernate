package com.kshitizsaini113.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;
    private String countryName;
    private EmbeddableCapital embeddableCapital;

    public Country() {
    }

    public Country(int countryId, String countryName, EmbeddableCapital embeddableCapital) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.embeddableCapital = embeddableCapital;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public EmbeddableCapital getEmbeddableCapital() {
        return embeddableCapital;
    }

    public void setEmbeddableCapital(EmbeddableCapital embeddableCapital) {
        this.embeddableCapital = embeddableCapital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                ", embeddableCapital=" + embeddableCapital +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;
        return Objects.equals(getCountryId(), country.getCountryId()) && Objects.equals(getCountryName(), country.getCountryName()) && Objects.equals(getEmbeddableCapital(), country.getEmbeddableCapital());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryId(), getCountryName(), getEmbeddableCapital());
    }
}
