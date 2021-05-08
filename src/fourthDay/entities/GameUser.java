package fourthDay.entities;

import java.time.LocalDate;

public class GameUser extends User {
    private int userId;
    private String firstName;
    private String lastName;
    private String nationalId;
    private LocalDate dateOfBirth;

    public GameUser() {
    }

    public GameUser(int id, String email, String password, int userId, String firstName, String lastName, String nationalId, LocalDate dateOfBirth) {
        super(id, email, password);
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.dateOfBirth = dateOfBirth;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
