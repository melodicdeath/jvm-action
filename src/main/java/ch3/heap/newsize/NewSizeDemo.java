
package ch3.heap.newsize;

/**
 * -Xmx20m -Xms20m -Xmn1m   -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * -Xmx20m -Xms20m -Xmn7m   -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * -Xmx20m -Xms20m -Xmn15m  -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * 
 * -Xmx20M -Xms20M -XX:NewRatio=2  -XX:+PrintGCDetails
 *
 * SurvivorRatio 设置年轻代中Eden区与Survivor区的大小比值，设置为4，则两个Survivor区与一个Eden区的比值为2:4，一个Survivor区占整个年轻代的1/6
 * NewRatio 设置年轻代（包括Eden和两个Survivor区）与年老代的比值（除去持久代）。设置为4，则年轻代与年老代所占比值为1：4，年轻代占整个堆栈的1/5
 * @author Geym
 */
public class NewSizeDemo {
    public static void main(String[] args) {
       byte[] b=null;
       for(int i=0;i<10;i++)
           b=new byte[1*1024*1024];
    }
}
