public class User {
    private String name;
    private String surname;
    private Department department;
    private Email emailAddress;
    private Email altEmailAddress;


    public User(String name, String surname, Department department) {
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public Email getAltEmailAddress() {
        return altEmailAddress;
    }

    public void setAltEmailAddress(Email altEmailAddress) {
        this.altEmailAddress = altEmailAddress;
    }

    public Email getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Email emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDepartment() {
        return String.valueOf(department);
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
