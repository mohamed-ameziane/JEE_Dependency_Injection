# TP1 JEE | Injection des Dépendances en Java

## Description du TP

Ce travail pratique vise à explorer le concept d'injection de dépendances en Java, en mettant en œuvre différentes approches pour assurer un couplage faible entre les composants. Nous avons développé un système simple de récupération et de traitement de données en utilisant des interfaces et diverses techniques d'injection.

## Concepts étudiés

- Couplage faible : Réduction de la dépendance entre les classes pour une meilleure flexibilité et maintenabilité.

- Interfaces et implémentations : Utilisation de IDao et IMetier pour séparer les responsabilités.

- Injection de dépendances : Trois méthodes étudiées :

  - Par instanciation statique 
  - Par instanciation dynamique avec réflexion 
  - En utilisant le framework Spring (XML et annotations)

- Spring Framework : Découverte de l'inversion de contrôle et de l'injection automatique de dépendances.

## Conception

Le projet est structuré en plusieurs classes suivant une architecture modulaire :

- IDao : Interface définissant la récupération des données. 
- DaoImpl : Implémentation concrète de IDao. 
- IMetier : Interface définissant une opération métier sur les données récupérées. 
- MetierImpl : Implémentation de IMetier utilisant IDao. 
- Main : Classe principale exécutant le programme avec différentes stratégies d'injection.
- Configuration Spring : Utilisation de spring-config.xml et d'annotations pour l'injection automatique.

