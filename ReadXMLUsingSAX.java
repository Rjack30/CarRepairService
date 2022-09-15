public class ReadXMLUsingSAX {


    public static void main (String[] args){
        try
        {
SAXParserFactory fact = SAXParserFactory.newInstance();
SAXParser saxParser = fact.newSAXParser();

DefaultHandler handle = new DefaultHandler(){
boolean bfname = false, blname = false, bscore = false;

public void startElement (String url, String localName, String qname, Attributes attributes ) throws SAXException{
    System.out.println("Start Element: " + qname);
    if(qname.equals("firstname")) bfname = true;
    if(qname.equals("lastname")) blname = true;
    if(qname.equals("score")) bscore = true;
}
    public void endElement (String url, String localName, String qname, Attributes attributes )
    {
        System.out.println("Start Element: " + qname);
    }
    public void characters( char[] ch, int start, int length) throws SAXException
    {
        if(bfname)
    }
    {
       System.out.println("First name: " + new String(ch, start, length));
        bfname = false;
    }

        }
        }
        catch (Exception ex)




}
