import java.math.BigInteger;
class Add_Binary {
    public String addBinary(String a, String b) {
        
        
         BigInteger biga = new BigInteger(a, 2);
         BigInteger bigb = new BigInteger(b, 2);
         BigInteger sum;
        sum = biga.add(bigb);
        return sum.toString(2);
    }
}