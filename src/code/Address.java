
/**
 * @ author : Percy Ratheko
 * version 1.1
 * This class represents the address information and performs methods on it .
 */

class Address
{

    // Our constants :
    private static final int HIGHEST_UNIT_NUM = 4;
    private static final int MIN_STREET_NUM = 0;

    private static final int MAX_STREET_NUM = 999999;

    private static final int MAX_STREET_NAME_CHAR = 20;

    private static final int LOWEST_POSTAL_NUM = 5;
    private static final int HIGHEST_POSTAL_NUM = 6;
    private static final int MAX_CITY_CHAR = 30;




    private final String unitNumber;
    private final int   streetNumber;
    private final String streetName;
    private final String postalCode;
    private final String City;

    /**
     *
     * @param unitNumber : the unit number
     * @param streetNumber : the street number
     * @param streetName : the street name
     * @param postalCode : The postal code
     * @param city : The city name
     */
    public Address(String unitNumber,
                   final int streetNumber,
                   final String streetName,
                   final String postalCode,
                   final String city) throws IllegalArgumentException
    {
        if (unitNumber != null &&
                (unitNumber.isEmpty() || unitNumber.length() > HIGHEST_UNIT_NUM))
        {
            throw new IllegalArgumentException("Invalid unit number: "+unitNumber);
        }
        if (streetNumber < MIN_STREET_NUM || streetNumber > MAX_STREET_NUM)
        {
            throw new IllegalArgumentException("Invalid street number: "+streetNumber);
        }
        if (streetName==null){
            throw new NullPointerException("Invalid street name: null");
        }
        if (streetName.isEmpty() || streetName.length() > MAX_STREET_NAME_CHAR)
        {
            throw new IllegalArgumentException("Invalid street name: "+streetName);
        }
        if (postalCode==null){
            throw new NullPointerException("Invalid postal code: null");
        }
        if (postalCode.length() != LOWEST_POSTAL_NUM && postalCode.length() != HIGHEST_POSTAL_NUM)
        {
            throw new IllegalArgumentException("Invalid postal code: "+postalCode);
        }
        if (city==null){
            throw new NullPointerException("Invalid city: null");
        }
        if (city.isEmpty() || city.length() > MAX_CITY_CHAR) {
            throw new IllegalArgumentException("Invalid city: " + city);
        }

        this.unitNumber = unitNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        City = city;
    }

    // gets the unit number
    public String getUnitNumber()
    {
        return unitNumber;
    }

    // gets the street number
    public int getStreetNumber()
    {
        return streetNumber;
    }

    // gets the streetName
    public String getStreetName()
    {
        return streetName;
    }

    // gets the postal code
    public String getPostalCode()
    {
        return postalCode;
    }

    // gets the city name
    public String getCity()
    {
        return City;
    }

}
