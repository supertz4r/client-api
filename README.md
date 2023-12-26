# A simple CRUD API of Clients


## All Clients search:
```GET /clients```

## Paged Clients search:
```GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name```

## Client search by id:
```GET /clients/1```

## Client insertion:
```POST /clients```
```
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```
## Client update:
```PUT /clients/1```
```
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```
## Client deletion:
```DELETE /clients/1```
