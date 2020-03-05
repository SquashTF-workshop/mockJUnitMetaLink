Ce projet exécute des tests sans SUT. Ce projet a été créé afin de mocker le projet utilisé dans les premières versions (avec le .json mocked) 
pour que les résultats soient représentatif d'un test standard (pour bypass le besoin d'interface graphique dans le projet originel).

Technologies :
JUnit Jupiter (5)
Dépendance TFMetadata

Tests disponibles :

AnimatedMenuTest.testMenuTestimonials() | DisplayName : MenuTestimonials | Vérification sur une liste | Test OK

AnimatedMenuTest.testMenuBlog() | DisplayName : MenuBlog | Vérification sur une liste | Test KO : failure sur l'assert

MutationObserverTest.testMutation() | Pas de DisplayName | Vérification sur un script js | Test OK