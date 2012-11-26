package source;

import java.util.ArrayList;
import java.util.List;

public class Place
{
    private String id;
    private String name;
    private String adress;
    private double latitude;
    private double longitude;
    private float rating;
    private String icon;
    private String reference;
    private List<String> typeList = new ArrayList<String>();
    
    public Place()
    {
        
    }
    
    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @return the adress
     */
    public String getAdress()
    {
        return adress;
    }
    
    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress)
    {
        this.adress = adress;
    }
    
    /**
     * @return the latitude
     */
    public double getLatitude()
    {
        return latitude;
    }
    
    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }
    
    /**
     * @return the longitude
     */
    public double getLongitude()
    {
        return longitude;
    }
    
    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }
    
    /**
     * @return the rating
     */
    public float getRating()
    {
        return rating;
    }
    
    /**
     * @param rating the rating to set
     */
    public void setRating(float rating)
    {
        this.rating = rating;
    }
    
    /**
     * @return the icon
     */
    public String getIcon()
    {
        return icon;
    }
    
    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon)
    {
        this.icon = icon;
    }
    
    /**
     * @return the reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * @param reference the reference to set
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * @return the typeList
     */
    public List<String> getTypeList()
    {
        return typeList;
    }
    
    /**
     * @param typeList the typeList to set
     */
    public void setTypeList(List<String> typeList)
    {
        this.typeList = typeList;
    }
    
}
