package ru.itis.dto;


import java.util.Objects;

public class UserDto {

    private String login;
    private String password;
    private Boolean gender;
    private Boolean subscription;

    public UserDto(String login, String password, Boolean gender, Boolean subscription) {
        this.login = login;
        this.password = password;
        this.gender = gender;
        this.subscription = subscription;
    }

    public UserDto() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return Objects.equals(login, userDto.login) && Objects.equals(password, userDto.password) && Objects.equals(gender, userDto.gender) && Objects.equals(subscription, userDto.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, gender, subscription);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", subscription=" + subscription +
                '}';
    }
}
