Dans cet exercice nous avons 2 relations bidirectionnelles

-----------------------Client / Commande---------------------------
Cette relation est intéressante car dans une application, un client 
peut avoir un suivi de ses commandes ainsi qu'un historique de ces 
dernières. D'un autre côté, une commande doit contenir certaines 
informations du client associé à cette dernière.
-------------------------------------------------------------------

--------------------Produit / CategorieDeProduit------------------------
Cette relation semble beaucoup moins pertinente car d'un côté, il est vrai
que lors de la recherche d'un produit, un client le filtrera par catégories.
Cependant, il y a très peu de chances qu'un client essaie de chercher la 
catégorie d'un produit qu'il a déjà trouvé.
------------------------------------------------------------------------