# hello-world-intro
<br>
<!--
## Steps to download and work on the assignment
1. Download the .zip files by clicking on "Download ZIP"
![image](https://user-images.githubusercontent.com/54456351/120839210-86ba1e80-c51d-11eb-9dda-f63d612fa81a.png)
2. Click on "New" button on the top of the screen to create new respository
![image](https://user-images.githubusercontent.com/54456351/120839337-a9e4ce00-c51d-11eb-80fd-7ff96468484b.png)
3. Enter the "Repository name" (It can be any name you like) and click on "Create repository"
![image](https://user-images.githubusercontent.com/54456351/120839416-c2ed7f00-c51d-11eb-8ba6-9388a18f1956.png)
4. Click on "upload an exsiting file" to choose the .zip file you just download in Step 1 and click on "Commit changes" to submit
![image](https://user-images.githubusercontent.com/54456351/120839798-3abba980-c51e-11eb-9335-363b462bc32c.png)
- You can also upload the .zip file via "Upload files"
![image](https://user-images.githubusercontent.com/54456351/120840726-730fb780-c51f-11eb-843b-d8894afa67a0.png)
5. Work on the .java file and until you complete
-->
Your first assignment in GitHub Classroom is to fix the error in the Hello World java file!

1. Click on "HelloWorld.java" to see what is provided as your starter code. 
2. Add your code in the "HelloWorld.java" and commit changes
3. Check for bugs and suggestions in "Actions" ![image](https://user-images.githubusercontent.com/54456351/122830040-a0d55a00-d29c-11eb-8e7f-a73c1a56546d.png)
4. Repeat step 3 and 4 until the assignment is completed

![image](https://user-images.githubusercontent.com/54456351/119812273-d3a65100-be9c-11eb-9c53-326b5fc460c3.png)

After committing/uploading your Java files. Click "Actions" to see the report. <br>
When committing, GitHub will ask you to enter a message. It helps to easily understand why a change has been made at a particular time and distinguish between each commission.<br>
![image](https://user-images.githubusercontent.com/54456351/119812799-66df8680-be9d-11eb-8fec-24645619be13.png)
<br>
<br>


## Action
This is the action page: <br>
![image](https://user-images.githubusercontent.com/54456351/119814197-fc2f4a80-be9e-11eb-86ad-00f6c5b5d238.png) <br>
The workflow are your commissions from newest to latest. <br>
Click on the one that you want to see the report. <br><br>
This means the workflow is in progress, and you have to wait until it changes the status.<br>
![image](https://user-images.githubusercontent.com/54456351/119813577-51b72780-be9e-11eb-8449-c84e2850f125.png) <br><br><br>

This means the workflow is failed. You can see your details in the reports inside it.<br>
![image](https://user-images.githubusercontent.com/54456351/119813655-65628e00-be9e-11eb-8c27-8b42a9e71304.png) <br><br><br>

This means the workflow is passed, but you should check the reports to check your code style is good enough and any misspell occurs.<br>
![image](https://user-images.githubusercontent.com/54456351/119813818-95119600-be9e-11eb-82e5-d247541062cb.png) <br><br><br>
When the workflow finish, you can see its details:<br>
![image](https://user-images.githubusercontent.com/54456351/119811221-b7ee7b00-be9b-11eb-933a-05b0733ba569.png) <br>


### Test Report
![image](https://user-images.githubusercontent.com/54456351/119812525-15cf9280-be9d-11eb-8125-f24d61ebd43b.png) <br>
The Test Report shows the result of how many test cases that are passed, failed, or skipped.
- Click "Test Report" for the report of test cases
- Don't worry about "Build Step." It will be red if any test case failed.
<br><br>

The following is an example a Test Report with 3 failed tests.<br>
![image](https://user-images.githubusercontent.com/54456351/120717148-e8c24780-c47b-11eb-8464-2a16b8391343.png) 
<br>
Several reasons are suggested for the test case's failure. After "expected" is the correct answer and after "but was" is your answer.<br>
If you want to check the test case and see what methods it calls, you can see the test case and path in this line. 
![image](https://user-images.githubusercontent.com/54456351/120717574-a3eae080-c47c-11eb-802a-7c779b649c17.png)

<br><br>
Let analyze this failed test.
![image](https://user-images.githubusercontent.com/54456351/120717698-db598d00-c47c-11eb-8286-c52541d59de8.png) <br><br>
This test case calls the main() method and receives different outputs than expected. <br>
It expects "Hello, World!" but receives "Hello, World! " (with an extra space at the end). The extra space is the reason of this failure.

<br><br>


### Checkstyle

![image](https://user-images.githubusercontent.com/54456351/119812559-1ec06400-be9d-11eb-907d-e1b71a97a447.png) <br>
![image](https://user-images.githubusercontent.com/54456351/119814435-3f89b900-be9f-11eb-8578-2272566be21c.png) <br>

Checkstyle is a tool for checking Java source code for adherence to the Google Java Style Guide.<br>
Click "checkstyle" to view the report. The report should look like this:
![image](https://user-images.githubusercontent.com/54456351/120709943-5ec1b100-c472-11eb-93a1-1aafa7de830a.png) <br>
<br /> <br /> <br />
You can access each code line violating the coding standard through "Findings(37)"
![image](https://user-images.githubusercontent.com/54456351/120710983-b01e7000-c473-11eb-873d-e57b75aeab5c.png) <br>

View <a href="https://github.com/PisanA/hello-world-intro/blob/main/Checkstyle_Comments.md
">Checkstyle_Comments.md</a> for some comments you might find in the report:
