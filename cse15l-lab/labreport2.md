# __Lab Report 2__

***

```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    ArrayList<String> chatLog = new ArrayList<>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            if (chatLog.isEmpty()) {
                return "/add-message?s=<String>&user=<String>";
            }
            return String.join("\n", chatLog);
        } else if (url.getPath().equals("/add-message")) {
            String[] parameterStrings = url.getQuery().split("&");
            String message = parameterStrings[0].substring(parameterStrings[0].indexOf("=") + 1);
            String username = parameterStrings[1].substring(parameterStrings[0].indexOf("user=") + 6);
            String newMessage = String.format("%s: %s", username, message);
            chatLog.add(newMessage);
            return String.join("\n", chatLog);
        } else {
            return "404 Not Found!";
        }
    }
}
```
## /add-message Request #1
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotpath1.png)

## /add-message Request #1 Page Result
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotresult1.png)

***
## /add-message Request #2
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotpath2.png)

## /add-message Request #2 Page Result
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotresult2.png)
