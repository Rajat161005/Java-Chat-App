import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            new Thread(() -> {
                String serverMsg;
                try {
                    while ((serverMsg = serverInput.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Lost connection to the server.");
                }
            }).start();

            String input;
            while ((input = userInput.readLine()) != null) {
                out.println(input);
            }

        } catch (UnknownHostException e) {
            System.out.println("Server not found. Please check the server address.");
        } catch (IOException e) {
            System.out.println("Unable to connect to the server. Please make sure the server is running.");
        }
    }
}
