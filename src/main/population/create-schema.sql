   drop table if exists `person`;
   create table `person` (
       `id` integer not null,
       `version` `version` integer not null,
        `name`  varchar(255) not null,
        `surname` varchar(255),
        `email` varchar(255),
        `phone` varchar(255),
        `birth_date` datetime(6),
        `address` varchar(255),
        `gender` varchar(255),
        primary key (`id`)
    ) ENGINE=InnoDB;

    drop table if exists `teacher`;
    create table `teacher` (
       `id` integer not null,
       `version` integer not null,
       `timetable` varchar(255),
       `personal_web` varchar(255),
       `consulting_hours` varchar(255),
       primary key (`id`),
       foreign key (`room_bookings_id`) references `room_booking` (`id`)
    ) ENGINE=InnoDB;

    drop table if exists `student`;
    create table `student` (
           `id` integer not null,
           `version` integer not null,
)