/* Tabla regiones */
INSERT INTO regiones (id, nombre) VALUES (1, 'Sudámerica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroámerica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteámerica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

/* Tabla Clientes */
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Rubén","Fernández de Castro Cambrón", "ruben@spring.com", "2020-02-13", 4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Trang","Diez", "trang@spring.com", "2020-02-13", 5);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Alonso","Gutierrez", "alonso@spring.com", "2020-02-13", 2);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Laura","Pio", "laura@spring.com", "2020-02-13", 4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Mariangeles","Perez", "mariangeles@spring.com", "2020-02-13", 4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Manolo","Perez", "manolo@spring.com", "2020-02-13", 4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Juan","Villazan", "juan@spring.com", "2020-02-13", 1);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Jose","Portugal", "jose@spring.com", "2020-02-13", 1);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Mari","Galicia", "mari@spring.com", "2020-02-13", 7);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Laura","Cuba", "laurac@spring.com", "2020-02-13", 2);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Carlos","Lopez", "carlos@spring.com", "2020-02-13", 4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES ("Sergio","gonzalez", "sergio@spring.com", "2020-02-13", 8);

/* Tablas Usuarios y Roles */
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('ruben', '$2a$10$mQ8.mN/mY/eoupnHN5AUWOVM5pq98kzGCfqFIWHXpt/qO6KM3lpfi', 1, 'Rubén', 'Fernández de Castro', 'ruben@spring.com');
INSERT INTO usuarios (username, password, enabled) VALUES ('admin', '$2a$10$AaY8t04W0HewyGDkYszdVe1RrmpMM9z7TpULsbcUS3aHwQ7iJ1wbG', 1, 'Fernando', 'Fernández', 'fernando@spring.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuarios_id, roles_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuarios_id, roles_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuarios_id, roles_id) VALUES (2, 1);