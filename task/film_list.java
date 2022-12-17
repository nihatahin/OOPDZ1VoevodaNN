package task;

import java.util.ArrayList;

public class film_list {
    ArrayList<film> fList = new ArrayList<film>();

    public void append(film fl)
    {
        fList.add(fl);
    }
    
    public String getAll()
    {
        StringBuilder allCards = new StringBuilder(5000);

        for (int i = 0; i < fList.size(); ++i)
        {
            allCards.append(fList.get(i).getCard());
            allCards.append("//////////////////////////////////\n");
        }

        return allCards.toString();
    }

    public String getByString(String find_mask)
    {
        StringBuilder correctNames = new StringBuilder(5000);

        for (int i = 0; i < fList.size(); ++i)
        {
            if (fList.get(i).filmName.isStrInName(find_mask))
                correctNames.append(String.format(" - %s\n", fList.get(i).filmName.getName()));
        }

        return correctNames.toString();
    }
}
