package task;


public class task {

    public static void main(String[] args) {
        film film1 = new film("Bread-killer", "Tim Burton", "Martin Scarceze", "Carter Burwel", "France", "horror", 2021, 103);
        film film2 = new film("Sunrise", "Jack Brown", "Stefani Mayer", "Klaus Badelt", "USA", "comedy", 2020, 121);
        film film3 = new film("Murder's knife", "Quentin Tarantino", "Quentin Tarantino", "Enio Morricone", "USA", "drama", 2010, 117);
        film film4 = new film("A bad trip in Brzherzhemislychshke", "Doran Zagloba", "Invar Lihcke", "Ramin Djawadi", "Poland", "fantasy", 2014, 90);
        film film5 = new film("Gazoline", "Dirk Kwarkforger", "Troy Ditrih", "Hans Zimmer", "German", "thriller", 2016, 105);
        film film6 = new film("Skyscraper", "Yuriy Bycov", "Yuriy Bycov", "Victor Tsoy", "Russian Federation", "drama", 2010, 150);
        film film7 = new film("Slavic pain", "Alexandrus Neuscus", "Alexandrus Neuscus", "Alexandrus Neuscus", "Russian Federation/USA", "drama", 2015, 98);
        film film8 = new film("Joly Bambino", "Curtoni Uberatti", "Adriano Behavi", "Adriano Chelentano", "Italy", "comedy", 2022, 100);
        film film9 = new film("Alexandr Petrovskiy", "Danya Kozlovskiy", "Danya Kozlovskiy", "Danya Kozlovskiy", "India", "horror", 2021, 112);






        System.out.println(film1.getCard());
        System.out.println(film2.getCard());
        System.out.println(film3.getCard());
        System.out.println(film4.getCard());
        System.out.println(film5.getCard());
        System.out.println(film6.getCard());
        System.out.println(film7.getCard());
        System.out.println(film8.getCard());
        System.out.println(film9.getCard());
        
    }
    
    
}
