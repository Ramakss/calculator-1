
Linux command :
=============
  - whoami 
    : get current user
  - ls -lrt 
    : List current directory files/dirs in time-based sorted reversely
  - cd
    : change direct
  - cd ..
    : move back the directory		
  - pwd
    : present working directory	



Jenkin Service Status:
=====================
1- sudo systemctl status jenkins
    1.1- If it is not running
        1.1.1 sudo systemctl start jenkins
        
Jenkins Installation via WAR file: 
==================================
- Complete Installation Guide: https- //www.jenkins.io/doc/book/installing/
- Download Jenkins war file: http://mirror.serverion.com/jenkins/war-stable/2.235.3/jenkins.war
- Go to Terminal:
    - cd Download
    - java -jar jenkins.war --httpPort=8091
    - http://localhost:8091
    
    
Maven Home path set in Jenkins:
==============================
1- Go to Manage Jenkins
2- Got to Gobal configuration
3- Go Maven Installation
    3.1- Uncheck auto installation
    3.2- Set a name like "maven"
    3.3 Set MAVEN_HOME=/usr/share/maven/
    
Java Home path set in Jenkins:
==============================
- Download java:
  - Got to that page pick "Linux x64 Compressed Archive	"
    -https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html
  - Click on "I reviewed and accept the Oracle Technology Network License Agreement for Oracle Java SE"
  - 
1- Go to Manage Jenkins
2- Got to Gobal configuration
3- Go Maven Installation
    3.1- Uncheck auto installation
    3.2- Set a name like "maven"
    3.3 Set MAVEN_HOME=/usr/share/maven/    
    
Setup to setup Eclipse in Ubuntu Lab:
====================================
    
In terminal [ruuning the eclipse]
    ls -lrt
         > eclipse-inst-linux64.tar.gz [last file in rsult of above command]
    tar -xvf eclipse-inst-linux64.tar.gz [extract the tar file]
    cd eclipse-installer
    ./eclipse-inst  [Choose Eclispe IDE Java Developers. it will open a GUI based installation window, just fallow the default conf. It will also launch the eclipse. Close Welcome window.]
    Check already install instance location: /home/ubuntu/eclipse/java-2020-06/ [File Manager ] [if this location does not exist, then we have to install]
           > double click on `eclipse` file 
           > ./eclipse [to run via command line]
    Choose workspace directory [go for default one]
    Creating a Maven project in eclipse
      Top left corner
            > File
                  > New
                        > other
                              > Maven
                                    > Maven Project
                                          > [click on Next]
                                                > Choose default working location
                                                      > New Maven Project
                                                            > Select ArcheType
                                                                  > Catalog: internal
                                                                  > GroupId: org.apache.mavne.archtypes
                                                                  > artifactId: maven-archtype-quickstart
                                                                  > version: 1.1
                                                                        > [Next]
                                                                              > Project details
                                                                                    > Group Id: com.simplilearn.cicd
                                                                                    > Artifact Id: jfrog-demo
                                                                                          > [Finish]
      
 Setup to install JFrog Artifactory
===================================
1- Search for: JFrog Artifactory Install 
[https://jfrog.com/artifactoray/free-trial/?utm_source=google&utm_medium=cpc&utm_campaign={campaign}&gclid=EAIaIQobChMI9t3n7Kv56gIVQSUrCh3qcQhdEAAYASABEgJC5PD_BwE]

2- Download link: https://api.bintray.com/content/jfrog/artifactory-pro/org/artifactory/pro/jfrog-artifactory-pro/$latest/jfrog-artifactory-pro-$latest-linux.tar.gz?bt_package=jfrog-artifactory-pro
3- cd Downloads
[All cmd run in terminal]
4- tar -xvf jfrog-artifactory-pro-7.6.3-linux.tar.gz 
5- cd artifactory-pro-7.6.3
6- cd app/bin
7- sudo ./installService.sh 
      output> 
            ************ SUCCESS ****************
            Installation of Artifactory completed

            Start Artifactory with:
            > systemctl start artifactory.service

            Check Artifactory status with:
            > systemctl status artifactory.service
8- Run Jfrog service:
      systemctl start artifactory.service      
    
