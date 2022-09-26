# Learning Progress Tracker

The command-line interactive application that keeps track of the registered multiple students, their learning progress, and metrics on Learning Platform. 
It also provides detailed information about each user or any category of users and the overall statistics for the entire learning platform.

The learning platform offers four courses: Java, Data Structures and Algorithms (DSA), Databases, and Spring. Each student can take any (or all) of these courses, complete tasks, pass tests, and submit their homework to receive points. By completing any task of any course, a student earns credit points that will be added to the student's total course score.

#### Available commands:

- **add students** - This command is responsible for registering a new student to a Learning Platform. User should provide the following credentials: first and last name and a valid email address.
  Application accepts only ASCII characters, from "A" to "Z" and from "a" to "z" as well as hyphens - and apostrophes ' . Example of using:
>Learning Progress Tracker\
>~$ add students\
Enter student credentials or 'back' to return:\
> ~$ Jean-Clause van Helsing jc@google.it\
The student has been added.\
> ~$ Mary Luise Johnson maryj@google.com\
The student has been added.\
> ~$ back\
Total 2 students have been added.

- **list** - This command print student IDs. The students will be listed in the order they were added. Example of using:
> ~$ list\
  Students:\
  10000\
  10001

- **add points** - This command is responsible for adding student's new earned points to courses. The program will read learning progress data in the following format: _studentId number1 number2 number3 number4_ where _numberN_ are new points earned by the student in the courses. The numbers correspond to the courses (Java, DSA, Databases, Spring). Number is a non-negative integer number. If there is no student with the specified ID, the program will print 'No student is found for id=%s. where %s is the invalid ID'. 
For example:

> ~$ add points\
> Enter an id and points or 'back' to return:\
> ~$ 1000 10 10 5 8\
No student is found for id=1000.\
> ~$ 10001 10 10 5 8\
Points updated.

- **find** - This command print student's earned points. Command take studentID as a user input of the student and print details in this format: id points: Java=%d; DSA=%d; Databases=%d; Spring=%d where %d is the respective number of points earned by the student. 
> ~$ find\
Enter an id or 'back' to return:\
> ~$ 10000\
10000 points: Java=12; DSA=13; Databases=14; Spring=15

- **statistics** - Program display the details about any course. When users type in the name of a course, the program will display the name of the course in the first line, then the column headers, and a list of student IDs, their total points in the respective course, and the percent of completion (one decimal place precision). If a course has no students, program output only the name of the course and the column headers.

To complete each of these courses, a student must earn a certain number of points that are different for each course: 600 for Java, 400 for DSA, 480 for Databases, and 550 for Spring. Students can enroll in any of the courses and take as many assignments as they want.

Application can calculate following information using command described above:

1. Which courses are the most and least popular ones. The most popular has the biggest number of enrolled students;
2. Which course has the highest and lowest student activity. Higher student activity means a bigger number of completed tasks;
3. The easiest and hardest course. The easiest course has the highest average grade per assignment;
4. Top learners for each course.

Example:

>Type the name of a course to see details or 'back' to quit:\
Most popular: Spring\
Least popular: Databases\
Highest activity: Spring\
Lowest activity: Databases\
Easiest course: DSA\
Hardest course: Java

If no course falls into a certain category, for example if no students have enrolled in any of the courses or data can't be retrieved, program prints "n/a".

When user additionally type the name of a course, information about top learners will be presented as a list containing the following information: a student's ID, the total points for a course, and the course completion progress as a percentage:
Example: 

> ~$ Java\
id  points completed\
125684 423    70.5%\
200751 420    70.0%\
130400 405    67.5%\

The list sorted by the total number of points in descending order, and if two or more students have the same number of points, list additionally sorted by their ID in ascending order.
> **_NOTE:_** use the following notation for course names: "Java", "DSA", "Databases", "Spring".

One more example:
> ~$ statistics\
Type the name of a course to see details or 'back' to quit:\
Most popular: Java, Databases, Spring\
Least popular: DSA\
Highest activity: Java\
Lowest activity: DSA\
Easiest course: Java\
Hardest course: Spring\
> ~$ java\
Java\
id    points    completed\
10001 24        4.0%\
10000 21        3.5%\
> ~$ dsa\
DSA\
id    points    completed\
10000 18        4.5%

- **notify** -  When users enter this command, program will print a list of messages to students in the format below to get to know which students have completed which courses and send the acknowledgments of their success, as well as "personal certificates" to them.

>To: %EMAIL_ADDRESS%\
Re: Your Learning Progress\
Hello, %FULL_USER_NAME%! You have accomplished our %COURSE_NAME% course!

Below the list, program will print the total number of students that should be notified

