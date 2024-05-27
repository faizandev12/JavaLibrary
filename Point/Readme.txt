Exercice 1 : Point
Considérons une classe Java appelée Point qui représente un point dans le plan en coordonnées 
cartésiennes. Cette classe devra avoir deux attributs privés de type double nommés x et y.
1. Créer la classe Point.
2. Générer les getters et setters pour les deux attributs.
3. Redéfinir la méthode toString() qui retourne la représentation mathématique d’un point : (x, y).
4. Définir un constructeur avec deux paramètres Point(double x, double y), un constructeur sans 
paramètres Point(), et un constructeur par recopie Point(Point p).
5. Ecrire la méthode calculerDistance(Point p) qui permet de calculer la distance entre le point de 
l’objet courant (this) et l’objet p passé en paramètre. 
La distance entre deux points A(x1,y1) et B(x1,y1), en mathématiques, est égale à :
2 2
1 2 1 2 ( ) ( ) x x y y − + −
6. Ecrire la méthode calculerMilieu(Point p) qui permet de calculer et de retourner un objet 
correspondant au milieu du segment défini par le point de l’objet courant (this) et l’objet p 
passé en paramètre.
7. Ecrire la méthode translater(double x,double y) qui translate le point de l’objet courant selon le 
vecteur (x,y).
8. Ecrire la méthode homothetie(int k) qui transforme le point de l’objet courant selon 
l’homothétie de centre o et de rapport k.
9. Ecrire la méthode symetrie( ) qui transforme le point de l’objet courant selon la symétrie par 
rapport à l’axe y=x.
10. Ecrire la méthode rotation( ) qui transforme le point de l’objet courant selon la rotation de 90°.
Considérons maintenant une deuxième classe appelée TroisPoints ayant les attributs suivants :
- A : un attribut privé de type Point.
- B : un attribut privé de type Point.
- C : un attribut privé de type Point.
11. Générer les getters et setters et le constructeur avec trois paramètres de la classe TroisPoints.
12. Ecrire une méthode sontAlignes() qui retourne true si les trois points A, B et C sont alignés, 
false sinon. 
13. Ecrire une méthode estTriangle() qui retourne true si les trois points A, B et C forment un 
triangle, false sinon. 
14. Ecrire une méthode estIsocele() qui retourne true si les trois points A, B et C forment un 
triangle isocèle, false sinon. 
15. Ecrire une méthode estEquilateral() qui retourne true si les trois points A, B et C forment un 
triangle équilatéral, false sinon. 
16. Ecrire une méthode estRectangle() qui retourne true si les trois points A, B et C forment un 
triangle rectangle, false sinon. 
17. Dans la méthode main() de la classe principale Main, demandez à l’utilisateur de :
- Saisir les coordonnées de trois points.
- Afficher tous les détails sur ces trois points.
- Afficher les milieux, les distances qui les séparent, et les transformations usuelles…
- Afficher s’ils sont alignés, s’ils forment un triangle isocèle...
