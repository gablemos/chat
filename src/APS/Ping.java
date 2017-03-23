package APS;

import java.net.InetAddress;
import java.util.Scanner;

public class Ping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		pingar(input.nextLine());
		input.close();
	}
	
	private static void pingar(String host) {
		  try {
		    if (InetAddress.getByName(host).isReachable(5000))
		      System.out.println("Ping OK: " + host);
		    else
		      System.out.println("Ping FALHOU: " + host);
		  } catch (Exception e) {
		    System.err.println("Ping FALHOU: " + host + " - " + e);
		  }
		}
    
    
}
