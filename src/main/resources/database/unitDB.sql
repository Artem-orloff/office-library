CREATE TABLE users
(
    id serial PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    second_name VARCHAR(50) NULL,
    birthdate VARCHAR(50) NOT NULL,
    type_user VARCHAR(50) NOT NULL
)

CREATE TABLE book
(
    id serial PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthdate VARCHAR(50) NOT NULL,
    type VARCHAR(50) NOT NULL
)

CREATE TABLE author
(
    id serial PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    second_name VARCHAR(50) NULL,
    birthdate VARCHAR(50) NOT NULL,
    biogrphi VARCHAR(200) NOT NULL
    )

