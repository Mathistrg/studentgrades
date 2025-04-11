# Student Grades API

API REST de gestion des notes étudiantes, développée en Java Spring Boot avec MySQL.

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

---

## 🚀 Technologies Utilisées

- Java 17 / 21
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Jakarta Bean Validation (Validation API)

---

## ⚙️ Lancer le projet en local

### 1. Prérequis

- Java JDK 17 ou 21
- Maven
- MySQL Server

### 2. Cloner le projet

```bash
git clone https://github.com/votre-utilisateur/studentgrades.git
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

Ou depuis votre IDE (IntelliJ, Eclipse).

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

## 👨‍🏫 Auteurs

Projet réalisé dans le cadre d'un devoir pour [Pierre Paillard](mailto:paillard.pierre@gmail.com).
