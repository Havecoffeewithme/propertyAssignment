/**
 * @ author: Percy Ratheko
 * version 1.2
 * This class represents property data and performs methods on the property class.
 */
class Property
{
    private static final int MINIMUM_NUM = 0;
    private static final int MIN_BEDROOM_NUM = 1;
    private static final int MAX_BEDROOM_NUM = 20;
    private static final int MIN_PID_SIZE = 6;


    private double priceInUsd;
    private final Address address;
    private final int numberOfBedrooms;
    private final boolean hasSwimmingPool;
    private final String type;
    private final String propertyId;




    /**
     * @param priceInUsd : The price in american dollars .
     * @param address : the provided address
     * @param numberOfBedrooms : number of bedrooms of the house
     * @param hasSwimmingPool : indicates whether the property has a swimming pool or not
     * @param type : type of property
     * @param propertyId : property Id.
     */

    public Property(final double priceInUsd,
                    final Address address,
                    final int numberOfBedrooms,
                    final boolean hasSwimmingPool,
                    final String type,
                    final String propertyId)
    {
        if (priceInUsd <= MINIMUM_NUM)
        {
            throw new IllegalArgumentException("Invalid price: "+ priceInUsd);
        }
        if (numberOfBedrooms < MIN_BEDROOM_NUM || numberOfBedrooms > MAX_BEDROOM_NUM)
        {
            throw new IllegalArgumentException("Invalid number of bedrooms: "+numberOfBedrooms);
        }
        if(type==null){
            throw new NullPointerException("Invalid property type: null");
        }
        if (!type.equalsIgnoreCase("Residence")
                && !type.equalsIgnoreCase("Commercial")
                && !type.equalsIgnoreCase("Retail")) {
            throw new IllegalArgumentException("Invalid property type: "+type);
        }
        if(propertyId==null)
        {
            throw new NullPointerException("Invalid property id: null");
        }
        if (propertyId.length() > MIN_PID_SIZE || propertyId.isEmpty())
        {
            throw new IllegalArgumentException("Invalid property id: "+propertyId);
        }
        if(address==null)
        {
            throw new NullPointerException("Invalid address: null");
        }


        this.priceInUsd = priceInUsd;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.type = type;
        this.propertyId = propertyId;
    }


    /**
     * the method gets the price in USD.
     * @return : returns the prince in USD.
     */

    public double getPriceUsd()
    {
        return priceInUsd;
    }

    /**
     * the methods sets the price .
     * @param priceInUsd
     */
    public void setPriceUsd(final double priceInUsd)
    {
        this.priceInUsd = priceInUsd;
    }

    /**
     * the method gets the address of the property.
     * @return : returns the address.
     */
    public Address getAddress()
    {
        return address;
    }

    /**
     * the method gets the number of bedrooms
     * @return : returns the num of bedrooms of the property
     */
    public int getNumberOfBedrooms()
    {
        return numberOfBedrooms;
    }


    /**
     * the method asks whether the property has a swimming pool or not
     * @return True or false
     */
    public boolean hasSwimmingPool()
    {
        return hasSwimmingPool;
    }

    /**
     * the methods gets the type of the property.
     * @return: returns the type of the property
     */
    public String getType()
    {
        return type;
    }

    /**
     * the methods gets the id of the property.
     * @return: returns the id  of the property.
     */
    public String getPropertyId()
    {
        return propertyId;
    }
}
