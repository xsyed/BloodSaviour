package com.example.prj_blood_donation_app.Model;

public class Notification {
    String recieverId, senderId, text, date;

    public Notification() {
    }

    public Notification(String recieverId, String senderId, String text, String date) {
        this.recieverId = recieverId;
        this.senderId = senderId;
        this.text = text;
        this.date = date;
    }

    public String getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(String recieverId) {
        this.recieverId = recieverId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
