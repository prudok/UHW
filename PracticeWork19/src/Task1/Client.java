package Task1;

public class Client {
    private String name;
    private String secondName;
    private String lastName;
    private long iNN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getINN() {
        return iNN;
    }

    public void setINN(long iNN) {
        this.iNN = iNN;
    }

    public Client(String name, String secondName, String lastName, long iNN) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.iNN = iNN;
    }
}
