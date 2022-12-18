package task;
public class Name {
    private String name;
    //Name creation
    Name(String val) {
        name = val;
    }
    //Name sending
    public String getName() {
        return name;
    }
    //Search string in name algorithm
    public boolean isStrInName(String findVal) {
        int lenName = name.length();
        int lenFindVal = findVal.length();
        if (lenFindVal > lenName) {
            return false;
        }
        else {
            String lowName = name.toLowerCase();
            String lowFindVal = findVal.toLowerCase();
            for (int i = 0; i <= lenName - lenFindVal; ++i) {
                int letterSolidarity = 0;
                for (int j = 0; j < lenFindVal; ++j) {
                    if (lowName.charAt(i + j) == lowFindVal.charAt(j)) {
                        ++letterSolidarity;
                    }
                    else {
                        break;
                    }
                }
                if (letterSolidarity == lenFindVal) {
                    return true;
                }
            }
            return false;
        }

    }
    
}
