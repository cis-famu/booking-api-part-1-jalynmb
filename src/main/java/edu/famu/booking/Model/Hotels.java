package edu.famu.booking.Model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotels {

    @DocumentId
    private @Nullable String hotelID;
    private String name;
    private String description;
    private String address;
    private String contactInformation;
    private double  rating;
    private String[] amenities;

    public Hotels(String id, String hotelID, String userID, Double rating, String comment, Timestamp date) {
    }

    //hotelID getter and setter
    public void sethotelId(String hotelID)
    {
        this.hotelID = hotelID;
    }

    public String gethotelId()
    {
        return hotelID;
    }

    //name getter and setter
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //description getter and setter
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    //rating getter and setter
    public void setRating(float rating)
    {
        this.rating = rating;
    }

    public double getRating()
    {
        return rating;
    }

    //address getter and setter
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    //contactInfo getter and setter
    public void setContactInfo(String contactInformation)
    {
        this.contactInformation = contactInformation;
    }

    public String getContactInfo()
    {
        return contactInformation;
    }

    //amenities getter and setter
    public void setAmenitites(String[] amenities)
    {
        this.amenities = amenities;
    }

    public String[] getAmenities()
    {
        return amenities;
    }

    public Hotels(String hotelID, String name, String description, float rating, String address, String contactInformation, String[] amenities)
    {
        this.hotelID = hotelID;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.address = address;
        this.contactInformation = contactInformation;
        this.amenities = amenities;
    }
}
