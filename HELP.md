# Getting Started

Standard Spring Boot 3 application that is started with host 'http://localhost:8083/test'

In InternalAuthFilter any user is authenticated with internal UserPrincipal object.
Security set-up is done via ApiSecurityConfig.

### REST Endpoint
`http://localhost:8083/test/json/dog/234c8e97-05c4-4778-a544-32ba91b2ea55`

With or without security works fine

### GraphQL Endpoint

````
{
  getDog(id: "001a04dc-92ad-450d-bfa6-096428167b43") {
    uuid
    name
  }
}
````

## Without Security
````
.authorizeHttpRequests((authorizeRequests) ->
                authorizeRequests.anyRequest().permitAll())
````

Response 200 and response body:

````
{
  "data": {
    "getDog": {
      "uuid": "001a04dc-92ad-450d-bfa6-096428167b43",
      "name": "Test dog 001a04dc-92ad-450d-bfa6-096428167b43"
    }
  }
}
````

## With Security
````
.authorizeHttpRequests((authorizeRequests) ->
                authorizeRequests.anyRequest().authenticated())
````

Response 403 and GraphiQL response:

````
{
  "errors": [
    {
      "message": "Unexpected end of JSON input",
      "stack": "SyntaxError: Unexpected end of JSON input\n    at https://unpkg.com/graphiql/graphiql.min.js:29:464502\n    at Generator.next (<anonymous>)\n    at l (https://unpkg.com/graphiql/graphiql.min.js:29:462623)\n    at u (https://unpkg.com/graphiql/graphiql.min.js:29:462739)"
    }
  ]
}
````


