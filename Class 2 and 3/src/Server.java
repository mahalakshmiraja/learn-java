import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while(true){
                System.out.println("Ready to receive a new connection");
                Socket client = serverSocket.accept();
                System.out.println("Accepted connection");
                String response = "[{\"title\":\"Ready Player One\",\"author\":\"Ernest Cline\",\"image\":\"https://m.media-amazon.com/images/I/A14SjqgHuJL._SX140_.jpg\"}]";
                PrintWriter printWriter = PrintWriter(client.getOutputStream());
                printWriter.println("HTTP/1.1 200 OK");
                printWriter.println("Access-Control-Allow-Headers");
                printWriter.println("Access-Control-Allow-Origin");
                printWriter.println("Content-Type: application/json");
                printWriter.println("Content-Length: [insert the length of your json response]\n");
                printWriter.println();
                printWriter.println(response);
                printWriter.close();

            }
        }catch (IOException e){
            System.out.println("Error Starting Server");

        }
    }
}
