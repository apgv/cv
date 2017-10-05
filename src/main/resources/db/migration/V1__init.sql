CREATE TABLE employer (
  id      SERIAL CONSTRAINT employer_pk PRIMARY KEY,
  name    VARCHAR(40) NOT NULL,
  started DATE        NOT NULL,
  ended   DATE        NOT NULL
);

INSERT INTO employer (name, started, ended) VALUES ('Vedal-IT', '2003-01-01', '2005-12-31');