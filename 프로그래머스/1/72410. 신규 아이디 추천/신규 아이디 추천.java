class Solution {
    
    String id;
    StringBuffer sb;
    
    public String solution(String new_id) {
        sb = new StringBuffer();
        id = new_id;
        level1();
        level2();
        System.out.println(this.id);
        level3();
        System.out.println(this.id);
        level4();
        System.out.println(this.id);
        level5();
        System.out.println(this.id);
        level6();
        System.out.println(this.id);
        level7();
        System.out.println(this.id);
        return id;
    }
    
    private void level7() {
        sb.append(id);
        if (sb.length() <= 2) {
            char lastC = sb.charAt(sb.length() - 1);
            while (sb.length() < 3) {
                sb.append(lastC);
            }
        }
        id = sb.toString();
    }
    
    private void level6() {
        if (id.length() >= 16) {
            id = id.substring(0, 15);            
            if (id.charAt(14) == '.') {
                id = id.substring(0, 14);
            } 
        }
    }
    
    private void level5() {
        if (id.equals("")) { 
            id = "a";
        }
    }
    
    private void level4() {
        sb.append(this.id);
        if (id.length() > 0 && this.id.charAt(0) == '.') {
            sb.deleteCharAt(0);
            id = sb.toString();
        }
        if (id.length() > 0 && this.id.charAt(this.id.length() - 1) == '.') {
            sb.deleteCharAt(this.id.length() - 1);
            id = sb.toString();
        }
        sb.setLength(0);
    }
    
    private void level3() {
        sb.append(this.id);
        int i = 0;
        while (i < sb.length() - 1) {
            char nowC = sb.charAt(i);
            char nextC = sb.charAt(i + 1);
            if (nowC == '.' && nextC == '.') {
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }
        this.id = sb.toString();
        sb.setLength(0);
    }
    
    private void level2() {
        for (int i = 0; i < this.id.length(); i++) {
            char c = this.id.charAt(i);
            if (
                ('a' <= c && 'z' >= c)
                || ('0' <= c && '9' >= c)
                || c == '-'
                || c == '_'
                || c == '.'
            ) {
                sb.append(c);
            }
        }
        this.id = sb.toString();
        sb.setLength(0);
    }
    
    private void level1() {
        this.id = this.id.toLowerCase();
    }
}
