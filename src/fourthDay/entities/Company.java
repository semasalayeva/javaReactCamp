package fourthDay.entities;

public class Company extends User{
    private int userId;
    private String companyName;

    public Company() {
    }

    public Company(int id, String email, String password, int userId, String companyName) {
        super(id, email, password);
        this.userId = userId;
        this.companyName = companyName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

