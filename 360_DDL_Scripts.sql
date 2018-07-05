

-- 1. Create tables

-- Person table

CREATE table person (
	id int(20) NOT NULL auto_increment primary key,
     name varchar(50),
     email varchar(100)
)ENGINE=InnoDB;

-- phone table

CREATE table phone (
	id int(20) NOT NULL auto_increment primary key,
    category varchar(20),
     num varchar(20),
     person_id int,    
    foreign key(person_id)
		references person(id)
        ON delete cascade	
)ENGINE=InnoDB ;





-- todo table

create table todo(id int(20) NOT NULL auto_increment primary key,
	person_id int,
    title varchar(400),
    task_status boolean,
    created_on datetime,    
    completed_on datetime,    
    foreign key(person_id)
		references person(id)
        ON delete cascade	
)ENGINE=InnoDB;

select * from movies;

-- Movies table
CREATE table movies (
	id int(20) NOT NULL auto_increment primary key,
    title varchar(300),
	released_year int,
    director varchar(200),
    rating  int
)ENGINE=InnoDB;

ALTER TABLE movies ADD COLUMN title varchar(300) AFTER id;



-- person + movie link table
CREATE table person_fav_movies (
	id int(20) NOT NULL auto_increment primary key,
	person_id int,
    movie_id int,
    seen  boolean,
	foreign key(person_id)
		references person(id)
        ON delete cascade,
	foreign key(movie_id)
	references movies(id)
)ENGINE=InnoDB;

 -- stored procedure for todo count

CREATE DEFINER=`root`@`localhost` PROCEDURE `CountTodos`( IN p_person_id int,
 OUT total INT)
BEGIN
select count(*) 
INTO total
from todo
	WHERE person_id = p_person_id; 
END


--  one for favorite movie count
CREATE DEFINER=`root`@`localhost` PROCEDURE `CountFavMovies`(
 IN p_person_id int,
 OUT total INT)
BEGIN
	select count(movie_id) 
	INTO total
	from person_fav_movies
	WHERE person_id = p_person_id; 
END