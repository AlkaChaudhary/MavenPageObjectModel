
![Screenshot 2024-04-29 at 09 34 18](https://github.com/AlkaChaudhary/MavenPageObjectModel/assets/87438786/b131fad8-75d2-48d2-8d0c-dedb50cddcc7)

# Maven Project

## Steps for creating Maven Project in Eclipse
- In Eclipse go to the File option.
- In the drop-down menu select New
- Select the Project option
- From select Wizard select Maven -> Maven Project
- Click on Next
- New Maven Project click on Next
- Select Archtype id as org.apache.maven.archtypes and Version as 1.4
- Enter the Group ID as ATW
- Enter the Artifact ID as mavenproject
- Enter version as 0.0.1-SNAPSHOT
- Enter package as pPack
- Click on Finish
- It will be generating project in confirm with Y then Enter.
- Open the pom.xml file and add necssary denpencies related to project

## How to install MAVEN on Mac OS
Step1 : Check if Maven is already installed
              $ mvn --version

Step2 : Download Maven from internet
             https://maven.apache.org/download.cgi

Step3 : Unzip and place at some location on your system

Step4 : Set System variables in bash profile
        
         M2_HOME=/Users/AlkaChaudhary1/apache-maven-3.9.6
         
         PATH=$PATH:/Users/AlkaChaudhary1/apache-maven-3.9.6/bin
        
Step5 : Check again if Maven is installed (It is only installed for specific terminal session)

————————————————————
### To Make Maven available for future sessions

Step 1 : Create .bash_profile
       
       $ touch .bash_profile

Command to view hidden files

       $ defaults write com.apple.finder AppleShowAllFiles TRUE

Step 2: Click on Finder of user profile then press Option key and select Relaunch option

Step 3 Open .bash_profile from the hidden file and write

        export M2_HOME=/Users/AlkaChaudhary1/apache-maven-3.9.6

        export PATH=$PATH:/Users/AlkaChaudhary1/apache-maven-3.9.6/bin

Step 4 Check if Maven is already installed
       
       $ mvn --version





