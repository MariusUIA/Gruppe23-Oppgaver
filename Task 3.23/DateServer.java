import java.net.*;
import java.io.*;

public class DateServer
{

	 public static void main(String[] args) {
  		try {
   		 ServerSocket sock = new ServerSocket(6017);

 	  /* now listen for connections */
 	  while (true) {
	    Socket client = sock.accept();

	    PrintWriter pout = new
		PrintWriter(client.getOutputStream(), true);


	    String quote = "This is today's quote";
	    pout.println(quote.toString());

	    	/* close the socket and resume */
   	 	/* listening for connections */
    		client.close();
   }

  } catch (IOException ioe) {
   System.err.println(ioe);
  }
 }
}
