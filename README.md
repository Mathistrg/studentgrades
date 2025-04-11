# Student Grades API

API REST de gestion des notes étudiantes, développée en Java Spring Boot avec MySQL et documentée avec Swagger UI.

---

## 📚 Fonctionnalités

- **Gestion des Étudiants**  
  ➔ Ajouter, modifier, supprimer, récupérer tous, récupérer par ID.

- **Gestion des Cours**  
  ➔ Ajouter, modifier, supprimer, récupérer tous, récupérer par ID.

- **Gestion des Notes**  
  ➔ Ajouter une note, modifier, supprimer, lister par étudiant ou par cours.

- **Génération de Rapports**  
  ➔ Calcul de la moyenne des notes par étudiant ou par cours.

- **Documentation Swagger**  
  ➔ Tester toutes les routes directement via une interface visuelle.

---

## 🚀 Technologies Utilisées

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- MySQL
- Lombok
- Jakarta Bean Validation
- Swagger OpenAPI (springdoc-openapi 2.3.0)

---

## ⚙️ Lancer le projet en local

### 1. Prérequis

- Java JDK 17
- Maven
- MySQL Server

### 2. Cloner le projet

```bash
git clone https://github.com/Mathistrg/studentgrades.git
cd studentgrades
```

### 3. Configurer la base de données

Créez une base de données MySQL :

```sql
CREATE DATABASE studentgradesdb;
```

Configurez votre `src/main/resources/application.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentgradesdb
spring.datasource.username=root
spring.datasource.password=motdepasse
spring.jpa.hibernate.ddl-auto=update
```

### 4. Lancer l'application

```bash
./mvnw spring-boot:run
```

Ou :

```bash
java -jar target/studentgrades-0.0.1-SNAPSHOT.jar
```

---

## 📬 Endpoints disponibles

| Ressource  | Méthode | URL | Description |
|------------|---------|-----|-------------|
| Étudiants  | POST    | `/students` | Ajouter un étudiant |
|            | GET     | `/students` | Liste des étudiants |
|            | GET     | `/students/{id}` | Étudiant par ID |
|            | PUT     | `/students/{id}` | Modifier un étudiant |
|            | DELETE  | `/students/{id}` | Supprimer un étudiant |
| Cours      | POST    | `/courses` | Ajouter un cours |
|            | GET     | `/courses` | Liste des cours |
|            | GET     | `/courses/{id}` | Cours par ID |
|            | PUT     | `/courses/{id}` | Modifier un cours |
|            | DELETE  | `/courses/{id}` | Supprimer un cours |
| Notes      | POST    | `/grades` | Ajouter une note |
|            | GET     | `/grades` | Liste des notes |
|            | GET     | `/grades/{id}` | Note par ID |
|            | PUT     | `/grades/{id}` | Modifier une note |
|            | DELETE  | `/grades/{id}` | Supprimer une note |
| Rapports   | GET     | `/reports/course/{courseId}` | Moyenne d'un cours |
|            | GET     | `/reports/student/{studentId}` | Moyenne d'un étudiant |

---

## 📖 Documentation Swagger

Une fois l'application démarrée, accédez à la documentation visuelle ici :

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

Swagger permet de :
- Visualiser tous les endpoints
- Tester les requêtes **POST**, **GET**, **PUT**, **DELETE**
- Vérifier directement les réponses API

---

## 🎯 Exemple d'utilisation rapide

1. **Ajouter un étudiant**

POST `/students` ➔ Body JSON :

```json
{
  "firstName": "Jean",
  "lastName": "Dupont"
}
```

2. **Ajouter un cours**

POST `/courses` ➔ Body JSON :

```json
{
  "name": "Mathématiques"
}
```

3. **Ajouter une note**

POST `/grades` ➔ Body JSON :

```json
{
  "student": {
    "id": 1
  },
  "course": {
    "id": 1
  },
  "value": 15.5
}
```

4. **Consulter la moyenne**

GET `/reports/student/1` ➔ Résultat :

```json
15.5
```

---

## 👨‍🏫 Auteurs

Projet réalisé dans le cadre d'un devoir pour [Pierre Paillard](mailto:paillard.pierre@gmail.com).

---

