package ma.ensa.accountManagement_service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Portefeuille {
    private Long id;
    private Double solde;
    private Double plafond;
    private String currency;
    private List<VirtuelCard> virtuelCards;

    public Long getId() {
        return id;
    }

    public Double getSolde() {
        return solde;
    }

    public Double getPlafond() {
        return plafond;
    }

    public String getCurrency() {
        return currency;
    }

    public List<VirtuelCard> getVirtuelCards() {
        return virtuelCards;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setPlafond(Double plafond) {
        this.plafond = plafond;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setVirtuelCards(List<VirtuelCard> virtuelCards) {
        this.virtuelCards = virtuelCards;
    }
}
