package udp.servidor;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;

public class UDPservidorMain {
	public static void main(String[] args) {
		LSimLogger.setLoggerAsLocalLogger("udp_servidor", "." + File.separator + "logs" + File.separator, true);

		LSimLogger.log(Level.INFO, "inici servidor");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el servidor: ");

		String server = input.nextLine(); 
		System.out.println("Server ingresado: " + server); 

		int port = Integer.parseInt(server);

		Map<String, String> map = new HashMap<String, String>();

		switch (port) {
		case 5836:
			map.put("k1", "R_k1");
			map.put("k3", "R_k3");
			map.put("k4", "R_k4");
			break;
		case 5838:
			map.put("k2", "R_k2");
			break;
		}

		new RemoteMapUDPservidor(port, map);
	}

}
