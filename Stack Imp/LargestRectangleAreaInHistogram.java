class Solution {
    public int largestRectangleArea(int[] heights) {
        // steps first creat a stack and push element
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxArea = 0;

        // step 2 iterating over height of array and finding maxArea
        for(int i=0; i<heights.length; i++) {
          // height of top element of stack should be greater than curr element hieght
          while(st.size() != 1 && st.peek() != -1 && heights[st.peek()] >= heights[i]) {
              // store currheight 
              int currHeight = heights[st.peek()];
              st.pop();

              // calculating the width of rectangle
              int width = i-st.peek()-1;

              // if currheight*width (Area) is greater than previous maxArea
              // then update the maxArea
              maxArea = Math.max(maxArea, currHeight*width);
          }
          //push all ith into stack
          st.push(i); 
        }

        // compute area for all the elements left in stack
        while(st.size() != 1) {
          int idx = st.pop();
          int w = heights.length-st.peek()-1;
          int h = heights[idx];

          maxArea = Math.max(maxArea, w*h);
        }
        return maxArea;
    }
}
