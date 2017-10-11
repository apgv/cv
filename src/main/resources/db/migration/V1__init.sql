CREATE TABLE person (
  id   SERIAL CONSTRAINT person_pk PRIMARY KEY,
  name VARCHAR(60) NOT NULL
);

CREATE TABLE experience (
  id          SERIAL CONSTRAINT experience_pk PRIMARY KEY,
  person_id   INTEGER REFERENCES person (id),
  start_date  DATE NOT NULL,
  end_date    DATE,
  description VARCHAR(60)
);

CREATE TABLE expertise (
  id        SERIAL CONSTRAINT expertise_pk PRIMARY KEY,
  person_id INTEGER REFERENCES person (id),
  label     VARCHAR(25)  NOT NULL,
  content   VARCHAR(255) NOT NULL
);

CREATE TABLE employer (
  id         SERIAL CONSTRAINT employer_pk PRIMARY KEY,
  person_id  INTEGER REFERENCES person (id),
  name       VARCHAR(40) NOT NULL,
  start_date DATE        NOT NULL,
  end_date   DATE        NOT NULL
);

CREATE TABLE project (
  id          SERIAL CONSTRAINT project_pk PRIMARY KEY,
  name        VARCHAR(40)  NOT NULL,
  employer_id INTEGER REFERENCES employer (id),
  start_date  DATE         NOT NULL,
  end_date    DATE,
  role        VARCHAR(40)  NOT NULL,
  description VARCHAR(255) NOT NULL,
  tech        VARCHAR(255) NOT NULL
);

CREATE TABLE education (
  id          SERIAL CONSTRAINT education_pk PRIMARY KEY,
  person_id   INTEGER REFERENCES person (id),
  course      BOOLEAN      NOT NULL,
  start_date  DATE         NOT NULL,
  end_date    DATE,
  description VARCHAR(500) NOT NULL
);

INSERT INTO employer (name, start_date, end_date) VALUES ('Vedal-IT', '2003-01-01', '2005-12-31');