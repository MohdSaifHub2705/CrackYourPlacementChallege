// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
       for(int i=0; i<path.length(); i++) {
           char dir = path.charAt(i);
           // South
           if(dir == 'S') {
               y--;
           } 
        //   north 
            else if(dir == 'N') {
                y++;
            }
            
            // west
            else if(dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }
       } 
       int x1 = x*x;
       int y1 = y*y;
       
       return (float)Math.sqrt(x1 + y1);
    }
    public static void main(String[] args) {
       String path = "NNNSEE";
       System.out.println( getShortestPath(path)+" ");
    }
}
