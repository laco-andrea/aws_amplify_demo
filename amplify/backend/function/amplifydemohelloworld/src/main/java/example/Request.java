package example;

import java.util.Map;

public class Request {
    private Map<String, String> queryStringParameters;

    // getter e setter ...
    public Map<String, String> getQueryStringParameters() {
        return queryStringParameters;
    }

    public void setQueryStringParameters(Map<String, String> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    // Metodo per ottenere un parametro di query specifico
    public String getQueryParam(String key) {
        if (queryStringParameters != null && queryStringParameters.containsKey(key)) {
            return queryStringParameters.get(key);
        }
        return "";
    }
}

