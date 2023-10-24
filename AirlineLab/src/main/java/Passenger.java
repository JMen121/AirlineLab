public class Passenger {

private String name;

private String contactInfo;

private int passengerId;

private boolean extraBaggage;

private int baggage;

    public Passenger (String name, String contactInfo, int passengerId, boolean extraBaggage, int baggage){
        this.name = name;
        this.contactInfo= contactInfo;
        this.passengerId= passengerId;
        this.extraBaggage= extraBaggage;
        this.baggage=baggage;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public boolean isExtraBaggage() {
        return extraBaggage;
    }

    public void setExtraBaggage(boolean extraBaggage) {
        this.extraBaggage = extraBaggage;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }





}
