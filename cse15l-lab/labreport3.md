# __Lab Report 3__

***
## Part 1 - Bugs

The buggy program I chose was the ``reversed(int[] arr)`` method.

- For reference, here is the original code for this buggy program:
```
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```



- Here is a JUnit test with an input which __would__ induce a failure:
```
@Test 
	public void testReversedIntArray() {
    int[] input1 = { 1,2,3,4,5 };
    int[] result = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{ 5,4,3,2,1 }, ArrayExamples.reversed(input1));
	}
```
The input in this case was an ``int`` array of non-decreasing order with 5 elements. The method didn't return an ``int`` array with its elements reversed in position.


- Here is a JUnit test with an input which __would NOT__ induce a failure:
```
@Test
  public void testReversedEmptyArray() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
```
The input in this case was an ``int`` array containing no elements. The method correctly returned an ``int`` array which in this case was empty.


- Here is the symptom, or the output of running the two tests:
![Image](images/symptomintArray.png)
![Image](images/symptomEmpty.png)


- In this section, the before-and-after code change required to fix the buggy program will be provided:

__Original code__
```
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```

__Changed code__
```
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
```


The proposed fixes addresses the issues with the program because it follows the intention of the program which is to "returns a *new* array with all the elements of the input array in reversed." The original code returns the ``int[] arr`` passed as an argument instead of the ``int[] newArray`` instantiated in the method; the changed code correctly returns a new array. Additionally, the code inside the for-loop fails to assign the correct elements to the correct array, assigning at each index of ``arr`` the element found in ``newArray`` in its reversed index order, which is 0 since it is newly instantiated ``int[]`` array with no assignment whatsoever at any of its indices.

***
## Part 2 - Researching Commands

The command I chose was ``less``. 

**1. Command-line Option ``find (path) -type t`` (Source: entering ``man find`` command in the Terminal)**

Examples
```
jonathanty@Jonathans-MacBook-Air-4 technical % find government -type d
government
government/About_LSC
government/Env_Prot_Agen
government/Alcohol_Problems
government/Gen_Account_Office
government/Post_Rate_Comm
government/Media
```

```
jonathanty@Jonathans-MacBook-Air-4 lab4 % find docsearch -type d
docsearch
docsearch/lib
docsearch/.git
docsearch/.git/objects
docsearch/.git/objects/pack
docsearch/.git/objects/info
... // Omitted to minimize lengthiness
docsearch/technical/government/Post_Rate_Comm
docsearch/technical/government/Media
docsearch/technical/plos
docsearch/technical/biomed
docsearch/technical/911report
```

Recursively traverses technical/government path and lists all directories within the specified directory and its subdirectories. Useful for executing operations specifically for directories or maybe finding empty directories. Its not exclusively directories either, there's many file types that the find searches for.

**2. Command-line Option ``find (path) -size s``(Source: entering ``man find`` command in the Terminal)**

```
jonathanty@Jonathans-MacBook-Air-4 docsearch % find technical -type f -size +250k
technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
technical/government/Gen_Account_Office/d01591sp.txt
technical/911report/chapter-13.4.txt
technical/911report/chapter-13.5.txt
technical/911report/chapter-3.txt
```

```
jonathanty@Jonathans-MacBook-Air-4 docsearch % find technical -type f -size -1k
technical/plos/pmed.0020191.txt
technical/plos/pmed.0020226.txt
```

Recursively traverses technical/government path and lists all files that is a unit of memory that can scaled indicated and specified within the specified directory and its subdirectories. Useful for finding files of specific sizes, either really large files or small files.

**3. Command-line Option ``find (path) -depth n`` (Source: entering ``man find`` command in the Terminal)**

```
jonathanty@Jonathans-MacBook-Air-4 docsearch % find technical -depth 1
technical/government
technical/plos
technical/biomed
technical/911report
```

```
jonathanty@Jonathans-MacBook-Air-4 docsearch % find technical/government -depth 1 
technical/government/About_LSC
technical/government/Env_Prot_Agen
technical/government/Alcohol_Problems
technical/government/Gen_Account_Office
technical/government/Post_Rate_Comm
technical/government/Media
```

Recursively traverses technical/government path and lists all files/directories a specified order from the current directory. Useful for finding what files/folders are of a specified depth from the current directory.

**4. Command-line Option ``find (path) -regex r`` (Source: entering ``man find`` command in the Terminal)**

```
jonathanty@Jonathans-MacBook-Air-4 docsearch % find technical -regex ".*/government/Alcohol_Problems/.*"
technical/government/Alcohol_Problems/Session2-PDF.txt
technical/government/Alcohol_Problems/Session3-PDF.txt
technical/government/Alcohol_Problems/DraftRecom-PDF.txt
technical/government/Alcohol_Problems/Session4-PDF.txt
```

```
jonathanty@Jonathans-MacBook-Air-4 docsearch % find technical -regex ".*/government/Env_Prot_Agen/.*"   
technical/government/Env_Prot_Agen/multi102902.txt
technical/government/Env_Prot_Agen/section-by-section_summary.txt
technical/government/Env_Prot_Agen/jeffordslieberm.txt
technical/government/Env_Prot_Agen/final.txt
technical/government/Env_Prot_Agen/ctf7-10.txt
technical/government/Env_Prot_Agen/ctf1-6.txt
technical/government/Env_Prot_Agen/ro_clear_skies_book.txt
technical/government/Env_Prot_Agen/ctm4-10.txt
technical/government/Env_Prot_Agen/1-3_meth_901.txt
technical/government/Env_Prot_Agen/atx1-6.txt
technical/government/Env_Prot_Agen/tech_sectiong.txt
technical/government/Env_Prot_Agen/bill.txt
technical/government/Env_Prot_Agen/nov1.txt
technical/government/Env_Prot_Agen/tech_adden.txt
```

Recursively traverses technical/government path and lists all files/directories whose absolute path of the file matches a pattern using regular expression. Useful for finding what files/folders are of a specific path.
