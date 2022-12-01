package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import softuni.exam.models.entity.Town;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class AgentSeedDto {

    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private String email;
    @Expose
    private Town town;

    public AgentSeedDto() {
    }

    @Size(min = 2)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Size(min = 2)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Email
    public String getEmail() {
        return email;
    }

    public AgentSeedDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public Town getTown() {
        return town;
    }

    public AgentSeedDto setTown(Town town) {
        this.town = town;
        return this;
    }
}
