# Spring Boot MVC

---

### Docker - MySQL

```
docker run -p 3306:3306 --name mysql_boot -e MYSQL_ROOT_PASSWORD=1 -e MYSQL_DATABASE=springboot -e MYSQL_USER=taylor -e MYSQL_PASSWORD=pass -d mysql

docker exec -i -t mysql_boot bash
mysql -u taylor -p
use springboot
```

### Docker - PostgreSQL
```
docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=taylor -e POSTGRES_DB=springboot --name postgres_boot -d postgres

docker exec -i -t postgres_boot bash
su - postgres
psql --username taylor --dbname springboot
```

---

### Redis
```
docker run -p 6379:6379 --name redis_boot -d redis

docker exec -i -t redis_boot redis-cli
keys *
```

---

### MongoDB
```
docker run -p 27017:27017 --name mongo_boot -d mongo

docker exec -i -t mongo_boot bash
mongosh
```