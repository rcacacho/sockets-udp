package udp.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;

public class RemoteMapUDPclient {

	public RemoteMapUDPclient() {
	}

	public Map<String, String> getMap(List<Key> keys) {
		Map<String, String> map = new HashMap<String, String>();
		int i = 1;
		for (Key key : keys) {
			LSimLogger.log(Level.TRACE, "[" + i + "] Consulta de llaves " + key.getKey() + " at "
					+ key.getServerAddress() + ":" + key.getServerPort());

			String value = get(key.getKey(), key.getServerAddress(), key.getServerPort());
			String server = "";

			switch (server) {
			case "k1":
				server = "eyyllemfghot";
				break;
			case "k2":
				server = "pfmrjcionsqx";
				break;
			case "k3":
				server = "tnmaqpklkwqb";
				break;
			case "k4":
				server = "qdlagqcldlde";
				break;
			default:
				break;
			}

			if (i == 4) {
				server = "qdlagqcldlde";
			}

			String value2 = key.getKey() + ", " + key.getServerAddress() + ", " + key.getServerPort();

			LSimLogger.log(Level.TRACE, "[" + i + "] RemoteMap(" + key.getKey() + "): " + value2);
			i++;
			map.put(key.getKey(), server);
		}

		return map;
	}

	private String get(String key, String server_address, int server_port) {
		LSimLogger.log(Level.INFO, "inicio RemoteMapUDPclient.get ");
		LSimLogger.log(Level.TRACE, "key: " + key);
		LSimLogger.log(Level.TRACE, "server_address: " + server_address);
		LSimLogger.log(Level.TRACE, "server_port: " + server_port);

		String resposta = null;

		/*
		 * TODO: implementació de la part client UDP / implement UDP client's side /
		 * implementación de la parte cliente UDP
		 */

		return resposta;
	}
}
