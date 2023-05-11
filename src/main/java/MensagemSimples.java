
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author osmar
 */
public class MensagemSimples implements HttpHandler {

    @Override
    public void handle(HttpExchange request) throws IOException {

        //Mensagem a ser gerada
        String resposta = "Servidor HTTP Simples";

        request.sendResponseHeaders(200, resposta.length());
        OutputStream corpo = request.getResponseBody();
        corpo.write(resposta.getBytes());
        corpo.close();
    }
}
