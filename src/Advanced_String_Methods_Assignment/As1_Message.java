package Advanced_String_Methods_Assignment;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;

    public String slimdown(String s){
        if(s.charAt(s.length()-1) != ' ' && s.charAt(0) != ' '){
            return s;
        }else if (s.substring(s.length()-1, s.length()).equals(" ")){
            return slimdown(s.substring(0, s.length()-1));
        }else if(s.substring(0,1).equals(" ")){
            return slimdown(s.substring(1));
        }

        return "";
    }


    public As1_Message(String s){
        int position = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ':'){
                position = i;
            }
        }
        machineId = s.substring(position-1, position);
        machineType = s.substring(0, position-1);

        String[] a = s.substring(position+1, s.length()).split(" ");
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
        }


        warning = slimdown(s.substring(position+1, s.length()));



    }



    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }


    public boolean scanWarning(String keyword){
        if(keyword.equalsIgnoreCase(warning)){
            return true;
        }else if(keyword.equalsIgnoreCase(warning.substring(0, keyword.length())) && warning.substring(keyword.length(), keyword.length()+1).equals(" ")){
            return true;
        }else{

        }



        return false;
    }

}

