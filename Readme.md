[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-09-average-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-09-average-username)

# Lab 09 - Average

## Lab Goal
In this lab you will be reading from a file and outputting an average grade.

## Instructions
 * Complete the `main` method so it reads each line from the file and calls `getAverage` with the line.
 * Complete the `getAverage` method so it finds the largest number on the line of numbers it is sent.
   - Something to try: you can have a Scanner read from a String as easily as it can a file or keyboard input.
   - For example:
   ```
   Scanner strReader = new Scanner( someStringVariable );
   int num = strReader.nextInt();
   ```

 * The first line of the data file **DOES NOT** contain the number of lines of data following. The first line of the file is the first line of data.
 * Each line contains at least one integer and only integers.
 * Output the average of the grades on the line **after dropping the lowest grade**.
 * Make sure you add a javadoc comment on each method.  You'll need to include a `@param` tag for each method that accepts a parameter.  Include a `@return` tag on any method that returns a value.

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.
* Edit the first line of the Readme.md file and put your username in both locations that say "username".  This is necessary if you want the badge at the top of the instructions to show red or green based on your most recent commit.

## Grading
* 90 - `getAverage` works
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
