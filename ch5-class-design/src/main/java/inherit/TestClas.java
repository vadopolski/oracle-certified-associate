package inherit;

public class TestClas {
    public static void main(String[] args) {
        ParentClass a = new ChildClassA("classA", "585");
        ParentClass z = new ChildClassZ("classB", 1024);
        
        a.name = "changedName";
        
        ParentClass originalState2 = null;
    
        System.out.println("Test Test");
        
        switch (z.type) {
            case "A":
                originalState2 = new ChildClassA((ChildClassA)z);
            case "Z":
                originalState2 = new ChildClassZ((ChildClassZ)z);
        }
    
        System.out.println("The original name is " + originalState2.name + " and the type is " + originalState2.type +
            ", the value is " + ((ChildClassZ)originalState2).size);
    }
}
