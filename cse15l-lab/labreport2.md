# __Lab Report 2__

***

```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> chatLog = new ArrayList<>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            String[] parameterStrings = url.getQuery().split("&");
            chatLog.add(UserAndMessage(parameterStrings));
            return String.join("\n", chatLog);
        } else {
            return "404 Not Found!";
        }
    }

    public static String UserAndMessage(String[] parameterStrings) {
        String[] message = parameterStrings[0].split("=");
        String[] username = parameterStrings[1].split("=");
        return String.format("%s: %s", username[1], message[1]);
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```


