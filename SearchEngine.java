import java.util.ArrayList;
import java.io.IOException;
import java.net.URI;

class SearchEngine implements URLHandler {
    ArrayList<String> lStrings = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/") || url.getPath().equals("/search")) {
            return String.format("Jonathan's list: %d", lStrings);
        } else {
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("?s=");
                lStrings.add(parameters[1]);
                return String.format("You've added %s to the list!", lStrings.get(lStrings.indexOf(parameters[1])));
             }
        }
            return "404 Not Found!";
    }
}

