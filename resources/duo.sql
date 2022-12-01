create database duo;
use duo;

create table Game(
	idGame INTEGER NOT NULL AUTO_INCREMENT,
    gameTitle varchar(50) NOT NULL,
    bannerUrl varchar(500) not null,
    primary key (idGame)
);

create table Ad(
	idAd integer not null auto_increment,
    namePerson varchar(50) not null,
    yearsPlayer integer,
    weekDays varchar(15) not null,
    hoursStart varchar(5) not null,
    hoursEnd varchar(5) not null,
    useVoiceChannel boolean not null,
    createAt varchar(10) not null,
    userDiscord varchar(40) not null,
    primary key(idAd)
    
);

create table Player(
	idPlayer integer not null auto_increment,
    playerName varchar(50) not null,
    userEmail varchar(40) not null,
    userImg varchar(100), 
    userTwitch varchar(40),
    userInstagram varchar(40),
    userYoutube varchar(40),
    primary key(idPlayer)
);

create table Possui(
	idGame integer,
    idAd integer,
    foreign key(idGame) references idGame,
    foreign key(idAd) references idAd
);

insert into Game(idGame, gameTitle, bannerUrl)
values ('1', 'gow', 'kleitao');

insert into Player(playerName, userEmail)
values ('Antonio Barroso', 'antonio@email.com');

insert into Ad(namePerson, userDiscord, weekDays, hoursStart, hoursEnd, useVoiceChannel,createAt)
values        ('toninhoZ1k4', 'barrozin', 'sex, sab, dom', '11:09', '03:30', true, '20/04/1889');



select * from Possui;
