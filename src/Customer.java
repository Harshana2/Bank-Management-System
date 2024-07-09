public class Customer {
    private String name;
    private String idNumber;
    private String gender;
    private String city;
    private String phoneNumber;
    public static int nextCustomerNumber=1008;
    public int customerNumber;

    public Customer(String name, String idNumber,String gender, String city, String phoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.gender=gender;
        this.city = city;
        this.phoneNumber = phoneNumber;
        customerNumber=nextCustomerNumber;
        nextCustomerNumber+=8;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "----------------------------------------------"+"\n"+
                "Customer Number= "+customerNumber+"\n"+
                "Name= " + name + "\n" +
                "ID Number= " + idNumber + "\n" +
                "Gender= " + gender +"\n" +
                "City= " + city + "\n" +
                "Phone Number= " + phoneNumber +"\n"+
                "---------------------------------------------";
    }
}
