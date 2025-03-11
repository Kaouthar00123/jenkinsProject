# Projet Spring Boot avec CI/CD

Ce projet est une application Java simple, développée à l'aide du framework Spring Boot. L'objectif principal de ce projet est de tester et de mettre en œuvre les concepts de CI/CD (Intégration Continue et Déploiement Continu).

## Fonctionnalités

- **Intégration Continue (CI)** : Le projet est configuré pour être intégré et testé sur Jenkins. Le fichier `Jenkinsfile` contient un script qui automatise le processus CI/CD pour cette application.
- **Déploiement Continu (CD)** : Le processus CI/CD comprend les étapes de base suivantes :
  - **Build** : Compilation du code source.
  - **Test** : Exécution des tests automatisés pour vérifier la qualité du code.
  - **Déploiement** : Déploiement de l'application sur un environnement cible.

## Prérequis

- Java JDK 8 ou supérieur
- Maven
- Jenkins
- Un environnement de déploiement (par exemple, un serveur Tomcat, Docker, etc.)

## Configuration

1. **Jenkins** : Assurez-vous que Jenkins est installé et configuré sur votre machine ou serveur.
2. **Jenkinsfile** : Le fichier `Jenkinsfile` doit être placé à la racine du projet. Il contient les étapes de build, test et déploiement.
3. **Dépendances** : Les dépendances du projet sont gérées par Maven. Assurez-vous que le fichier `pom.xml` est correctement configuré.

## Utilisation

- Clonez ce dépôt sur votre machine locale :
   ```bash
   git clone https://github.com/votre-utilisateur/votre-projet.git
