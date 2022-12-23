-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : dim. 13 nov. 2022 à 20:12
-- Version du serveur : 10.4.25-MariaDB
-- Version de PHP : 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `dashboard`
--

-- --------------------------------------------------------

--
-- Structure de la table `params_api`
--

CREATE TABLE `params_api` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `id_widget` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `params_api`
--

INSERT INTO `params_api` (`id`, `name`, `type`, `id_widget`) VALUES
(1, 'city', 'string', 1),
(2, 'link', 'string', 2),
(3, 'number', 'integer', 2);

-- --------------------------------------------------------

--
-- Structure de la table `services_api`
--

CREATE TABLE `services_api` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `services_api`
--

INSERT INTO `services_api` (`id`, `name`) VALUES
(2, 'rss'),
(1, 'weather');

-- --------------------------------------------------------

--
-- Structure de la table `users_api`
--

CREATE TABLE `users_api` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `users_api`
--

INSERT INTO `users_api` (`id`, `email`, `first_name`, `last_name`, `password`, `role`, `username`) VALUES
(1, 'onePiece@gmail.com', 'One', 'Piece', '$2a$10$/DhxZwqIIK80nvOIe8xK6eLscACm/XNcUTmLx/MPEgazS7RmSEfL.', 'USER', 'poa'),
(2, 'elalami.ayoub.99@gmail.com', 'Ayoub', 'Elalami', '$2a$10$kLhIAVi8aDYKXGoYfvhN9uGDo0qcXPMDtWk.vAQ7pG4xlx/geYAui', 'USER', 'epo');

-- --------------------------------------------------------

--
-- Structure de la table `user_widget_api`
--

CREATE TABLE `user_widget_api` (
  `id` bigint(20) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  `id_param` bigint(20) DEFAULT NULL,
  `id_user` bigint(20) DEFAULT NULL,
  `id_widget` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user_widget_api`
--

INSERT INTO `user_widget_api` (`id`, `value`, `id_param`, `id_user`, `id_widget`) VALUES
(1, 'meknes', 1, 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `widgets_api`
--

CREATE TABLE `widgets_api` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `id_service` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `widgets_api`
--

INSERT INTO `widgets_api` (`id`, `description`, `name`, `id_service`) VALUES
(1, 'Display temperature for a city', 'city_temperature', 1),
(2, 'Displaying the list of the last articles', 'article_list', 2);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `params_api`
--
ALTER TABLE `params_api`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_qqst14c974alm5lde7l3pb8k6` (`name`),
  ADD KEY `FKitpsg9pjlxkqwidbbmw9vxlt4` (`id_widget`);

--
-- Index pour la table `services_api`
--
ALTER TABLE `services_api`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_pb76id6qoq5m2ls3uo9x8pesf` (`name`);

--
-- Index pour la table `users_api`
--
ALTER TABLE `users_api`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_jyyyjne4c8ho2l6jolmfl66d9` (`email`),
  ADD UNIQUE KEY `UK_nwaswdfdqhu68efbfh6fco3pk` (`username`);

--
-- Index pour la table `user_widget_api`
--
ALTER TABLE `user_widget_api`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmdbip8h59xkdtv4xe1jxpt6ly` (`id_param`),
  ADD KEY `FKq7p8feq8o54wulxked22eopwb` (`id_user`),
  ADD KEY `FKbuba9x6v7semncbj77r2a8xuj` (`id_widget`);

--
-- Index pour la table `widgets_api`
--
ALTER TABLE `widgets_api`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_6cv8u4qkosdb07huv6pwm8tbi` (`name`),
  ADD KEY `FKqh4m8421e7ame2uoji6kc1q2u` (`id_service`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `params_api`
--
ALTER TABLE `params_api`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `services_api`
--
ALTER TABLE `services_api`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `users_api`
--
ALTER TABLE `users_api`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `user_widget_api`
--
ALTER TABLE `user_widget_api`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `widgets_api`
--
ALTER TABLE `widgets_api`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `params_api`
--
ALTER TABLE `params_api`
  ADD CONSTRAINT `FKitpsg9pjlxkqwidbbmw9vxlt4` FOREIGN KEY (`id_widget`) REFERENCES `widgets_api` (`id`);

--
-- Contraintes pour la table `user_widget_api`
--
ALTER TABLE `user_widget_api`
  ADD CONSTRAINT `FKbuba9x6v7semncbj77r2a8xuj` FOREIGN KEY (`id_widget`) REFERENCES `widgets_api` (`id`),
  ADD CONSTRAINT `FKmdbip8h59xkdtv4xe1jxpt6ly` FOREIGN KEY (`id_param`) REFERENCES `params_api` (`id`),
  ADD CONSTRAINT `FKq7p8feq8o54wulxked22eopwb` FOREIGN KEY (`id_user`) REFERENCES `users_api` (`id`);

--
-- Contraintes pour la table `widgets_api`
--
ALTER TABLE `widgets_api`
  ADD CONSTRAINT `FKqh4m8421e7ame2uoji6kc1q2u` FOREIGN KEY (`id_service`) REFERENCES `services_api` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
