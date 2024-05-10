
On considère la hiérarchie de classes Robot, RobotExtra, RobotBissectrice et RobotExtraNG. Ces classes 
modélisent l'état et le comportement de robots virtuels. La classe abstraite Robot est un modèle qui définit les 
robots comme suit :
Chaque robot :
▪ A un nom (l’attribut protégé nom : chaîne de caractères).
▪ A une position (x,y) : donnée par les deux attributs protégés et entiers x et y.
▪ A une direction : donnée par l'attribut protégé direction qui prend une des valeurs "Nord", "Est", 
"Sud", "Ouest", "NO" (le nord-ouest), "NE" (le nord-est), "SO" (le sud-ouest), et "SE" (le sud-est).
▪ Peut avancer en avant avec la méthode abstraite : void avance( ).
▪ Peut tourner à droite avec la méthode abstraite : void rotation( ). Les robots ne peuvent pas tourner à 
gauche.
▪ Peut afficher son état avec la méthode sans paramètre : void afficher( ).
Le nom, la position et la direction d'un robot lui sont donnés au moment de sa création. Le nom est obligatoire 
mais on peut ne pas spécifier la position et la direction, qui doivent être définis par défaut à (0,0) et "Est" (On 
utilise deux constructeurs pour la classe Robot).
1) Ecrire les instructions Java qui permettent de définir la classe Robot.
Les RobotExtra se comportent selon le modèle Robot, et chaque robot de cette classe :
▪ Peut avancer suivant sa direction d'un pas (u ou v) en avant (Dans l’exemple du schéma : le robot R 
dont la direction actuelle est "Est" avance d’un pas v de la position R(1) à la position R(2). Le robot S dont 
la direction actuelle est "SE" avance d’un pas u de la position S(1) (4,-3) à la position S(2)(5,-4)…) : les 
robots peuvent avancer avec la méthode à implémenter void avance( ) (On utilise la structure 
switch(…){…}).
▪ Peut tourner à droite de 45° pour changer de direction avec la méthode à implémenter void rotation( )
(On utilise la structure switch(…){…}).
2) Ecrire les instructions Java qui permettent de définir la classe RobotExtra.
Les RobotBissectrice sont des Robots particuliers dans la mesure où ils se déplacent uniquement sur la droite 
(D): y = x et chaque robot de cette classe :
▪ Doit avancer si sa direction le permet vers la position symétrique par rapport à l’origine (0,0). Si sa 
direction ne permet pas ce type de déplacement, il se contente de se translater suivant l’un des vecteurs 
u(1,1) ou u(-1,-1) ( Dans l’exemple du schéma ci-dessous : le robot P dont la direction actuelle est "SO"
avance de la position P(1)(2,2) à la position symétrique P(2) (-2,-2). Le robot Q dont la direction actuelle est 
"NE" avance de la position Q(1)(4,4) à la position Q(2) (5,5)…) : les robots peuvent avancer avec la 
méthode à implémenter void avance( ).
▪ Peut tourner à droite de 180° pour changer de direction avec la méthode à implémenter void rotation( ).
▪ Peut lever une exception de type DirectionException si l'utilisateur saisisse une direction différente des 2 
directions admissibles.
3) Ecrire les instructions Java qui permettent de définir la classe RobotBissectrice.
On veut améliorer les robots de type RobotExtra en créant une Nouvelle Génération, les RobotExtraNG qui 
ne remplacent pas les anciens robots mais peuvent cohabiter avec eux.
Les RobotExtraNG savent faire la même chose mais aussi activer un mode « turbo » et le désactiver. Dans ce 
mode, les robots avancent selon le parcours à 3 étapes suivant : 1. Avancer comme un RobotExtra puis 2. Faire 
une rotation à droite et finalement 3. Avancer une autre fois comme un RobotExtra.
Travaux pratiques N°3
Chapitres : Héritage, Polymorphisme, classes Abstraites, Interfaces, et gestion des exceptions
- 2/6 -
Ces robots peuvent aussi :
▪ Répéter le parcours n fois grâce à une méthode avance(int n ) qui prend en paramètre le nombre de fois 
de parcours.
▪ Tourner à gauche de 45° grâce à la méthode rotationGauche( ).
▪ Faire demi-tour grâce à la méthode demiTour( ).
Les nouvelles méthodes doivent appeler les anciennes méthodes pour implémenter le nouveau comportement. 
Dans la classe RobotExtraNG, il faut :
▪ Définir un attribut turbo pour stocker l’état du mode turbo du robot (le mode turbo doit être désactivé par 
défaut).
▪ Redéfinir la méthode sans paramètres avance( ) de la classe RobotExtra de sorte que le mode turbo soit
pris en compte.
▪ Ecrire la méthode avance (int n) en prenant en compte le mode turbo(activé/désactivé).
▪ Ecrire une méthode setTurbo(…) qui permet d’activer/désactiver le mode turbo.
▪ Ecrire une méthode isTurbo( ) qui permet d’indiquer si le mode turbo est actif.
▪ Redéfinir la méthode afficher( ) pour ajouter l’état actuel du mode turbo.
4) Ecrire cette nouvelle classe en spécialisant la classe RobotExtra, sans modifier celle-ci.
5) Dans une classe RobotTest contenant la méthode main(…) créer un tableau de 3 objets de type Robot qui 
doit contenir 
un robot [Danel ;(7,7) ;NE] de type RobotBissectrice, 2 robots [Bonbon ;(6,-10) ;Nord] et [Sinsodine ;(15,-
15) ;SO] de type RobotExtraNG.
5.1. Appliquer au robot Danel les méthodes rotation(), avance() puis avance() et afficher() (Gérer 
l’exception DirectionException).
5.2. Appliquer au robot Bonbon les méthodes rotationGauche(), demiTour(), avance(7) et afficher().
5.3. Après avoir activé le mode turbo, appliquer au robot Sinsodine les méthodes rotationGauche(), 
avance(3) et afficher() (Une conversion explicite de type est nécessaire pour les robots 
RobotExtraNG ).
5.4. Donner les positions et les directions des 3 robots après l’exécution.
