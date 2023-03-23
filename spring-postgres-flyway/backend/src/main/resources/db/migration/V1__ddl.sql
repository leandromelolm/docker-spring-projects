create table tb_person (
    user_id bigint generated by default as identity,
    primary key (user_id),
    username varchar(255),
    email varchar(255),
    password varchar(255),
    created_on timestamp(6) with time zone,
    last_login timestamp(6),
    birthdate date
);
create table tb_role (id bigint generated by default as identity, authority varchar(255), primary key (id));
create table tb_user_role (user_id bigint not null, role_id bigint not null, primary key (user_id, role_id));
alter table if exists tb_person add constraint UK_buewnrmpf5kdov6h4av7rhv9w unique (email);
alter table if exists tb_user_role add constraint FKea2ootw6b6bb0xt3ptl28bymv foreign key (role_id) references tb_role;
alter table if exists tb_user_role add constraint FK1x4a45in91ansr33w4jn8t39d foreign key (user_id) references tb_person;