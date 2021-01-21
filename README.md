# Projet IDM : A DSL for JSON
## Introduction

Ce projet est une version d'un DSL permettant de réaliser des opérations sur des fichiers au format JSon. 
## Conception
Le méta modèle qui servait de base de conception à notre dsl est le suivant : 

![](https://i.imgur.com/nWRaMdo.png)

Nous n'avons pas réaliser un DSL complètement semblable au Meta modèle.
Nous avons changé différents détails pour simplifier le travail à réalisé et parce que en cours de routes nous avons eu des erreurs par rapport à notre modèle  (exemple: Expression qui pointe sur Expression posait un problème de recursion gauche).

Le résultat actuel du modèle correspond donc à la grammaire voir [JsonParser.xtext](https://github.com/jamelbouat/IDM-Project-JsonParser/blob/master/org.xtext.idmproject/src/org/xtext/example/idmproject/JsonParser.xtext)

## Etat du projet
Les opérations réalisées à ce jour sont : 
- Chargement stockage de fichier
- Selection d'object spécifique
- Calcul entre 2 valeurs d'expressions(∑, ∏)
- Affichage de valeur
- Insertion de clef valeur
- Mis à jour de valeur
- Export dans un csv (pas complet)

Nous avons réalisé un interpréteur java, un compilateur java et un compilateur pyton chacun servant l'execution de notre DSL.
Nous n'avons pas eu le temps de réaliser la gestion des tableaux JSON juste les couples clefs valeur ou la valeur est une chaine de caractère ou un nombre


