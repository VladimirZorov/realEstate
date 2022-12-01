package softuni.exam.models.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ApartmentDto {

    @XmlElement(name = "name")
    private Long id;

    public Long getId() {
        return id;
    }

    public ApartmentDto setId(Long id) {
        this.id = id;
        return this;
    }
}
