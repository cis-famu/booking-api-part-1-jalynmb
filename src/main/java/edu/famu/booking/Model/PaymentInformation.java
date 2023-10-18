package edu.famu.booking.Model;

public class PaymentInformation {
        private String cardNumber;
        private String expirationDate;
        private String billingAddress;

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public String getBillingAddress() {
            return billingAddress;
        }

        public void setBillingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
        }

        private PaymentInformation(String cardNumber, String expirationDate, String billingAddress) {
            this.cardNumber = cardNumber;
            this.expirationDate = expirationDate;
            this.billingAddress = billingAddress;
        }
    }

