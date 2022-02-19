package jason.programmers.problem42888;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> user_map = new HashMap<>();
        List<String[]> msg_list = new ArrayList<>();

        for (String r : record) {
            String[] r_arr = r.split(" ");
            String command = r_arr[0];
            String user_id = r_arr[1];


            if (command.equals("Enter") ) {
                String user_nickname = r_arr[2];
                user_map.put(user_id, user_nickname);
                msg_list.add(new String[]{user_id, command});
            }
            else if (command.equals("Leave") ) {
                msg_list.add(new String[]{user_id, command});
            }
            else { //Change
                String user_nickname = r_arr[2];
                user_map.put(user_id, user_nickname);
            }
        }

        String[] answer=new String[msg_list.size()];

        for(int i=0; i<msg_list.size();i++){
            String[] msg=msg_list.get(i);
            String user_id=msg[0];
            String command=msg[1];
            String nickname=user_map.get(user_id);

            if(command.equals("Enter")){
                answer[i]=nickname+"님이 들어왔습니다.";
            }
            else{
                answer[i]=nickname+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}
