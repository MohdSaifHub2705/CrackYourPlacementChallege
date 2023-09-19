class HelloWorld {
    
    public static String RemoveDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            // find char index at every index
            char c = str.charAt(i);
            if(sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       String str = "saiffff";
       String result = RemoveDuplicates(str);
       
       System.out.println(result + " ");
    }
}
