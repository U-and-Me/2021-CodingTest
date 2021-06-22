class Solution {
    public String solution(String new_id) {
        String answer = "";
        String id = new_id.toLowerCase(); // 1단계
        id = id.replaceAll("[^a-z0-9_.-]", ""); // 2단계
        id = id.replaceAll("[.]{2,}", "."); // 3단계
        id = id.replaceAll("^[.]|[.]$", ""); // 4단계
        if(id.isEmpty()) id = "a"; // 5단계
        if(id.length() >= 16)
            id = id.substring(0, 15).replaceAll("[.]$", ""); // 6단계
        if(id.length() <= 2){
            char lastStr = id.charAt(id.length()-1); 
            while(id.length() != 3)
                id += lastStr;
        } // 7단계
        
        answer = id;
        
        return answer;
    }
}
