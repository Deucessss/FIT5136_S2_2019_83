
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Booking
{
    // instance variables - replace the example below with your own
    private int idOwner;
    private int idCust;
    private String occasion;
    private int guestNum;
    private boolean cateringService;
    private boolean photographyService;
    private boolean decorationService;
    private Date startDate;
    private Date endDate;
    private float cateringCost;
    private float photographyCost;
    private float decorationCost;
    private float venueCost;
    private float totalAmount;
    private boolean updated = false;
    private boolean completed = false;
    private Hall hall;
    private Customer customer;
    /**
     * Constructor for objects of class Booking
     */
    public Booking(String occasion, int guestNum, boolean cateringSerivce, float cateringCost,
                     boolean photographyService, float photographyCost, boolean decorationService,
                     float decorationCost, float venueCost, Date startDate, Date endDate, Hall hall,
                     Customer customer)
    {
        this.occasion = occasion;
        this.guestNum = guestNum;
        this.cateringService = cateringService;
        this.cateringCost = cateringCost;
        this.photographyService = photographyService;
        this.photographyCost = photographyCost;
        this.decorationService = decorationService;
        this.decorationCost = decorationCost;
        this.venueCost = venueCost;
        this.totalAmount = cateringCost + photographyCost + decorationCost + venueCost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hall = hall;
        this.idOwner = hall.getBookings().size() + 1;
        this.idCust = customer.getBookings().size() + 1;
    }
    
    public int getIdOwner()
    {
        return this.idOwner;
    }
    
    public void setIdOwner(int idOwner)
    {
        this.idOwner = idOwner;
    }
    
    public int getIdCust()
    {
        return this.idCust;
    }
    
    public void setIdCust(int idCust)
    {
        this.idCust = idCust;
    }
    
    public String getOccasion()
    {
        return this.occasion;
    }
    
    public void setOccasion(String occasion)
    {
        this.occasion = occasion;
    }
    
    public int getGuestNum()
    {
        return this.guestNum;
    }
    
    public void setGuestNum(int guestNum)
    {
        this.guestNum = guestNum;
    }
    
    public boolean getCateringService()
    {
        return this.cateringService;
    }
    
    public void setCateringService(boolean cateringService)
    {
        this.cateringService = cateringService;
    }
    
    public boolean getPhotographyService()
    {
        return this.photographyService;
    }
    
    public void setPhotographyService(boolean photographyService)
    {
        this.photographyService = photographyService;
    }
    
    public boolean getDecorationService()
    {
        return this.decorationService;
    }
    
    public void setDecorationService(boolean decorationService)
    {
        this.decorationService = decorationService;
    }
    
    public Date getStartDate()
    {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }
    
    public Date getEndDate()
    {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }
    
    public float getCateringCost()
    {
        return this.cateringCost;
    }
    
    public void setCateringCost(float cateringCost)
    {
        this.cateringCost = cateringCost;
    }
    
    public float getPhotographyCost()
    {
        return this.photographyCost;
    }
    
    public void setPhotographyCost(float photographyCost)
    {
        this.photographyCost = photographyCost;
    }
    
    public float getDecorationCost()
    {
        return this.decorationCost;
    }
    
    public void setDecorationCost(float decorationCost)
    {
        this.decorationCost = decorationCost;
    }
    
    public float getVenueCost()
    {
        return this.venueCost;
    }
    
    public void setVenueCost(float venueCost)
    {
        this.venueCost = venueCost;
    }
    
    public float getTotalAmount()
    {
        return this.totalAmount;
    }
    
    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount = totalAmount;
    }
    
    public Hall getHall()
    {
        return this.hall;
    }
    
    public Boolean getUpdated()
    {
        return this.updated;
    }
    
     
    
}