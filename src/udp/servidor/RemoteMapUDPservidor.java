package udp.servidor;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;

public class RemoteMapUDPservidor {
	public RemoteMapUDPservidor(int server_port, Map<String, String> map) {
		LSimLogger.log(Level.INFO, "Inici RemoteMapUDPservidor ");
		LSimLogger.log(Level.INFO, "server_port: " + server_port);
		LSimLogger.log(Level.INFO, "map: " + map);

		// Server waits for requests a maximum time (timeout_time)
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.exit(0);
			}
		}, 90000 // 90 seconds
		);

		// Implementation of the server

		/*
		 * TODO: implementació de la part servidor UDP / implementation of UDP server's
		 * side / implementación de la parte servidor UDP
		 */
	}

}
