package com.example.fastquiz.model;

public class Question {

    //Toutes les questions du Quiz
    public String mQuestions[] = {
            "Quelle est la capitale de la Russie ?",
            "Quelle equipe française de football surnomme-t-on Les Canaris ?",
            "Que representent les anneaux olympiques ?",
            "Quand fut inaugure le tunnel sous la Manche ?",
            "Combien de litres de sang contient le corps humain ?",
            "L’armistice de la guerre de 14-18 a ete signe le :",
            "Quel est l’age minimum requis pour etre Maire ?",
            "De quel pays est originaire le Football ?",
            "L’auteur de Game of Thrones est :",
            "Quel est le nom du principal indice Boursier de la place de Paris ?",
            "Quelle est la capitale de l'Australie ?",
            "Qui est Zlatan Ibrahimovic ?",
            "Lors du Tour de France cycliste, qui est recompense d’un maillot blanc a pois rouges ?",
            "Quel nom porte un terrain de tennis ?",
            "Dans quel pays a eu lieu la Coupe du monde de football en 1994 ?",
            "De combien de joueurs se compose une equipe de basket-ball ?",
            "Combien les Français ont-ils de jours feries dans l’annee ?",
            "Vercingetorix est vaincu à Alesia en 52 av. J.-C. par :",
            "Quelle capitale Charlemagne s’etait-il choisie ?",
            "En 1347-1348, quel fleau devaste l’Europe ?",
            "La guerre de Cent Ans opposa la France a :",
            "Lequel de ces departements d’outre-mer n’est pas une ile ?",
            "La France compte environ :",
            "Chaque annee, la surface occupee par la foret française :",
            "Lequel de ces fleuves est le plus long ?"
    };

    //Toutes les réponses possibles au question du Quiz
    private String mChoix[][] = {
            {"Kazan","Sotchi","Moscou","Vladivostok"},
            {"Nantes","Marseille","Paris","Bordeaux"},
            {"Les drapeaux","Les continents","Les pays","Le sport"},
            {"1994","1985","1998","1979"},
            {"10L","5L","1L","8L"},
            {"11 août","1er mai","11 novembre","5 juin"},
            {"30 ans","20 ans","25 ans","18 ans"},
            {"Brésil","France","Angleterre","Allemagne"},
            {"George RR Martin","Stephen King","Pierre Boulle","Andrzej Sapkowski"},
            {"Le FTSE 100","Le CAC 40","Le DAX30","Le DOW JONES"},
            {"Sydney", "Canberra", "Melbourne", "Brisbane"},
            {"Joueur de tennis", "Joueur de basket", "Joueur de foot", "Joueur de volley"},
            {"Meilleur sprinter", "Meilleur grimpeur", "Meilleur coureur", "Meilleur jeune"},
            {"Le court", "Le terrain", "La piste", "Le domaine"},
            {"France", "Brésil", "USA", "Russie"},
            {"6", "4", "5", "7"},
            {"10", "13", "15", "11"},
            {"Jules César", "Charlemagne", "Les vikings", "Les perses"},
            {"Paris", "Aix-la-Chapelle", "Lyon", "Bordeaux"},
            {"La grippe", "La gastro", "La bronchiolite", "La peste noire"},
            {"l'Espagne", "l'Angleterre", "l'Italie", "la Belgique"},
            {"Guyane", "Réunion", "Guadeloupe", "Martinique"},
            {"30 000 communes", "45 000 communes", "35 000 communes", "40 000 communes"},
            {"Stagne", "Diminue", "Augmente", "Diminue fortement"},
            {"Loire", "Rhône", "Seine", "Rhin"}
    };

    //Toutes les bonnes réponses au question du Quiz
    private String mBonneReponse[] = {"Moscou", "Nantes", "Les continents", "1994", "5L", "11 novembre", "18 ans", "Angleterre", "George RR Martin", "Le CAC 40", "Canberra",
            "Joueur de foot", "Meilleur grimpeur", "Le court", "USA", "5", "11", "Jules César", "Aix-la-Chapelle", "La peste noire", "l'Angleterre",
            "Guyane", "35 000 communes", "Augmente", "Rhin"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoix1(int a){
        String choix = mChoix[a][0];
        return choix;
    }
    public String getChoix2(int a){
        String choix = mChoix[a][1];
        return choix;
    }
    public String getChoix3(int a){
        String choix = mChoix[a][2];
        return choix;
    }
    public String getChoix4(int a){
        String choix = mChoix[a][3];
        return choix;
    }

    public String getBonneReponse(int a){
        String reponse = mBonneReponse[a];
        return reponse;
    }
}
