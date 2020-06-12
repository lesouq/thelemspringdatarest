# thelemspringdatarest
test_spring_data_rest_thelem_assurance

# Sommaire
    - Initialisation du projet
    - Déclarer le model de données
    - Définir le repository
    - Définir des données
    - Lancement du projet
    - Test Api Rest
  
# Initialisation du project

Lors du Srping Initializr il faut prendre pour cet exemple les dépendances suivantes:

    - Rest repositories
    - Thymeleaf
    - JPA
    - H2
    - Lombok

# Déclarer le model de données

La chose la plus importante dans une appli Srping Data Rest est le model de données. Dans ce cas nous prenons pour exemple des étudiants.
On utilise @Entity (annotation JPA) pour indiquer que la classe est une entitée.
le @Id @GeneratedValue (annotation JPA) définnissent la clé primaire ainsi que ça génération auto.
Et @Data = annotation Lombok pour générer automatiquement les getters et setters.

# Définir le repository

Donc le repository est également important dans une application Spring Data Rest.
Le repository hérite du CrudRepository de Spring Data Commons et se connecte au modèle de données Student
grâce à sa clé primaire.

# Définir des données

Le @Component permet qu'elle soit automatiquement injecter par @SpringBootApplication.
On implémente dans un premier temps CommandLineRunner pour qu'il soit éxécuté après que 
tout les beans soient créés et enregistrés.
Ensuite on utilise l'injection de constructeur et l'auto-connexion pour obtenir StudentRepository
créé par Spring Data.
Et pour finir la méthode run() est invoquée avec les arguments.

# Lancement du projet

Afin d'éviter des conflits lors du lancement de l'application il faut ajouter dans application.properties:
"spring.data.rest.base-path=/api.

# Test Api Rest

Pour vérifier l'Api sur le navigateur: https://localhost:8080/api
On obtient un lien vers l'entity Studentet on obtient les données initier dans DatabaseLoader.
On peut également aller sur Student avec son Id: https://localhost:8080/api/Students/1

# Conclusion

Je pense que dans le cadre de Thelem Spring Data Rest permettra de supprimer une bonne partie du travail manuel généralement associé à ce type de tâches et de simplifier la mise en oeuvre des fonctionnalités de la base de CRUD pour les appli web.
