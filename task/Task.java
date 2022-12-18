package task;


public class Task {

    public static void main(String[] args) {
        
        FilmList firstLib = new FilmList();
        firstLib.append(new Film("Bread-killer", "Tim Burton", "Martin Scarceze", "Carter Burwel", "France", "horror", 2021, 103));
        firstLib.append(new Film("Sunrise", "Jack Brown", "Stefani Mayer", "Klaus Badelt", "USA", "comedy", 2020, 121));
        firstLib.append(new Film("Murder's knife", "Quentin Tarantino", "Quentin Tarantino", "Enio Morricone", "USA", "drama", 2010, 117));
        firstLib.append(new Film("A bad trip in Brzherzhemislychshke", "Doran Zagloba", "Invar Lihcke", "Ramin Djawadi", "Poland", "fantasy", 2014, 90));
        firstLib.append(new Film("Gazoline", "Dirk Kwarkforger", "Troy Ditrih", "Hans Zimmer", "German", "thriller", 2016, 105));
        firstLib.append(new Film("Skyscraper", "Yuriy Bycov", "Yuriy Bycov", "Victor Tsoy", "Russian Federation", "drama", 2010, 150));
        firstLib.append(new Film("Slavic pain", "Alexandrus Neuscus", "Alexandrus Neuscus", "Alexandrus Neuscus", "Russian Federation/USA", "drama", 2015, 98));
        firstLib.append(new Film("Joly Bambino", "Curtoni Uberatti", "Adriano Behavi", "Adriano Chelentano", "Italy", "comedy", 2022, 100));
        firstLib.append(new Film("Alexandr Petrovskiy", "Danya Kozlovskiy", "Danya Kozlovskiy", "Danya Kozlovskiy", "India", "horror", 2021, 112));

        System.out.println(firstLib.getAll());
        
        String findPart = "er";
        System.out.println(String.format("Film names result by search word \"%s\".", findPart));
        System.out.println(firstLib.getByString(findPart));
    }
    
    
}
