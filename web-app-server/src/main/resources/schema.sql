CREATE TABLE `tb_user` (
	`idx` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`id` VARCHAR(50) NOT NULL,
	`pw` VARCHAR(50) NOT NULL,
	`join_type` SMALLINT(6) NOT NULL DEFAULT '0',
	`name` VARCHAR(50) NOT NULL,
	`email` VARCHAR(50) NOT NULL,
	`reg_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`idx`),
	UNIQUE INDEX `id` (`id`),
	INDEX `email` (`email`),
	INDEX `name` (`name`),
	INDEX `reg_date` (`reg_date`)
);


CREATE TABLE `tb_scope` (
	`scope` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`scope`)
);

CREATE TABLE `tb_role` (
	`role` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`role`)
);

