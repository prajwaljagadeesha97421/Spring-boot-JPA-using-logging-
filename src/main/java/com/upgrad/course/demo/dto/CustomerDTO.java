package com.upgrad.course.demo.dto;


public class CustomerDTO {

    private int customerId;
    private String firstName;
    private String lastName;
    private String primaryMobileNo;
    private String alternateMobileNo;
    private String emailId;
    private String mainAddress;
    private String alternateAddress;

    public CustomerDTO() {
    }

    public int getCustomerId() { return customerId; }

    public void setCustomerId(int customerId) { this.customerId = customerId; }

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

    public String getPrimaryMobileNo() {
        return primaryMobileNo;
    }

    public void setPrimaryMobileNo(String primaryMobileNo) {
        this.primaryMobileNo = primaryMobileNo;
    }

    public String getAlternateMobileNo() {
        return alternateMobileNo;
    }

    public void setAlternateMobileNo(String alternateMobileNo) {
        this.alternateMobileNo = alternateMobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    public String getAlternateAddress() {
        return alternateAddress;
    }

    public void setAlternateAddress(String alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryMobileNo='" + primaryMobileNo + '\'' +
                ", alternateMobileNo='" + alternateMobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mainAddress=" + mainAddress +
                ", alternateAddress=" + alternateAddress +
                '}';
    }
}
