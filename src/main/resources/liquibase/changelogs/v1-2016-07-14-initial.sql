--liquibase formatted SQL

--changeset K.Bylino:v1
CREATE TABLE account
(
  id         VARCHAR(36) PRIMARY KEY,
  id_contact VARCHAR(36) NOT NULL,
  name       VARCHAR(45),
  surname    VARCHAR(45),
  email      VARCHAR(45) NOT NULL,
  password   VARCHAR(45) NOT NULL,
  birthday   TIMESTAMP,
  avatar_url VARCHAR(350)
);
CREATE UNIQUE INDEX account_email_uindex ON account (email);

CREATE TABLE contact
(
  id           VARCHAR(36) PRIMARY KEY,
  phone_number VARCHAR(45),
  skype        VARCHAR(45),
  vk           VARCHAR(45),
  facebook     VARCHAR(45),
  viber        VARCHAR(45)
);

CREATE TABLE event
(
  id VARCHAR(36) PRIMARY KEY,
  id_owner VARCHAR(36) NOT NULL,
  name VARCHAR(45) NOT NULL,
  description VARCHAR(500),
  event_time TIMESTAMP NOT NULL,
  meetup_place VARCHAR(45) NOT NULL,
  min_people INT,
  max_people INT
);

ALTER TABLE account
  ADD CONSTRAINT account_contact_id_fk
FOREIGN KEY (id_contact) REFERENCES contact (id);

ALTER TABLE event
  ADD CONSTRAINT event_account_id_fk
FOREIGN KEY (id_owner) REFERENCES account (id);