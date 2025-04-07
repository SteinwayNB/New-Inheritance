package Advanced_String_Methods_Assignment;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;


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


        warning = temp;



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

    public boolean scanWarning(){
        return false;
    }

}

