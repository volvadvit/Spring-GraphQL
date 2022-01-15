# Spring-GraphQL
- Simple SpringBoot app with GraphQL.
- Worked with PostgreSLQ.
- After running the app, go to http://localhost:8080/graphiql to send GraphQL request.
### Query examples:
1) Create entity:
```
mutation {
  createPost (author:"John", title:"Test", type:"Smth") {
    id, author, title
  }
}
```
2) Find by id:
```
query {
  post(id:2) {
    id, author, title
  }
}
```
3) Get all entities:
```
query {
  posts {
    id, author, title
  }
}
```
