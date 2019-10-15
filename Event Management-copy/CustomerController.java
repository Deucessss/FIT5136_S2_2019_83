
/**
 * Write a description of class CustomerController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class CustomerController
{
    private Customer customer;// instance variables - replace the example below with your own
    /**
     * Constructor for objects of class CustomerController
     */
    public CustomerController()
    {
        // initialise instance variables
        
    }
    
    public void searchHall(String hallName)
    {
        CustomerInterface ci = new CustomerInterface();
        ci.getCustomerController().setCustomer(customer);
        switch(hallName)
        {
            case "0":
                ci.displayCustomerPage();
                break;
            default:
                if (Accounts.searchHall(hallName) == null)
                {
                    
                    ci.displayNoSearchResultPage(hallName);
                }
                else
                {
                   ci.displayHallPage(hallName);
                }
                break;
                
        }
    }
    
    public void requestQuotation(String hallName, String occasion, int guestNum, boolean cateringService,
                                 boolean photographyService, boolean decorationService,
                                 Date startDate, Date endDate, float budget)
    {
        Hall requestedHall = Accounts.searchHall(hallName);
        Quotation quotation = new Quotation(occasion, guestNum, cateringService, photographyService,
                                            decorationService, startDate, endDate, budget, requestedHall, customer);
        requestedHall.getQuotations().add(quotation);
        customer.getQuotations().add(quotation);
    }
    
    public ArrayList<Boolean> serviceProvided(String hallName)
    {
        Hall requestedHall = Accounts.searchHall(hallName);
        ArrayList<Boolean> services = new ArrayList<Boolean>();
        services.add(requestedHall.getCateringService());
        services.add(requestedHall.getPhotographyService());
        services.add(requestedHall.getDecorationService());
        return services;
    }
    
    public void viewAllHalls()
    {
        Accounts.viewHalls();
    }
    
    public boolean checkHallExist(String hallName)
    {
        if (Accounts.searchHall(hallName) != null)
        {
            return true;
        }
        return false;
    }
    
    public void displayQuotations()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Replied Quotations");
        System.out.println("-----------------------------------------------------------------------------");
        for (Quotation quotation : customer.getQuotations())
        {
            if (quotation.getReplied())
            {
                displayRepliedQuotation(quotation);
            }
        }
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Quotations Waiting for Reply");
        System.out.println("-----------------------------------------------------------------------------");
        for (Quotation quotation : customer.getQuotations())
        {
            if (!quotation.getReplied())
            {
                displayUnrepliedQuotation(quotation);
            }
        }
        
    }
    
    
    public void displayRepliedQuotation(Quotation quotation)
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Hall Id", quotation.getHall().getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Quotation Id", quotation.getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Hall Name", quotation.getHall().getName());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Start Date", CustomerInterface.formatter.format(quotation.getStartDate()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "End Date", CustomerInterface.formatter.format(quotation.getEndDate()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Occasion", quotation.getOccasion());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42d|\n", "Guest Number", quotation.getGuestNum());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Catering Service",
                            ((quotation.getCateringService()) ? "Required" : "Not Required"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Catering Cost", quotation.getCateringCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Photography Service", 
                            ((quotation.getPhotographyService()) ? "Required" : "Not Required"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Photography Cost", quotation.getPhotographyCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Decoration Service", 
                            ((quotation.getDecorationService()) ? "Required" : "Not Required")) ;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Decoration Cost", quotation.getDecorationCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Venue Cost", quotation.getVenueCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Total Amount", quotation.getTotalAmount());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42.2f|\n", "Budget", quotation.getBudget());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Accepted", 
                            ((quotation.getQuotationAccepted()) ? "yes" : "no"));
        System.out.println("-----------------------------------------------------------------------------");
    }
    
    public void displayUnrepliedQuotation(Quotation quotation)
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Hall Id", quotation.getHall().getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Quotation Id", quotation.getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Hall Name", quotation.getHall().getName());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Start Date", CustomerInterface.formatter.format(quotation.getStartDate()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "End Date", CustomerInterface.formatter.format(quotation.getEndDate()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Occasion", quotation.getOccasion());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42d|\n", "Guest Number", quotation.getGuestNum());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Catering Service",
                            ((quotation.getCateringService()) ? "Required" : "Not Required"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Photography Service", 
                            ((quotation.getPhotographyService()) ? "Required" : "Not Required"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Decoration Service", 
                            ((quotation.getDecorationService()) ? "Required" : "Not Required")) ;
        System.out.format("|  %-28s|  %-42.2f|\n", "Budget", quotation.getBudget());
        System.out.println("-----------------------------------------------------------------------------");
    }
    
    public Quotation searchAcceptableQuotation(int hallId, int quotationId)
    {
        for (Quotation quotation : customer.getQuotations())
        {
            if (quotation.getHall().getId() == hallId && quotation.getId() == quotationId 
                    && !quotation.getQuotationAccepted() && quotation.getReplied())
            {
                return quotation;
            }
        }
        return null;
    }
    
    public void acceptQuotation(Quotation quotation)
    {
        quotation.setQuotationAccepted(true);
        
        Booking booking = new Booking(quotation.getOccasion(), quotation.getGuestNum(),
                                      quotation.getCateringService(), quotation.getCateringCost(),
                                      quotation.getPhotographyService(), quotation.getPhotographyCost(),
                                      quotation.getDecorationService(), quotation.getDecorationCost(),
                                      quotation.getVenueCost(), quotation.getStartDate(), quotation.getEndDate(),
                                      quotation.getHall());
        
        
                                      
        customer.getBookings().add(booking);
        quotation.getHall().getBookings().add(booking);
        
        //customer.getQuotations().remove(quotation);
        //quotation.getHall().getQuotations().remove(quotation);
        //quotation.getHall().getPastQuotations().add(quotation);
        //booking.setId(customer.getBookings.size());
    }
    
    public void displayBookings()
    {
        if (customer.getBookings().size() > 0)
        {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Active Booking");
            System.out.println("-----------------------------------------------------------------------------");
            for (Booking booking : customer.getBookings())
            {
                displayBooking(booking);
            }
        }
        else
        {
            System.out.println("You have no active booking yet");
        }
        
        if (customer.getPastBookings().size() > 0)
        {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Past Booking");
            System.out.println("-----------------------------------------------------------------------------");
            for (Booking booking : customer.getPastBookings())
            {
                displayBooking(booking);
            }
        }
        else
        {
            System.out.println("You have no past booking yet");
        }
        
    }
    
    public void displayBooking(Booking booking)
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Hall Id", booking.getHall().getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Quotation Id", booking.getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Hall Name", booking.getHall().getName());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Start Date", CustomerInterface.formatter.format(booking.getStartDate()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "End Date", CustomerInterface.formatter.format(booking.getEndDate()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Occasion", booking.getOccasion());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42d|\n", "Guest Number", booking.getGuestNum());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Catering Service",
                            ((booking.getCateringService()) ? "Required" : "Not Required"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Catering Cost", booking.getCateringCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Photography Service", 
                            ((booking.getPhotographyService()) ? "Required" : "Not Required"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Photography Cost", booking.getPhotographyCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Require Decoration Service", 
                            ((booking.getDecorationService()) ? "Required" : "Not Required")) ;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Decoration Cost", booking.getDecorationCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Venue Cost", booking.getVenueCost());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("|  %-28s|  %-42s|\n", "Total Amount", booking.getTotalAmount());
        System.out.println("-----------------------------------------------------------------------------");
    }
    
    public void logout()
    {
        Homepage hp = new Homepage();
        hp.displayHomepage();
    }
    
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
}
