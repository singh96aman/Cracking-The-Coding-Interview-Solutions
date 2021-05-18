import java.io.*;
import java.util.*;

/*
Linux commands :
cp Solution.java examples/Solution1.java
cd examples
javac Solution1.java && java Solution1
cd ..
*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    ListNode listNodeInit(int[] arr){
        ListNode head = new ListNode();
        ListNode travel = head;
        if(arr.length>0){
            travel.val = arr[0];
            for(int i=1; i<arr.length; i++){
                ListNode temp = new ListNode(arr[i]);
                travel.next=temp;
                travel = travel.next;
            }
        }else{
            return head;
        }
        return head;
    }

    @Override
    public String toString(){
        ListNode travel = this;
        StringBuilder sb = new StringBuilder();
        while(travel!=null){
            sb.append(travel.val+" ");
            travel = travel.next;
        }
        return sb.toString();
    }
}


class MergeTwoSortedLists
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
 

    /* First insert a test case here */

    static void testCase() throws IOException{
         try{
            long startTime, stopTime;
            startTime = System.currentTimeMillis();
            printSpace(mergeTwoLists(new ListNode().listNodeInit(new int[]{1,2,4}), new ListNode().listNodeInit(new int[]{1,3,4})));
            println(new ListNode().listNodeInit(new int[]{1,1,2,3,4,4}));
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(mergeTwoLists(new ListNode().listNodeInit(new int[]{}), new ListNode().listNodeInit(new int[]{})));
            println(new ListNode().listNodeInit(new int[]{}));
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(mergeTwoLists(new ListNode().listNodeInit(new int[]{}), new ListNode().listNodeInit(new int[]{0})));
            println(new ListNode().listNodeInit(new int[]{0}));
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static void input() throws IOException{

    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) throws IOException{
        ListNode header1 = l1;
        ListNode header2 = l2;
        ListNode result = new ListNode();
        ListNode travel = result;
        ListNode temp = new ListNode();
        while(header1!=null && header2!=null){
            if(header1.val < header2.val){
                temp = new ListNode(header1.val);
                header1 = header1.next;
            }else{
                temp = new ListNode(header2.val);
                header2 = header2.next;
            }
            travel.next=temp;
            travel = travel.next;
        }
        while(header1!=null){
            temp = new ListNode(header1.val);
            travel.next = temp;
            travel = travel.next;
            header1 = header1.next;
        }
        while(header2!=null){
            temp = new ListNode(header2.val);
            travel.next = temp;
            travel = travel.next;
            header2 = header2.next;
        }
        return result.next;
    }

    public static void main(String args[])throws IOException
    {
        try{
            //input();
            //mergeTwoLists();
            testCase();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bw.flush();
        bw.close();
    }
}