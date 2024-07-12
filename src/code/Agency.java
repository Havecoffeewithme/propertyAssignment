/** @ author : Percy Ratheko
 * version 1.3
 * the class a collection of  Agency data and performs methods on it
 */

import java.util.ArrayList;
import java.util.HashMap;

class Agency
{
    private static final double MINIMUM_VALUE = 0.00;
    private static final int  MIN_NAME_LENGTH = 30;
    private final String name;
    private final HashMap<String, Property> properties;


    public Agency(final String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty() || name.length() > MIN_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.properties = new HashMap<>();
    }

    /**
     * Adds a property to the agency's list of managed properties.
     * @param property : property to be added
     * @throws IllegalArgumentException : if null
     */
    public void addProperty(final Property property) throws IllegalArgumentException
    {
        if (property == null)
        {
            throw new IllegalArgumentException();
        }
        properties.put(property.getPropertyId(), property);
    }

    /**
     *  Removes the property from the collection
     * @param propertyId : the property id
     */

    public void removeProperty(final String propertyId)
    {
        properties.remove(propertyId);
    }


    /**
     * gets the property entered
     * @param propertyId
     * @return the property with the given ID, or null if not found.
     */
    public Property getProperty(final String propertyId)
    {
        return properties.get(propertyId);
    }


    /**
     * this methods gets the total value of the property in USD
     * @return : the total value
     */
    public double getTotalPropertyValues(){
        double total = MINIMUM_VALUE;
        for(Property property : properties.values()){
            total = total + property.getPriceUsd();
        }
        return total;
    }


    /**
     *  Gets properties with swimming pools
     * @return : returns properties with swimming pools
     */
    public ArrayList<Property> getPropertiesWithPools()
    {
        ArrayList<Property> propertiesWithPools;
        propertiesWithPools = new ArrayList<>();
        for (Property property : properties.values())
        {
            if (property.hasSwimmingPool())
            {
                propertiesWithPools.add(property);
            }
        }
        if(propertiesWithPools.isEmpty())
        {
            return null;
        }
        else
        {
            return propertiesWithPools;
        }
    }

    /**
     * gets properties with bedrooms
     * @param minBedrooms : minimum bedrooms
     * @param maxBedrooms : maximum num of bedrooms
     * @return : the properties with the given bedrooms
     */
    public HashMap<String, Property> getPropertiesWithBedrooms(final int minBedrooms, final int maxBedrooms)
    {
        HashMap<String,Property> propertiesBetween;
        propertiesBetween = new HashMap<>();
        for (Property property : properties.values())
        {
            int bedrooms;
            bedrooms= property.getNumberOfBedrooms();
            if (bedrooms>=minBedrooms && bedrooms<=maxBedrooms)
            {
                propertiesBetween.put(property.getPropertyId(),property);
            }
        }
        if(propertiesBetween.isEmpty()){
            return null;
        }
        else {
            return propertiesBetween;
        }
    }


}
