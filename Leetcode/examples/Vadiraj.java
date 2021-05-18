import java.io.*;
import java.util.*;

/*
Linux commands :
cp Solution.java examples/Solution1.java
cd examples
javac Solution1.java && java Solution1
cd ..
*/

class Vadiraj
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
            printSpace(logic("abc"));
            println("abc");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic("abaasass"));
            println("aba2sas2");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic("a"));
            println("a");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic("aabbbccccdddddeeeeee"));
            println("a2b3c4d5e6");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic("pqrr"));
            println("pqr2");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");

            startTime = System.currentTimeMillis();
            printSpace(logic("ppqrr"));
            println("p2qr2");
            stopTime = System.currentTimeMillis();

            startTime = System.currentTimeMillis();
            printSpace(logic("abaaaaaaaaaaaabbbbbbbbbzzzzzzzzzz"));
            println("aba12b9c10");
            stopTime = System.currentTimeMillis();

            startTime = System.currentTimeMillis();
            printSpace(logic(""));
            println("");
            stopTime = System.currentTimeMillis();
            println((stopTime - startTime)+" ms");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static String input() throws IOException{
        return readLine();
    }

    static String logic(String str) throws IOException{
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0; i<str.length(); i++){
            if(i!=str.length()-1 && str.charAt(i)==str.charAt(i+1))
                count++;
            else{
                if(count==1)
                    sb.append(str.charAt(i));
                else
                    sb.append(str.charAt(i)+String.valueOf(count));
                count=1;
            }
        }

        return sb.toString();
    }

    public static void main(String args[])throws IOException
    {
        try{
            //String str = input();
            //logic(str);
            testCase();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bw.flush();
        bw.close();
    }
}