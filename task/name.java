package task;
public class name {
    private String nm;
    
    name(String val)
    {
        nm = val;
    }
    
    public String getName()
    {
        return nm;
    }

    public boolean isStrInName(String find_val)
    {
        int len_nm = nm.length();
        int len_fv = find_val.length();
        if (len_fv > len_nm)
            return false;
        else
        {
            String low_nm = nm.toLowerCase();
            String low_fv = find_val.toLowerCase();
            for (int i = 0; i <= len_nm - len_fv; ++i)
            {
                int letter_solidarity = 0;
                for (int j = 0; j < len_fv; ++j)
                    if (low_nm.charAt(i + j) == low_fv.charAt(j))
                    {
                        ++letter_solidarity;
                    }
                    else
                        break;
                
                if (letter_solidarity == len_fv)
                    return true;
            }
            return false;
        }

    }
    
}
