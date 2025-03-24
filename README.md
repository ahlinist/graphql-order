# graphql-order

http://localhost:8081/graphql

```
query {
    getOrders {
        id
        name
        items {
            id
        }
        wareHouse {
            id
        }
    }
}
```
