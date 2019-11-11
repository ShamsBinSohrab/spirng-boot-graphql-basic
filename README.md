# spirng-boot-graphql-basic


Queries:
    * person(id: ID): Person
    * personByName(name: String): Person
    * personByEmail(email: String): Person
    * persons: [Person]
    * personsByCountry(country: Country): [Person]

Mutations:
    * addPerson(name: String!, email: String, country: Country): Person


enum Country {
    BANGLADESH,
    INDIA,
    PAKISTAN,
    UNITED_STATES
}

type Person {
    id: ID!
    name: String!
    email: String
    country: Country
}


