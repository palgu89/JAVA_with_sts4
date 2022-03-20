mysql - uroot -pmysql

use javatest;

drop table if exists room;

create table if not exists room (
room_num int(10) not null,
user varchar(100) null,
empty_room varchar(100) not null,
check_in_time varchar(100) null,
check_out_time varchar(100) null,
primary key(room_num)
);

