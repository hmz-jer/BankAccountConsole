# Bank Account Kata

Ceci est un projet d'exemple pour implémenter une solution de compte bancaire simple en utilisant Java.
Objectifs

## Les objectifs de ce projet sont :

    Implémenter les fonctionnalités de base d'un compte bancaire : dépôt, retrait et historique des opérations.
    Suivre les principes du développement piloté par les tests (TDD) pour garantir la qualité du code.

##  Fonctionnalités

Le compte bancaire implémenté dans ce projet permet de :

    Effectuer des dépôts sur le compte.
    Effectuer des retraits depuis le compte.
    Consulter l'historique des opérations du compte.

## Utilisation

Pour utiliser le compte bancaire, il suffit de créer une instance de la classe BankAccount et d'appeler les méthodes correspondantes pour effectuer des opérations.

    BankAccount account = new BankAccount();
    account.deposit(1000);
    account.withdraw(500);
    List<Transaction> transactions = account.getTransactions();
    account.printStatement();

La méthode printStatement affichera l'historique des opérations sur la sortie standard.

##  Tests unitaires

Ce projet inclut également des tests unitaires pour la classe BankAccount. Ces tests sont implémentés en utilisant le framework JUnit.

Les tests peuvent être exécutés en exécutant la commande suivante à partir du répertoire racine du projet :

    ./gradlew test
