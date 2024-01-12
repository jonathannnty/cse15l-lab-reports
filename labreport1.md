For each of the commands cd, ls, and cat, and using the workspace you created in this lab:

Share an example of using the command with no arguments.
Share an example of using the command with a path to a directory as an argument.
Share an example of using the command with a path to a file as an argument.
So that's 9 total examples (3 for each command). For each, include:

A screenshot or Markdown code block showing the command and its output
What the working directory was when the command was run
A sentence or two explaining why you got that output (e.g. what was in the filesystem, what it meant to have no arguments).
Indicate whether the output is an error or not, and if it's an error, explain why it's an error.

# `cd` command

1. Command with no arguments
```
{
  [user@sahara ~]$ cd
  [user@sahara ~]$ 
}
```
The current working directory is after the command is run is /home
Since no path arguments were provided, the change direction (cd) command did not change the directory to anything.
This is not an error.

2. Command with a path to a directory as an argument
```
{
  [user@sahara ~]$ cd lecture1/
  [user@sahara ~/lecture1]$ 
}
```
The current working directory is after the command is run is /home/lecture1/
The provided path argument is valid and accessible from /home/ since it is a directory, thus changing the directory from /home/ to /home/lecture1/
This is not an error.

3. Command with a path to a file as an argument
```
{
  [user@sahara ~]$ cd lecture1/messages/sr.txt 
  bash: cd: lecture1/messages/sr.txt: Not a directory
}
```
The current working directory is after the command is run is /home
The path to a file argument provided is invalid since it is a file, command does not execute.
There is an error since it argument is not a directory.
***

# `ls` command

1. Command with no arguments
```
{
  [user@sahara ~]$ ls
  lecture1
  [user@sahara ~]$ 
}
```
The current working directory is after the command is /home
The command `ls` does not affect the current working directory but instead prints out a list of possible pathways that can taken from /home
This is not an error.

2. Command with a path to a directory as an argument
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
The current working directory is after the comand is run
The command blah blah
Error or no?

3. Command with a path to a file as an argument
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
The current working directory is after the comand is run
The command blah blah
Error or no?



# `cat` command

1. Command with no arguments
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
The current working directory is after the comand is run
The command blah blah
Error or no?

2. Command with a path to a directory as an argument
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
The current working directory is after the comand is run
The command blah blah
Error or no?

3. Command with a path to a file as an argument
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
The current working directory is after the comand is run
The command blah blah
Error or no?
