import java.rmi.RemoteException;

public class RemoteImpl implements IRemote {
    @Override
    public String calcule(String ss) throws RemoteException {
        String s =ss;

        int result = 0;

           /*
           if(Integer.parseInt(s) % 2 == 0){
               result = 1;
           }else{
               result = 0;
           }
           */


        int i;

        for(i = 0 ; i < s.length() ; i++){
            if((s.charAt(i) == '+')||(s.charAt(i) == '-')||(s.charAt(i) == '*')||(s.charAt(i) == '/')){
                break;
            }
        }

        System.out.println("if 0");

        if (s.charAt(i) == '+'){

            System.out.println("if 1");
            result = Integer.parseInt(s.substring(0,i)) + Integer.parseInt(s.substring(i+1,s.length()));

        }else if(s.charAt(i) == '-'){

            System.out.println("if 2");
            result = Integer.parseInt(s.substring(0,i)) - Integer.parseInt(s.substring(i+1,s.length()));

        }else if(s.charAt(i) == '*'){

            System.out.println("if 3");
            result = Integer.parseInt(s.substring(0,i)) * Integer.parseInt(s.substring(i+1,s.length()));

        }else if(s.charAt(i) == '/' && Integer.parseInt(s.substring(i+1,s.length())) != 0){

            System.out.println("if 4");
            result = Integer.parseInt(s.substring(0,i)) / Integer.parseInt(s.substring(i+1,s.length()));

        }
        return result+"";

    }
}