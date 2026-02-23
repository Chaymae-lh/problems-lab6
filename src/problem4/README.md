 Random insertions/deletions (milieu)
  . ArrayList
Structure : tableau dynamique
Quand on fait add(index, element) :
 il doit décaler tous les éléments à droite
Complexité : O(n)


 . LinkedList
Structure : liste doublement chaînée
Pas de décalage
MAIS il doit parcourir la liste jusqu’à l’index
Complexité : O(n)

 
  .Conclusion
Les deux sont O(n), mais :
- ArrayList est souvent plus rapide Car la mémoire est contiguë → meilleure localité cache

# Insertions/suppressions début & fin
 . ArrayList
Début : O(n) (décalage obligatoire)
Fin : O(1)


. LinkedList
Début : O(1)
Fin : O(1)

 .Conclusion

LinkedList est largement plus performant
Car aucune copie mémoire n’est nécessaire

# Random access (get(index))
. ArrayList
Accès direct par index
Complexité : O(1)

. LinkedList

Doit parcourir la liste
Complexité : O(n)

 .Conclusion
ArrayList est BEAUCOUP plus rapide
C’est le plus grand écart de performance.
