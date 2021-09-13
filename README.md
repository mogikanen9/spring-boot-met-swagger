# spring-boot-met-swagger

Setting up Swagger 2 with Spring Boot for REST API.

Based on [baeldung's post](http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api).

## Build using Docker

`docker build -t boot-met-swagger .`

## Run using Docker

`docker run -d -p 8080:8080 --name boot-met-swagger -t boot-met-swagger:latest`

## API exmaples

### List bookmarks from default user
`curl --request GET \
  --url http://localhost:8080/v1/vasya/bookmarks`

 ### Add new bookmark to default user 
`curl --request POST \
  --url http://localhost:8080/v1/vasya/bookmarks \
  --header 'Content-Type: application/json' \
  --data '{
	"uri":"https://google.com",
	"description": "Google Home Page"
}'`

## Swagger Resources
- http://localhost:8080/v2/api-docs

