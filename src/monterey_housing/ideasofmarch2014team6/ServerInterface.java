package monterey_housing.ideasofmarch2014team6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServerInterface {

    public static String SERVER_URL ;

    /**
     * Gets the data from the server.
     * @param server_url is passed, defined in resources R.string.server_url
     * @return A string containing a semicolon and comma-delimited list of businesses.
     * The semicolons separate business classes, the commas the businesses
     * within each class.
     */
    public static String getList(String server_url) {
            /*
             * Let's construct the query string. It should be a key/value pair. In
             * this case, we just need to specify the command, so no additional
             * arguments are needed.
             * @param server_url is passed, defined in resources R.string.server_url
             */
    		SERVER_URL = server_url ;
            String data = "command=" + "getList";
            return executeHttpRequest(data);
    }

    /**
     * Gets the list sorted by City from the server.
     * @param City String specifying the city
     * @param server_url is passed, defined in resources R.string.server_url
     * @return The entire list sorted by city
     */
    public static String getByCity(String City, String server_url) {
            SERVER_URL = server_url ;
            String data = "command=" + "getCity";
            data += "&city=" + City;
            return executeHttpRequest(data);
    }
    
    public static String getCities(String server_url) {
        SERVER_URL = server_url ;
        String data = "command=" + "getCities";
       // data += "&city=" + URLEncoder.encode(City);
        return executeHttpRequest(data);
}

    /**
     * Helper function used to communicate with the server by sending/receiving
     * POST commands.
     * @param data String representing the command and (possibly) arguments.
     * @return String response from the server.
     */
    private static String executeHttpRequest(String data) {
            String result = "";
            try {
                    URL url = new URL(SERVER_URL);
                    URLConnection connection = url.openConnection();
                    
                    /*
                     * We need to make sure we specify that we want to provide input and
                     * get output from this connection. We also want to disable caching,
                     * so that we get the most up-to-date result. And, we need to 
                     * specify the correct content type for our data.
                     */
                    connection.setDoInput(true);
                    connection.setDoOutput(true);
                    connection.setUseCaches(false);
                    connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

                    // Send the POST data
                    DataOutputStream dataOut = new DataOutputStream(connection.getOutputStream());
                    dataOut.writeBytes(data);
                    dataOut.flush();
                    dataOut.close();

                    // get the response from the server and store it in result
                    DataInputStream dataIn = new DataInputStream(connection.getInputStream()); 
                    String inputLine;
                    while ((inputLine = dataIn.readLine()) != null) {
                            result += inputLine;
                    }
                    dataIn.close();
            } catch (IOException e) {
                    /*
                     * In case of an error, we're going to return a null String. This
                     * can be changed to a specific error message format if the client
                     * wants to do some error handling. For our simple app, we're just
                     * going to use the null to communicate a general error in
                     * retrieving the data.
                     */
                    e.printStackTrace();
                    result = null;
            }

            return result;
    }
    
    
    public static ArrayList<Rental> buildRentalsList(Object objResult){
    	if(objResult != null && objResult instanceof String) {                
    	ArrayList<Rental> output = new ArrayList<Rental>();
	    String result = (String) objResult;
        // this is used to hold the string array, after tokenizing
        String[] responseList, rentalAttributes;

        // we'll use a string tokenizer, with "," (comma) as the delimiter
        StringTokenizer tk1 = new StringTokenizer(result, "<br />");

        // now we know how long the string array is
        responseList = new String[tk1.countTokens()];
        int j = 0 ;
        while (tk1.hasMoreTokens()) {
        	responseList[j] = tk1.nextToken();
            StringTokenizer tk2 = new StringTokenizer(responseList[j++], ",");
            rentalAttributes = new String[tk2.countTokens()];
            int i = 0;
            while(tk2.hasMoreTokens()) {
                    rentalAttributes[i++] = tk2.nextToken();
            
            }
            
            //create rental object
            Rental tempRental = new Rental();
            tempRental.setCity(rentalAttributes[1]);
            tempRental.setNumBedrooms(rentalAttributes[2]);
            tempRental.setAddress(rentalAttributes[4]);
            tempRental.setPhoneNum(rentalAttributes[5]);
            tempRental.setRent(rentalAttributes[6]);
            tempRental.setOtherInfo(rentalAttributes[6]);
            
            output.add(tempRental);
            
        
    	
        }
        return output;
    } 
        return null;
    }
}
