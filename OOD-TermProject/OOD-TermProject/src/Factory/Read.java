package Factory;

public class Read {
	   public JSONStrategy createStrategy(String dataFormat) {
	        if (dataFormat.equalsIgnoreCase("json")) {
	            return new JSONStrategy();
	        } else if (dataFormat.equalsIgnoreCase("xml")) {
	            return new XMLStrategy();
	        } else {
	            return null;
	        }
	    }

}
