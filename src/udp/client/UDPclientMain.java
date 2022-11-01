package udp.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;

public class UDPclientMain {
	public static void main(String[] args) {
		LSimLogger.setLoggerAsLocalLogger("udp_client", "." + File.separator + "logs" + File.separator, true);

		LSimLogger.log(Level.INFO, "inicio de socket");

		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el servidor: ");

		String server = input.nextLine(); 
		System.out.println("Server ingresado: " + server); 
		List<Key> keys = new ArrayList<Key>();

		switch (server) {
		case "1":
			keys.add(new Key("k1", "localhost", 5836));
			break;
		case "2":
			keys.add(new Key("k2", "localhost", 5837));
			break;
		case "3":
			keys.add(new Key("k3", "localhost", 5838));
			break;
		case "4":
			keys.add(new Key("k4", "localhost", 5839));
			break;
		case "todos":
			keys.add(new Key("k1", "localhost", 5836));
			keys.add(new Key("k2", "localhost", 5837));
			keys.add(new Key("k3", "localhost", 5838));
			keys.add(new Key("k4", "localhost", 5839));
			break;
		default:
			System.out.println("No ingreso una opción correcta");
		}

		RemoteMapUDPclient rm = new RemoteMapUDPclient();
		Map<String, String> map = rm.getMap(keys);

		LSimLogger.log(Level.INFO, "map: " + map);
	}
}
