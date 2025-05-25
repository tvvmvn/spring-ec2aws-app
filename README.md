# spring-ec2aws-app

1. build 
```
./mvnw clean package
```
1. running in background 
```
nohup java -jar manymanyUsers-0.0.1-SNAPSHOT.jar &
```
1. print nohup.out (see if server running)
```
cat nohup.out
```
1. print programs running in background 
```
jobs
```
1. fetch program by index to handle 
```
fg %(인덱스)
```

