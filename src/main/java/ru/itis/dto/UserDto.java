package ru.itis.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import ru.itis.validation.Phone;
import ru.itis.validation.Year;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class UserDto {

    @Size(min=3,max=20, message = "is required")
    @NotBlank
    private String name;

    @Size(min=3,max=20, message = "is required")
    @NotBlank
    private String surname;

    @NotNull
    @Phone
    private String phone;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Past
    @Year(2004)
    private Date date;
    private String email;
    private String password;
    private String confirmPassword;
    private String country;
    private Boolean gender;
    private Boolean subscription;

    public UserDto() {
    }

    public UserDto(@Size(min = 3, max = 20, message = "is required") String name, @Size(min = 3, max = 20, message = "is required") String surname, @NotNull String phone, @Past Date date, String email, String password, String confirmPassword, String country, Boolean gender, Boolean subscription) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.date = date;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.country = country;
        this.gender = gender;
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getSubscription() {
        return subscription;
    }

    public void setSubscription(Boolean subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(name, userDto.name) && Objects.equals(surname, userDto.surname) && Objects.equals(phone, userDto.phone) && Objects.equals(date, userDto.date) && Objects.equals(email, userDto.email) && Objects.equals(password, userDto.password) && Objects.equals(confirmPassword, userDto.confirmPassword) && Objects.equals(country, userDto.country) && Objects.equals(gender, userDto.gender) && Objects.equals(subscription, userDto.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, date, email, password, confirmPassword, country, gender, subscription);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                ", subscription=" + subscription +
                '}';
    }
}
