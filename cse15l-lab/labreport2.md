# __Lab Report 2__

***
## Code Block
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
***

## /add-message Request #1
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotpath1.png)

## /add-message Request #1 Page Result
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotresult1.png)

The methods in my code that are called are 
- getQuery():

There are no relevent arguments. Relevant values is the whatever follows the key "?" in a Path. The values changes from this specific request based on whatever the user inputs into the Query and is variable. If no changes were made to following the method call, it is based on the user's choice.

- split(String regex)

The argument String regex splits the String the method is called on by the given regular expression. Relevant values is the split String elements created in the String array. The values changes because the split elements may have differing String lengths because a portion of the element is determined by what the user inputs. If no changes were made to following the method call, it is based on the user's choice of keeping whatever followed the previous query. 

- substring(int beginIndex)

The argument int beginIndex is used on to create a substring of a given string beginning at an passed index. Relevent values is the length of the split query because depending on user input, the length and content of the String may differ. If no changes were made to following the method call, it is based on the user's choice of keeping whatever followed the previous query. 

- indexOf(String str)

The argument String str returns an index value of a given String based on where the first occurence of the passed str occur in the String object. Relevant values is "="/"user=", +1, and +6. This is because the index starts at the first occurence but we do not want to include "=" into the substring, only what follows the "=", so +1 and +6 shifts the start index of substring creation. The values are not intended to change and if it were, it would because invalid user input.  

- format(String format, Object... args)

The argument String format and Object... args plugs in the provided args into the positions were formatting is called in the String, with the key for formatting being "%". The username and message that was split and substring'd is used as formatting into the String format. The format String remains constant while username and message is variable based on user input.

- add(E e)

The argument E e adds an generic matching the declared type of an ArrayList into the ArrayList. The relevant values is the newMessage passed. Based on the user input into the request, the newMessage that follows "(user): (message)" formatting is highly variable. These values will not change if user does another request the same user and message. 

- join(CharSequence delimiter, CharSequence... elements)

The argument CharSequence delimiter, CharSequence elements is used to insert delimiter between each element of the ArrayList chatLog, which in this case is "\n". The relevant values is "\n" and chatLog because it'll return a new line for each chat message stored into the chatLog ArrayList. The fields chatLog is expected to change and be updated for each insertion of a new chat message.


***

## /add-message Request #2
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotpath2.png)

## /add-message Request #2 Page Result
![Image](https://github.com/jonathannnty/cse15l-lab-reports/blob/28c0c9d4b3cfaac68cdf75504265420baa83bc73/images/screenshotresult2.png)

The methods in my code that are called are 
- getQuery():

There are no relevent arguments. Relevant values is the whatever follows the key "?" in a Path. The values changes from this specific request based on whatever the user inputs into the Query and is variable. If no changes were made to following the method call, it is based on the user's choice.

- split(String regex)

The argument String regex splits the String the method is called on by the given regular expression. Relevant values is the split String elements created in the String array. The values changes because the split elements may have differing String lengths because a portion of the element is determined by what the user inputs. If no changes were made to following the method call, it is based on the user's choice of keeping whatever followed the previous query. 

- substring(int beginIndex)

The argument int beginIndex is used on to create a substring of a given string beginning at an passed index. Relevent values is the length of the split query because depending on user input, the length and content of the String may differ. If no changes were made to following the method call, it is based on the user's choice of keeping whatever followed the previous query. 

- indexOf(String str)

The argument String str returns an index value of a given String based on where the first occurence of the passed str occur in the String object. Relevant values is "="/"user=", +1, and +6. This is because the index starts at the first occurence but we do not want to include "=" into the substring, only what follows the "=", so +1 and +6 shifts the start index of substring creation. The values are not intended to change and if it were, it would because invalid user input.  

- format(String format, Object... args)

The argument String format and Object... args plugs in the provided args into the positions were formatting is called in the String, with the key for formatting being "%". The username and message that was split and substring'd is used as formatting into the String format. The format String remains constant while username and message is variable based on user input.

- add(E e)

The argument E e adds an generic matching the declared type of an ArrayList into the ArrayList. The relevant values is the newMessage passed. Based on the user input into the request, the newMessage that follows "(user): (message)" formatting is highly variable. These values will not change if user does another request the same user and message. 

- join(CharSequence delimiter, CharSequence... elements)

The argument CharSequence delimiter, CharSequence elements is used to insert delimiter between each element of the ArrayList chatLog, which in this case is "\n". The relevant values is "\n" and chatLog because it'll return a new line for each chat message stored into the chatLog ArrayList. The fields chatLog is expected to change and be updated for each insertion of a new chat message.
