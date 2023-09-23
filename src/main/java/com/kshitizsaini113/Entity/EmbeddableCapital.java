package com.kshitizsaini113.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Objects;

@Embeddable
public class EmbeddableCapital {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int embeddableCapitalId;
    private String embeddableCapitalName;

    public EmbeddableCapital() {
    }

    public EmbeddableCapital(int embeddableCapitalId, String embeddableCapitalName) {
        this.embeddableCapitalId = embeddableCapitalId;
        this.embeddableCapitalName = embeddableCapitalName;
    }

    public int getEmbeddableCapitalId() {
        return embeddableCapitalId;
    }

    public void setEmbeddableCapitalId(int embeddableCapitalId) {
        this.embeddableCapitalId = embeddableCapitalId;
    }

    public String getEmbeddableCapitalName() {
        return embeddableCapitalName;
    }

    public void setEmbeddableCapitalName(String embeddableCapitalName) {
        this.embeddableCapitalName = embeddableCapitalName;
    }

    @Override
    public String toString() {
        return "EmbeddableCapital{" +
                "embeddableCapitalId=" + embeddableCapitalId +
                ", embeddableCapitalName='" + embeddableCapitalName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmbeddableCapital that)) return false;
        return getEmbeddableCapitalId() == that.getEmbeddableCapitalId() && Objects.equals(getEmbeddableCapitalName(), that.getEmbeddableCapitalName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmbeddableCapitalId(), getEmbeddableCapitalName());
    }
}
