package interview;


import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class IPAddressFromLocalHost {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Getting IP address from local host.");
		System.out.println(InetAddress.getLocalHost());
		System.out.println(Inet4Address.getLocalHost());
		System.out.println(Inet6Address.getLocalHost());
	
		
		String nameAndIP=InetAddress.getLocalHost().toString();
		
		if(nameAndIP.contains("/"))
		{
		System.out.println("Name of system:				"+nameAndIP.split("/")[0]);
		System.out.println("IP address of your system:		"+nameAndIP.split("/")[1]);
		}
	}

}
