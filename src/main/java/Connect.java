
import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public final class Connect {
    public static void main01(String[] args) {
        Properties props = new Properties();
        props.put("jdbc.url", "jdbc:postgresql://localhost:5432/postgres");
        props.setProperty("user", "user");
        props.setProperty("password", "****");


        try {
            Connection c = DriverManager.getConnection(props.getProperty("jdbc.url"), props);
            System.out.println("Success");
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WebSocketStreamClient client = new WebSocketStreamClientImpl();
        client.klineStream("btcusdt", "1s", ((event) -> {
            System.out.println(event);
            // client.closeAllConnections();
        }));

    }
}