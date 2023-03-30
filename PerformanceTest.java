import java.util.List;
import java.util.ArrayList;
import java.lang.String;
class StudentRecord{
    private final String name;
    private final int id;
    private final double gpa;

    public StudentRecord(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public String GetName(){
        return name;
    }
    public String GetId(){
        return id;
    }
    public String GetGPA(){
        return gpa;
    }
}
public class PerformanceTest {
    public static void main(String[] args){

        List<StudentRecord> list = new ArrayList<StudentRecord>();

        int size = 10;

        for (int i = 0; i <= size; i++){
            list.add(new StudentRecord());
            Runtime runtime = Runtime.getRuntime();
            runtime.gc();
            long memory = runtime.totalMemory() - runtime.freeMemory();
            list.add(new StudentRecord());
            System.out.println(memory);
            long objSize = runtime.totalMemory()-(memory+runtime.freeMemory());
            System.out.println("Size of the stored object: " + objSize + " bytes");
            long calculatedSize = objSize*size;
            System.out.println("Size of the stored collection: " + calculatedSize + " bytes");
            System.out.println("Used memory: " + memory + " bytes");
            System.out.println("Memory overhead: " + (memory-calculatedSize) + " bytes");
        }

    }
}
