CREATE TABLE Person (
    id  INT GENERATED ALWAYS AS IDENTITY,
    full_name VARCHAR(100) UNIQUE,
    birth_date DATE NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Book (
    id  INT GENERATED ALWAYS AS IDENTITY,
    person_id INT,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    year INT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_person
                  FOREIGN KEY (person_id)
                  REFERENCES Person(id)
);