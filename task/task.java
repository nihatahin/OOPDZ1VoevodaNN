package task;


public class task {

    public static void main(String[] args) {
        
        film_list first_lib = new film_list();
        first_lib.append(new film("Bread-killer", "Tim Burton", "Martin Scarceze", "Carter Burwel", "France", "horror", 2021, 103));
        first_lib.append(new film("Sunrise", "Jack Brown", "Stefani Mayer", "Klaus Badelt", "USA", "comedy", 2020, 121));
        first_lib.append(new film("Murder's knife", "Quentin Tarantino", "Quentin Tarantino", "Enio Morricone", "USA", "drama", 2010, 117));
        first_lib.append(new film("A bad trip in Brzherzhemislychshke", "Doran Zagloba", "Invar Lihcke", "Ramin Djawadi", "Poland", "fantasy", 2014, 90));
        first_lib.append(new film("Gazoline", "Dirk Kwarkforger", "Troy Ditrih", "Hans Zimmer", "German", "thriller", 2016, 105));
        first_lib.append(new film("Skyscraper", "Yuriy Bycov", "Yuriy Bycov", "Victor Tsoy", "Russian Federation", "drama", 2010, 150));
        first_lib.append(new film("Slavic pain", "Alexandrus Neuscus", "Alexandrus Neuscus", "Alexandrus Neuscus", "Russian Federation/USA", "drama", 2015, 98));
        first_lib.append(new film("Joly Bambino", "Curtoni Uberatti", "Adriano Behavi", "Adriano Chelentano", "Italy", "comedy", 2022, 100));
        first_lib.append(new film("Alexandr Petrovskiy", "Danya Kozlovskiy", "Danya Kozlovskiy", "Danya Kozlovskiy", "India", "horror", 2021, 112));

        System.out.println(first_lib.getAll());  

        System.out.println(first_lib.getByString("er"));
    }
    
    
}
