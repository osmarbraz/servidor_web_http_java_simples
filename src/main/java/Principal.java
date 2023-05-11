
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

/**
 *
 * @author osmar
 */
public class Principal {

    public static void main(String[] args) throws Exception {

        //Define a porta do servidor
        InetSocketAddress porta = new InetSocketAddress(8000);

        //Cria o servidor
        HttpServer server = HttpServer.create(porta, 0);

        //Cria os serviços
        server.createContext("/MensagemSimples", new MensagemSimples());

        //Liga o servidor
        server.setExecutor(null);
        server.start();

        System.out.println("Servidor web HTTP no ar:\n  http://localhost:8000/MensagemSimples");
    }
}
