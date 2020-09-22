package com.company;

public class Contact {

    private String contactName;
    private String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        if (contactName.length() < 1) return;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        if (contactName.length() > 0) this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 0) this.phoneNumber = phoneNumber;
    }
}
