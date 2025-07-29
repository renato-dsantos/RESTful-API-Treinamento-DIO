# RESTful-API-Treinamento-DIO
Treinamento RESTFUL API da DIO


## Diagrama de classes

````memaid

classDiagram
    class User {
        +String name
        +Account account
        +Card card
        +List~Feature~ features
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String cardNumber
        +float cardLimit
    }

    class News {
        +String icon
        +String description
    }

    User --> Account
    User --> Card
    User --> "0..*" Feature
    User --> "0..*" News
```
