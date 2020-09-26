DROP TABLE IF EXISTS phone_numbers;
create table phone_numbers (
                               phone_number_id   int not null auto_increment primary key,
                               phone_number      varchar(20),
                               phone_type        char(1),
                               person_id         int not null
);

DROP TABLE IF EXISTS phone_type;
create table phone_type (
                            phone_type        char(1),
                            description       varchar(20)
);