package softuni.exam.models.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{

    private Apartment apartment;
    private BigDecimal price;
    private Agent agent;
    private LocalDate publishedOn;

    public Offer(){
    }

    @ManyToOne
    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    @Column(nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @ManyToOne
    public Agent getAgent() {
        return agent;
    }

    public Offer setAgent(Agent agent) {
        this.agent = agent;
        return this;
    }

    @Column(nullable = false)
    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    public Offer setPublishedOn(LocalDate publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }



}
