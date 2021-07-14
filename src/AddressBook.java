import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
    public AddressBook(){}
    //Declaring Private variables
    private String name, address, city, state, zip, phoneNumber,email;

    //Getting and setting each private variable
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getZip() {
        return zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    //Checking if the email and phoneNum are in the proper format
    private boolean isEmailValid(String email){
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }
    private boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    //setting the boolean results from the validation process
    public boolean setIsEmailValid(){
        boolean isEmailValid = isEmailValid(this.email);
        return isEmailValid;
    }
    public boolean setIsPhoneNumberValid(){
        boolean isPhoneNumValid = isPhoneNumberValid(this.phoneNumber);
        return  isPhoneNumValid;
    }

    //Displaying info
    public String displayData(){
        return "\nThis is your information \n" +
                "-------------------------------------\n"+
                "Name:            " + getName() + "\n" +
                "Address:         " + getAddress() + "\n" +
                "City:            " + getCity() + "\n" +
                "State:           " + getState() + "\n" +
                "Zip Code:        " + getZip() + "\n" +
                "Phone Number:    " + getPhoneNumber() + "\n" +
                "Email:           " + getEmail() + "\n";
    }
}
