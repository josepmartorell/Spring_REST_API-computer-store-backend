CREATE TABLE fabricante
(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) DEFAULT NULL,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP
);