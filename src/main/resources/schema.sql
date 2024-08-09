CREATE TABLE tasks
(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    summary varchar(255) not null ,
    description text,
    status varchar(255) not null
);