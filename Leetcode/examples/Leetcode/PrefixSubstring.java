import java.io.*;
import java.util.*;

/*
Linux commands :
cp Solution.java examples/Solution1.java
cd examples
javac Solution1.java && java Solution1
cd ..
*/

class PrefixSubstring
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
            printSpace(logic(new String[]{"flower","flow","flight"}));
            println("fl");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic(new String[]{"dog","racecar","car"}));
            println("");;
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic(new String[]{"","b"}));
            println("");;
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic(new String[]{"ab","a"}));
            println("a");;
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static void input() throws IOException{

    }

    static String logicRecurse(String[] strs, int counter, StringBuilder sb){
        if(counter>=strs[0].length())
            return sb.toString();
        for(int i=1; i<strs.length; i++){
            if(strs[i].length()==counter)
                return sb.toString();
            if(strs[i].charAt(counter)!=strs[0].charAt(counter))
                return sb.toString();
        }
        sb.append(strs[0].charAt(counter));
        return logicRecurse(strs, counter+1, sb);
    }

    static String logic(String[] strs) throws IOException{
        if(strs.length==0)
            return "";
        return logicRecurse(strs, 0, new StringBuilder());
    }

    /*
    static String logicOld(String[] strs) throws IOException{
       String answer="";
       boolean found=true;
       int max_length=Integer.MIN_VALUE;
       int max_length_str = -1;
       int counter=0;
       for(int i=0; i<strs.length; i++){
           if(strs[i].length()>max_length){
                max_length=strs[i].length();
                max_length_str=i;
            }
            if(strs[i].length()==0)
                return "";
       }
       while(counter<max_length && found){
           for(int i=0; i<strs.length; i++){
               if(i!=max_length_str){
                    if(counter==strs[i].length()){
                        found=false;
                        break;
                    }
                    if(strs[i].charAt(counter)!=strs[max_length_str].charAt(counter)){
                        found=false;
                        break;
                    }
               }
           }
           if(found==true){
               answer+=strs[max_length_str].charAt(counter);
               counter++;
           }
       }
       return answer;
    }
    */

    public static void main(String args[])throws IOException
    {
        try{
            input();
            //logic(new String[]{"flower","flow","flight"});
            testCase();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bw.flush();
        bw.close();
    }
}