package softuni.exam.models.dto;


import softuni.exam.models.entity.Town;
import softuni.exam.models.entity.enums.ApartmentType;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ApartmentSeedDto {

    @XmlElement(name = "area")
    private Double area;
    @XmlElement(name = "apartmentType")
    private ApartmentType apartmentType;
    @XmlElement(name = "town")
    private Town town;

    @DecimalMin(value = "40.00")
    public Double getArea() {
        return area;
    }

    public ApartmentSeedDto setArea(Double area) {
        this.area = area;
        return this;
    }

    @NotNull
    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public ApartmentSeedDto setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
        return this;
    }

    public Town getTown() {
        return town;
    }

    public ApartmentSeedDto setTown(Town town) {
        this.town = town;
        return this;
    }
}
