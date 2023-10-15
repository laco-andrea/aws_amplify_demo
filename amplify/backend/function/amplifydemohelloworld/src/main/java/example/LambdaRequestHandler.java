package example;

import java.util.HashMap;
import java.util.Map;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LambdaRequestHandler implements RequestHandler<Request, ProxyResponse> {

    public ProxyResponse handleRequest(Request request, Context context) {
        String name = "anonimo";
        if (request != null) {
            name = request.getQueryParam("name");
            if (name.isEmpty()) {
                name = "anonimo";
            }
        }
        String message = "Ciao" + " " + name;
        // Crea il messaggio in formato JSON
        String jsonString = "";
        try {
            Map<String, String> responseBody = new HashMap<>();
            responseBody.put("message", message);

            ObjectMapper objectMapper = new ObjectMapper();
            jsonString = objectMapper.writeValueAsString(responseBody);
        } catch (Exception e) {
            // Gestione degli errori durante la creazione del JSON
            context.getLogger().log("Errore durante la creazione del JSON: " + e.getMessage());
        }

        // Costruisce la risposta per API Gateway
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        return new ProxyResponse(200, headers, jsonString);
    }
}
