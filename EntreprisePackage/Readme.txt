
## Système de Gestion des Employés

Ce programme Java permet de gérer les salaires et les primes des employés d'une entreprise de produits chimiques.

### 1. Classe Abstraite Employé

- Attributs : Nom, Prénom, Âge, Date d'entrée
- Méthode Abstraite : `calculerSalaire()` (dépend du type d'employé)
- Méthode : `getNom()` retourne "L'employé [Prénom Nom]"
- Constructeur : Prend en paramètre tous les attributs nécessaires

### 2. Hiérarchie de Classes Employés

- Superclasse : `Employé`
- Nouvelles Sous-classes :
  - Vente
  - Représentation
  - Production
  - Manutention
- Chaque sous-classe possède un constructeur prenant en argument tous les attributs nécessaires.

### 3. Employés Travaillant avec des Produits Dangereux

- Nouvelles Sous-classes :
  - ProductionDangereuse
  - ManutentionDangereuse
- Introduit une prime de risque mensuelle pour ces employés.

### 4. Interface pour les Employés à Risque

- Interface : `EmployeRisque` pour ajouter une prime mensuelle fixe de 2000 DH.

### 5. Classe Personnel

- Collection polymorphique d'Employe (Tableau ou liste).
- Méthodes :
  - `ajouterEmploye(Employe)`: Ajoute un employé à la collection.
  - `calculerSalaires()`: Affiche le salaire de chaque employé de la collection.
  - `salaireMoyen()`: Affiche le salaire moyen des employés de la collection.

---

