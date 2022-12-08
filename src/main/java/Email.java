public class Email {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private String address;
    private String password;
    private int capacity;

    public Email(String address, String password, int capacity) {
        this.address = address;
        this.password = password;
        this.capacity = capacity;
    }
}
