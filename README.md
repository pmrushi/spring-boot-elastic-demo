# spring-boot-elastic-demo
Spring Boot project to demo Elasticsearch.

### Setup ElasticSearch 8.5.2

* Pull images and create containers
```
cd elasticsearch
docker-compose up -d
```

### Connect to ElasticSearch
```
URL      : http://localhost:9200/
```

### Connect to Kibana 8.5.2
```
URL : http://localhost:5601/
```

#### Run Application
```
./mvnw clean install
./mvnw spring-boot:run

windows
mvnw.bat clean install
mvnw.bat spring-boot:run
```

#### Swagger
```
http://localhost:9001/swagger-ui/index.html
```

