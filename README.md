# Spring Boot MVC

---

Docker
``
docker run -p 3306:3306 --name mysql_boot -e MYSQL_ROOT_PASSWORD=1 -e MYSQL_DATABASE=springboot -e MYSQL_USER=taylor -e MYSQL_PASSWORD=pass -d mysql
```

컨테이너 안 bash 실행
```
docker exec -i -t mysql_boot bash
mysql -u taylor -p
```