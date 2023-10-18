package edu.famu.booking.Model;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.protobuf.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookings {

    @DocumentId
    private @Nullable String bookingID;
    private String userID;
    private Timestamp checkInDate;
    private Timestamp checkOutDate;
    private double totalPrice;
    private String status;
    private String paymentStatus;


    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Timestamp getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Timestamp checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Timestamp getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Timestamp checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
