CREATE TABLE IF NOT EXISTS `users` (
  `id`                     INT AUTO_INCREMENT,
  `name`                   VARCHAR(255)      NOT NULL,
  `email`                  VARCHAR(255)      NOT NULL,
  `login`                  VARCHAR(55)      NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `messages` (
  `id`                     INT AUTO_INCREMENT,
  `text`                   VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);
