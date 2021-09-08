package ru.itis.model;


import java.util.Date;
import java.util.Objects;

public class User {

    private Integer id;
    private String name;
    private String surname;
    private Long phone;
    private String email;
    private String password;
    private String country;
    private Boolean gender;
    private Boolean subscription;
    private Role role;
    private Date createdAccount;

    public User() {
    }

    public User(Integer id, String name, String surname, Long phone, String email, String password, String country, Boolean gender, Boolean subscription, Role role, Date createdAccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.country = country;
        this.gender = gender;
        this.subscription = subscription;
        this.role = role;
        this.createdAccount = createdAccount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreatedAccount() {
        return createdAccount;
    }

    public void setCreatedAccount(Date createdAccount) {
        this.createdAccount = createdAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(country, user.country) && Objects.equals(gender, user.gender) && Objects.equals(subscription, user.subscription) && role == user.role && Objects.equals(createdAccount, user.createdAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone, email, password, country, gender, subscription, role, createdAccount);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                ", subscription=" + subscription +
                ", role=" + role +
                ", createdAccount=" + createdAccount +
                '}';
    }
}