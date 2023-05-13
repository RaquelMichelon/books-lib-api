<h1 align="center"> Deploy - Railway </h1>


## 🚧 Setup

1 - create railway account with github account
2 - get the sql script to create db seeding - file create.sql
3 - pgAdmin installed


## 🚧 Railway steps

1 - provide db server: `New project` -> `Provision PostgreSQL` -> click on the created -> go to `connect` and use the data to connect to the created db via pgadmin.

- Register new server on pgadmin
- name: Postgres-railway-booklist
- copy from railway: `host`, `port`, `db`, `user`, `password`
- run db script

2 - associate railway to github: `New project` -> `Deploy from github repo` -> `configure github app`
3 - associate railway to github: `New project` -> `Deploy from github repo` -> select the github project 
4 - Add variables: 
    - APP_PROFILE `prod`
    - DB_URL as `jdbc:postgresql://host:port/dbname`
    - DB_USERNAME 
    - DB_PASSWORKD
    - CORS_ORIGINS

4 - configure public domain for the app: `Settings` -> `Domains` -> `generate domain` (then copy and paste on browser to test)

5 - Test CI/CD pipeline


