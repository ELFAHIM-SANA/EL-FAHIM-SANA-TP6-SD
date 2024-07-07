# Architectures Micro-services

## Première Partie : Développer un micro-servic

### MIcro Service avec Web Service RESTFUL : 

#### Premiérement voici la structure de notre micro_service:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/933aa125-696a-48f8-88cf-de3f0702e07f)

#### On a commancé par la création de l'entité BankAccount avec ses différents attributs:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/0a14a8a4-d3c5-47b1-8a3d-7591fd0a45da)

#### On a crée notre base de données account-db:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/28a996b5-c344-49a5-b9e6-d83d109bdb4a)

#### Ainsi que le repositori BankAccountRepository:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/fe85b2ff-145b-4780-93dd-67a5996ff3f4)

#### On a consulté notre base de données aprés la création de quelque comptes:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/b7ddfced-fce9-4c4f-9b06-f179c4c8abd4)

#### Exposer les fonctionnalités de notre micro-service pour le mode extérieur avec  RESTFUL:

On a créer une classe AccountRestController dans la quelle il y a les méthodes suivantes:
##### Méthode pour consulter une liste de comptes:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/0cb44472-52ba-4659-a02b-0f19c128a022)

#### Affichage:

Les données sont par défaut au format Json:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/81108b41-2c97-4ba9-a815-4efc259a7f52)

##### Méthode pour consulter un compte:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/d77fcd84-1ae8-4caf-b93f-6e73eb0cad79)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/d465c732-32c8-4e2b-8e67-fe6cc9c4d930)

##### Méthode pour enregistrer un compte:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/0c832267-30ef-41b0-a68d-aa08ef7e03b6)

##### Méthode pour faire les mise à jours:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/cfa09192-1db3-4f94-9cdd-d23411188f8e)

##### Méthode pour supprimer un compte avec id:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/484a2539-81a9-4e24-b022-77b30e982c22)

#### Teste les méthodes avec postman:

##### Méthode 1:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/c07fbb15-267e-407a-a74d-455af41cea07)

##### Méthode 2:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/5b73211e-7abd-4224-86d3-cefbf2edac75)

##### Avec Post :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/47b1f54d-cf72-40d0-a5ca-507690d70cb5)

##### Méttre à jour un champs  avec PUT:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/bc72207a-8b14-4351-b868-f09328d3c8c5)

#### Pour la documentation on utilise la dépendace «SpringDoc OpenAPI UI »:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/9805be19-22ee-4a61-bc87-191f0accd14d)

#### Affichage:

##### Il nous dirige vers la documentation Swager:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/f4366d3a-705e-41c3-9f11-da1be95ab252)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/02b6f6d6-3239-45b1-96d8-8c5bbb03b106)

##### Consulter avec id:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/75d9211b-960e-4405-8ea7-8da16aa5f5e2)

##### Ajouter compte:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/4ef0b229-f956-4c98-b11d-2c2fed9d980d)

##### Le compte été ajouté avec sucées:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/e4624c30-f8aa-4ba8-803b-6ba3b78e9212)

#### On peut importer la documentation dans postman:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/df44e124-6ab7-4eb8-a03b-e1a588598d52)

#### Utiliser la dépendance Spring Data Rest pour accéeder directement à la base de données sans passer par la couche métier:

##### Mnt on créer un web servise générique pour fonctionner  avec n’importe quelle entité.

###### 1ere web service RESTFULL avec Spring Data Rest:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/f4359428-5638-4d21-9b70-663f999bc310)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/e87eab06-84a7-4b20-8fa9-c05899488c5c)

######2 émé  web service RESTFULL:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/df69cb3a-e3f6-47ff-a0bc-a08f16c7302d)

##### Dans  BankAccountRepository on ajoute un eméthode pour chercher les comptes par type:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/0e20b604-da3a-4b15-8ee7-76c2436e6108)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/dc13c6c7-5ec7-47f1-8cfd-f381fd5651d8)

#### On a crééer une interface de projection:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/d5639207-8a99-43e0-840d-e9c8b7d775ee)

#### Affichage:

##### Par défault il me donne tous les attributs sauf le id:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/642ca54a-8bbe-4c91-9ef4-fac7de6b8138)

#### Avec projection:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/2ae35db1-5544-412f-b4b0-a6bc9b05e9e1)

#### On a modifier BankAccountRepository:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/e64a6b4e-294c-47dd-b648-f6166656268a)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/0c0de535-9eec-42f8-ac18-8e62dc1c48a1)

#### La couche Service:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/d974bd1e-e1af-4736-9d7a-d3602d895d6a)

##### Aprés on a modifier la méthode save :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/85a44ea9-cfc8-4ef4-a06f-c66cdc86da60)

#### On a créer une classe mapper:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/bbae3219-b290-46ca-8ab9-ec8228e03d5b)

#### Et dans la classe AccountServiceImp :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/dc94e11d-f414-46ed-bfb3-324d8453f839)

### Micro-SERVICE wvec web service GRAPHQL :  

#### On a crée le fichier schéma.graphqls:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/2ea6bea3-cd4c-4798-8907-1bf180d9e0c3)

#### L’ajout de la partie graphql à application.properties:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/3c6ca0fc-c659-48f4-9adc-ffca438c8f08)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/84e0c7ec-82c8-4e22-9f63-182c1d32269d)

##### On a un message d’erreur au niveau de createdAt car il est de type Date on va le rende Long pour résoudre le probléme:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/dc45a3d1-699d-45ef-beb2-bec2a7ff0007)

##### On a créer la classe BankAccountGraphqlController pour le web:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/666c2cfd-e5ce-47bb-ad98-46865435d1c7)

##### On a ajouté la récupération bu id :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/18c1aa4e-aa12-46d1-99e6-13e090fa442d)

##### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/bfb12d4f-2f78-4d14-90e7-d5ca44f3aac0)

#### Gestion manuelle des exceptions :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/f6c2887a-b65d-4ed3-92e6-472167f21ca5)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/5ed5d0d0-1dae-466f-a5fa-26d4ffc160a6)

#### Créer la méthode addAccout pour ajouter un compte dans la class Controller :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/7313b6c8-540d-48ab-996d-631c384f75d7)

#### Ajouter la méthode dans la schéma:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/fcdab3d1-fb06-4f72-8335-50400f38f224)

#### Modifier le controller aussi:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/069c32fb-4cf0-438a-9ee7-22d245080c2a)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/139bd15e-f2a5-48b3-9f3b-b759c0331f55)

#### Mutation avec paramétres :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/c19fe938-ead0-411c-bd91-6760a86df13e)

#### Ajouter la méthode UpdateAccount au controller:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/1bee627a-d15f-490e-95f3-af4e8179181d)

#### L’ajouter aussi dans le schéma:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/cc9339d0-7488-4c39-8363-b4deaa0843f1)

#### Ajouter méthode pour supprimer compte dans le controller :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/7cceb18b-7e2c-4142-a503-1d2d59bd3c4f)

#### L’ajouter aussi dans le schéma:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/52982125-2a5d-4001-b118-5e9ee9ef76a0)

#### Test et Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/a4cf9799-f1a8-4508-9d8d-03e110f25b73)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/74aeebf8-4927-46a9-9d15-2fa1afd00130)

#### Supprimer:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/50dac335-a10c-4763-8bab-fdf056af0521)

#### Création d’une entité Client:Customer:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/bcb28180-789f-4837-8451-9c0b79c31a49)

#### Création d’une interface pour gérer les clients :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/3ba8d410-9a6e-43f7-ad89-a1712d410145)

##### Création des compts avec relation OneToMany bidirectionnel:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/52940223-8387-48ac-ad7f-c1fbc2ce91d5)

#### La vérification de l’insertion des données:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/b707687f-00c1-453b-bfa0-b7a321f948d4)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/39ce9f4a-0174-4124-9a5d-7a877297a48b)

#### Ajouter le Customer au schéma:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/41610f74-65b3-4f52-880b-b2c3b2413d83)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/5c8ac652-c110-41a7-84e5-0717cfdc4c2b)

##### Ajoute une autre méthode dans le controller pour récupérer une liste de clients:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/d54f1c2b-8970-4ae5-b713-ec5cc8f10f6e)

#### Affichage:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/ee530265-3b2b-4626-a7f3-3dd6d6d1cda8)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/27ac6bf8-88ab-4968-8b45-a17385538367)

#### Lorsqu’on revient à la partie de Rest on aura une boucle infinie comme suit:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/e0a93c3f-fb67-4f3a-80d4-c9b7636640b4)

##### Et des exceptions:

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/c14e47c8-ce1a-4b0e-93f2-cb766a7d8911)

##### Pour résoudre ca :

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/4702df7f-c640-448d-a17f-00765c5e4b94)

![image](https://github.com/ELFAHIM-SANA/EL-FAHIM-SANA-TP6-SD/assets/131165163/9f37f652-d1c0-41c2-8cad-462d7b58c184)


















