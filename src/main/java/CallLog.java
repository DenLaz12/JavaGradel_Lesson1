public class CallLog {

    private String name;
    private String surname;
    private String phoneNumber;
    private int duration;

    public CallLog(String name, String surname, String phoneNumber, int duration) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getDuration() {
        return duration;
    }
}
