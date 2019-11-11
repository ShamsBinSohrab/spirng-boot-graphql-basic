# spirng-boot-graphql-basic

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

type Query {
    person(id: ID): Person
    personByName(name: String): Person
    personByEmail(email: String): Person
    persons: [Person]
    personsByCountry(country: Country): [Person]
}

type Mutation {
    addPerson(name: String!, email: String, country: Country): Person
}
