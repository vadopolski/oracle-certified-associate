public class DefaultInitialization {

    public int intClassVariable;
    public boolean booleanClassVariable;
    public String stringClassVariable;
    public String s2;

    public String getNewString(String s1){
//        String s2; Does not compile without initialization

        String result = s1 + s2;

        return result;
    }
}
