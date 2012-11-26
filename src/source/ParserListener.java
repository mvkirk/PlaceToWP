package source;
public class ParserListener
{
    private String url = "https://maps.googleapis.com/maps/api/place/textsearch/xml?query=bar&type=bar&location=45.764043,4.835659&radius=6000&sensor=true&key=";
    private String key;
    
    public ParserListener(String key)
    {
        this.key = key;
    }
    
    public void parse()
    {
        
    }
}
