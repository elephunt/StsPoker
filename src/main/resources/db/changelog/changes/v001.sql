CREATE TABLE "player" (

  ID        SERIAL PRIMARY KEY NOT NULL,

  FirstName VARCHAR(50)        NOT NULL,

  LastName  VARCHAR(50)
);

CREATE TABLE "summary" (

  ID        SERIAL PRIMARY KEY NOT NULL,

  Amount    VARCHAR(255)       NOT NULL,

  Date      DATE,

  PLAYER_ID BIGINT             NOT NULL  REFERENCES player (id)
);