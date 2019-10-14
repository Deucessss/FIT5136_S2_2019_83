
/**
 * Write a description of class Quotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Quotation
{
    // instance variables - replace the example below with your own
    private String occasion;
    private int guestNum;
    private boolean cateringService;
    private boolean photographyService;
    private boolean decorationService;
    private Date startDate;
    private Date endDate;
    private float budget;
    private boolean replied = false;
    private float hallOwnerOffer;
    

    /**
     * Constructor for objects of class Quotation
     */
    public Quotation(String occasion, int guestNum, boolean cateringSerivce,
                     boolean photographyService, boolean decorationService,
                     Date startDate, Date endDate, float budget)
    {
        this.occasion = occasion;
        this.guestNum = guestNum;
        this.cateringService = cateringService;
        this.photographyService = photographyService;
        this.decorationService = decorationService;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        
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
    
    public float getBudget()
    {
        return this.budget;
    }
    
    public void setBudget(float budget)
    {
        this.budget = budget;
    }
    
}