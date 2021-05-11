package fifthDayHomeWork.javaHomeWork1.entities.cocretes;

public class Customer extends User{
    private int userId;
    private String firstName;
    private String lastName;
    private boolean flag = false;

    public Customer() {
    }

    public Customer(int id, String email, String password, int userId, String firstName, String lastName) {
        super(id, email, password);
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public String getFullName(){
      return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
