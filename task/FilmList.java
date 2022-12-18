package task;

import java.util.ArrayList;

public class FilmList {
    ArrayList<Film> fileList = new ArrayList<Film>();

    public void append(Film newFilm) {
        fileList.add(newFilm);
    }
    
    public String getAll() {
        StringBuilder allCards = new StringBuilder(5000);

        for (int i = 0; i < fileList.size(); ++i) {
            allCards.append(fileList.get(i).getCard());
            allCards.append("//////////////////////////////////\n");
        }

        return allCards.toString();
    }

    public String getByString(String findMask) {
        StringBuilder correctNames = new StringBuilder(5000);

        for (int i = 0; i < fileList.size(); ++i) {
            if (fileList.get(i).filmName.isStrInName(findMask)) {
                correctNames.append(String.format(" - %s\n", fileList.get(i).filmName.getName()));
            }
        }

        return correctNames.toString();
    }
}
