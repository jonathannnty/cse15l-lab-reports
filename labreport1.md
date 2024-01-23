# __Lab Report 1__

***

# `cd` command

1. _Command with no arguments_
```
{
  [user@sahara ~]$ cd
  [user@sahara ~]$ 
}
```
```
{
  [user@sahara ~/lecture1]$ cd
  [user@sahara ~]$ 
}
```
The current working directory after the command is run is /home. Since no path arguments were provided, the change direction (cd) command will change whatever the current directory is to /home. If the current working directory is other than /home, such as /home/lecture1, calling cd with no path arguments will change the directory to /home regardless. This is not an error.

2. _Command with a path to a directory as an argument_
```
{
  [user@sahara ~]$ cd lecture1/
  [user@sahara ~/lecture1]$ 
}
```
The current working directory after the command is run is /home/lecture1. The provided path argument is valid and accessible from /home since it is a directory, thus changing the directory from /home to /home/lecture1. This is not an error.

3. _Command with a path to a file as an argument_
```
{
  [user@sahara ~]$ cd lecture1/messages/sr.txt 
  bash: cd: lecture1/messages/sr.txt: Not a directory
}
```
The current working directory after the command is run is home. The path to a file argument provided is invalid since it is a file, command does not execute. There is an error since it argument is not a directory.

***

# `ls` command

1. _Command with no arguments_
```
{
  [user@sahara ~]$ ls
  lecture1
  [user@sahara ~]$ 
}
```
The current working directory after the command is /home. The command `ls` does not affect the current working directory but instead prints out a list of possible pathways that can taken from /home. This is not an error.

2. _Command with a path to a directory as an argument_
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
The current working directory after the command is run is /home. The command `ls` and the argument simply lists about the possible pathways to take from the given valid directory argument. This is not an error!

3. _Command with a path to a file as an argument_
```
{
  [user@sahara ~]$ ls lecture1/messages/sr.txt 
  lecture1/messages/sr.txt
  [user@sahara ~]$ 
}
```
The current working directory after the command is run is home. The command `ls` and the given argument to a file lists out all possible pathways starting from the file, which is just the file itself. This is not an error.

***

# `cat` command

1. _Command with no arguments_
```
{
  [user@sahara ~]$ cat
  Hello, world!
  Hello, world!
}
```
```
{
  [user@sahara ~]$ cat lecture1/messages/en-us.txt 
  Hello World!
}
```

The current working directory after the command is run is home. The command prints out the contents of a valid file that passed an argument; if the current directory is /home then it'll print out whatever is entered in the terminal following the cat command. This is not an error because since the current directory is home.

2. _Command with a path to a directory as an argument_
```
{
  [user@sahara ~]$ cat lecture1/
  cat: lecture1/: Is a directory
  [user@sahara ~]$ 
}
```
The current working directory after the command is run is home
The command will only print out the contents of a file, but not a directory.
This is an error because cat can only be called on a file and not a directory.

3. _Command with a path to a file as an argument_
```
{
  [user@sahara ~]$ cat lecture1/messages/sr.txt 
  Здраво Свете!
  [user@sahara ~]$
}
```
The current working directory after the comand is run is home
The command and the valid argument provided, a file, will print out the contents of the file.
This is not an error.
