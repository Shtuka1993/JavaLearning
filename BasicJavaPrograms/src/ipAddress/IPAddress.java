package ipAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

    public static void main(String[] args) {
        try{
            System.out.println("IP Address: "+InetAddress.getLocalHost());
        }catch(UnknownHostException ex){

        }
    }

}
