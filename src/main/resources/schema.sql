DROP TABLE IF EXISTS HEROES;
DROP TABLE IF EXISTS T_HEROES;
CREATE TABLE HEROES (
                          ID INT AUTO_INCREMENT  PRIMARY KEY,
                          NOMBRE VARCHAR(20) NOT NULL,
                          DESCRIPCION VARCHAR(450) NOT NULL,
                          ORIGEN VARCHAR(20) NOT NULL,
                          PODERES VARCHAR(150) NOT NULL,
                          OCUPACION VARCHAR(70) NOT NULL
);