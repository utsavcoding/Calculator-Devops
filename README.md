# Calculator-Devops

This project has been used in order to configure the entire DevOps configuration of various DevOps tools to do a POC for automation of the SDLC cycle.

# Tools Used:

1. Maven
2. JUnit
3. Git
4. Jenkins
5. Docker
6. Rundeck
7. ELK

# Docker Hub Repository :

[https://hub.docker.com/repository/docker/utsavcoding/calculator-docker](https://hub.docker.com/repository/docker/utsavcoding/calculator-docker)

# WorkFlow For Entire Configuration:

1. Jenkins will pull the code from github account.
2. Jenkins will build the pulled code from github and execute all the test cases.
3. A docker Image will be created and pushed to docker hub.
4. It will trigger a rundeck job which will fetch the image from docker hub and run it as a docker container on the server node or host.
5. For continuous monitoring elasticsearch, filebeat and kibana is installed in the host system.

For more details, check this manual : [https://github.com/utsavcoding/Calculator-Devops/blob/master/DevOps-Config-Manual.pdf](https://github.com/utsavcoding/Calculator-Devops/blob/master/DevOps-Config-Manual.pdf)
