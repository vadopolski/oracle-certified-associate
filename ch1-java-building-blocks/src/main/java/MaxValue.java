public class MaxValue {

    public static final int DIVERGENCY = 1;

    public byte countByteMaxValue() {
        return (byte) (Math.pow(2, Byte.SIZE - DIVERGENCY) - DIVERGENCY);
    }

    public short countShortMaxValue() {
        return (short) (Math.pow(2, Short.SIZE - DIVERGENCY) - DIVERGENCY);
    }

    public int countIntMaxValue() {
        return (int) Math.pow(2, Integer.SIZE - DIVERGENCY);
    }

    public long countLongMaxValue() {
        return (long) Math.pow(2, Long.SIZE - DIVERGENCY);
    }

    public float countFloatMaxValue(){
        return (float) Math.pow(2.0, Float.SIZE - DIVERGENCY);
    }

}