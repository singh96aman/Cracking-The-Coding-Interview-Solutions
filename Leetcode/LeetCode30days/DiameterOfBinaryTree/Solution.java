import java.io.*;
import java.util.*;

/*
Linux commands :
cp Solution.java examples/Solution1.java
cd examples
javac Solution1.java && java Solution1
cd ..
*/

class Solution
{
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream dataInputStream; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead;
        public Reader() 
        { 
            dataInputStream = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
        public Reader(String directory, String file_name) throws IOException 
        { 
            dataInputStream = new DataInputStream(new FileInputStream(directory+"/"+file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        }
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9');if (neg) 
                return -ret; 
            return ret; 
        }
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read();do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9');if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            }if (neg) 
                return -ret; 
            return ret; 
        }
        private void fillBuffer() throws IOException 
        { 
            bytesRead = dataInputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        }
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        }
        public void close() throws IOException 
        { 
            if (dataInputStream == null) 
                return; 
            dataInputStream.close(); 
        } 
    }

    /* IO Instructions */

    static Reader sc=new Reader();
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static int nextInt()throws IOException{return sc.nextInt();}
    public static long nextLong()throws IOException{return sc.nextLong();}
    public static double nextDouble()throws IOException{return sc.nextDouble();}
    public static String readLine()throws IOException{return sc.readLine();}
    public static void print(Object a)throws IOException{bw.write(a+"");}
    public static void printSpace(Object a)throws IOException{bw.write(a+" ");}
    public static void println(Object a)throws IOException{bw.write(a+"\n"); }
    public static void printArr(Object[] arr) throws IOException{
        printSpace("[ ");
        for(Object a : arr)
            printSpace(a);
        printSpace(" ]");
    }
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {
        this.left=null;
        this.right=null;
      }
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    static TreeNode createATreeUtil(TreeNode treeNode, int[] arr, int index){
        if(arr.length==0)
            return null;

        if(index>=arr.length)
            return null;

        treeNode = new TreeNode();
        treeNode.val = arr[index];
        treeNode.left = createATreeUtil(treeNode, arr, 2*index+1);
        treeNode.right = createATreeUtil(treeNode, arr, 2*index+2);       
        return treeNode;

    }
 
    static void printTree(TreeNode root) throws IOException{
        if(root==null)
            return;
 
        printSpace(root.val);

        printTree(root.left);
        printTree(root.right);

    }

     static int heightOfBinaryTree(TreeNode root){
        if(root==null)
            return 0;
        return 1+(Math.max(heightOfBinaryTree(root.left)
            , heightOfBinaryTree(root.right)));
    }
    
    static int diameterOfBinaryTreeUtil(TreeNode root, int max){       
        if(root==null)
            return max;
        int diameter=heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right);
        if(diameter>max)
            max=diameter;
        return Math.max(Math.max(max, diameterOfBinaryTreeUtil(root.left, max)),                    diameterOfBinaryTreeUtil(root.right, max));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        return diameterOfBinaryTreeUtil(root, 0);
    }

    /* First insert a test case here */

    static void testCase() throws IOException{
         try{
            long startTime, stopTime;
            startTime = System.currentTimeMillis();
            printSpace(logic(new int[]{1,2,3,4,5,6,7,8}));
            println(0);
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static void input() throws IOException{

    }

    static int logic(int[] arr) throws IOException{
        TreeNode root = new TreeNode();
        root=createATreeUtil(root, arr, 0);
        printTree(root);
        return 0;
    }

    public static void main(String args[])throws IOException
    {
        try{
            //input();
            //logic();
            testCase();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bw.flush();
        bw.close();
    }
}