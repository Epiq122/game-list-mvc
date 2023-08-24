CREATE DATABASE  IF NOT EXISTS `game_directory`;
USE `game_directory`;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;

CREATE TABLE `game` (
  `id` int NOT NULL AUTO_INCREMENT,
  `game_title` varchar(45) DEFAULT NULL,
  `game_developer` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `game` VALUES 
	(1,'Super Mario World','Nintendo','nintendo@email.com'),
	(2,'Sonic The Hedgehog','Sega','segaamerica@sega.com'),
	(3,'Resident Evil','Capcom','capcomgames@email.com'),
	(4,'World Of Warcraft','Blizzard','battlenet@blizzzard.com'),
	(5,'Final Fantasy 7','Squaresoft','squaresoft@enixcom'),
	(6, 'The Legend of Zelda: Breath of the Wild', 'Nintendo', 'zelda@email.com'),
  (7, 'Minecraft', 'Mojang', 'info@mojang.com'),
  (8, 'Grand Theft Auto V', 'Rockstar Games', 'gtav@rockstargames.com'),
  (9, 'Overwatch', 'Blizzard Entertainment', 'support@playoverwatch.com');
