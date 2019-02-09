import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class Main {
    //给定的10个ciphertext以及target ciphertext
    private final String string_cipher_text01 = "315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a804e5ee9fa40b1" +
            "6349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137dae857553ccd8883a7bc37520e06e515d22c954eba50";
    private final String string_cipher_text02 = "234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548b12b07df" +
            "44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9382b0bc2c5c4b45f919cf3a9f1cb741";
    private final String string_cipher_text03 = "32510ba9a7b2bba9b8005d43a304b5714cc0bb0c8a34884dd91304b8ad40b62b07df" +
            "44ba6e9d8a2368e51d04e0e7b207b70b9b8261112bacb6c866a232dfe257527dc29398f5f3251a0d47e503c66e935de812";
    private final String string_cipher_text04 = "32510ba9aab2a8a4fd06414fb517b5605cc0aa0dc91a8908c2064ba8ad5ea06a0290" +
            "56f47a8ad3306ef5021eafe1ac01a81197847a5c68a1b78769a37bc8f4575432c198ccb4ef63590256e305cd3a9544ee41";
    private final String string_cipher_text05 = "3f561ba9adb4b6ebec54424ba317b564418fac0dd35f8c08d31a1fe9e24fe56808c2" +
            "13f17c81d9607cee021dafe1e001b21ade877a5e68bea88d61b93ac5ee0d562e8e9582f5ef375f0a4ae20ed86e935de812";
    private final String string_cipher_text06 = "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd2061bbde24eb76a19d8" +
            "4aba34d8de287be84d07e7e9a30ee714979c7e1123a8bd9822a33ecaf512472e8e8f8db3f9635c1949e640c621854eba0d";
    private final String string_cipher_text07 = "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd90f1fa6ea5ba47b01c9" +
            "09ba7696cf606ef40c04afe1ac0aa8148dd066592ded9f8774b529c7ea125d298e8883f5e9305f4b44f915cb2bd05af513";
    private final String string_cipher_text08 = "315c4eeaa8b5f8bffd11155ea506b56041c6a00c8a08854dd21a4bbde54ce56801d9" +
            "43ba708b8a3574f40c00fff9e00fa1439fd0654327a3bfc860b92f89ee04132ecb9298f5fd2d5e4b45e40ecc3b9d59e941";
    private final String string_cipher_text09 = "271946f9bbb2aeadec111841a81abc300ecaa01bd8069d5cc91005e9fe4aad6e04d5" +
            "13e96d99de2569bc5e50eeeca709b50a8a987f4264edb6896fb537d0a716132ddc938fb0f836480e06ed0fcd6e9759f404";
    private final String string_cipher_text10 = "466d06ece998b7a2fb1d464fed2ced7641ddaa3cc31c9941cf110abbf409ed395980" +
            "05b3399ccfafb61d0315fca0a314be138a9f32503bedac8067f03adbf3575c3b8edc9ba7f537530541ab0f9f3cd04ff50d";
    private final String target_text = "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e90" +
            "52ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904";
    private final String guest_key = "66396e89c9dbd8cc9874352acd6395102eafce78aa7fed28a07f6bc98d29c50b69b0" +
            "339a19f8aa401a9c6d708f80c066c763fef0123148cdd8e802d05ba98777335daefcecd59c433a6b268b60bf4eF03C9A61";

    //将每一个ciphertext转换成为BigInteger
    private BigInteger bigIntegerText01 = new BigInteger(string_cipher_text01,16);
    private BigInteger bigIntegerText02 = new BigInteger(string_cipher_text02,16);
    private BigInteger bigIntegerText03 = new BigInteger(string_cipher_text03,16);
    private BigInteger bigIntegerText04 = new BigInteger(string_cipher_text04,16);
    private BigInteger bigIntegerText05 = new BigInteger(string_cipher_text05,16);
    private BigInteger bigIntegerText06 = new BigInteger(string_cipher_text06,16);
    private BigInteger bigIntegerText07 = new BigInteger(string_cipher_text07,16);
    private BigInteger bigIntegerText08 = new BigInteger(string_cipher_text08,16);
    private BigInteger bigIntegerText09 = new BigInteger(string_cipher_text09,16);
    private BigInteger bigIntegerText10 = new BigInteger(string_cipher_text10,16);
    private BigInteger bigIntgerTargetText = new BigInteger(target_text,16);
    private BigInteger bigIntegerGuestKey = new BigInteger(guest_key,16);

    //计算过程如下
    public void calculateAndPrint(){
        try {
            System.out.println(bigIntegerText01);
            System.out.println("Plaintext 01: " + new String(bigIntegerGuestKey.xor(bigIntegerText01).toByteArray(), "GBK"));
            System.out.println("Plaintext 02: " + new String(bigIntegerGuestKey.xor(bigIntegerText02).toByteArray(), "GBK"));
            System.out.println("Plaintext 03: " + new String(bigIntegerGuestKey.xor(bigIntegerText03).toByteArray(), "GBK"));
            System.out.println("Plaintext 04: " + new String(bigIntegerGuestKey.xor(bigIntegerText04).toByteArray(), "GBK"));
            System.out.println("Plaintext 05: " + new String(bigIntegerGuestKey.xor(bigIntegerText05).toByteArray(), "GBK"));
            System.out.println("Plaintext 06: " + new String(bigIntegerGuestKey.xor(bigIntegerText06).toByteArray(), "GBK"));
            System.out.println("Plaintext 07: " + new String(bigIntegerGuestKey.xor(bigIntegerText07).toByteArray(), "GBK"));
            System.out.println("Plaintext 08: " + new String(bigIntegerGuestKey.xor(bigIntegerText08).toByteArray(), "GBK"));
            System.out.println("Plaintext 09: " + new String(bigIntegerGuestKey.xor(bigIntegerText09).toByteArray(), "GBK"));
            System.out.println("Plaintext 10: " + new String(bigIntegerGuestKey.xor(bigIntegerText10).toByteArray(), "GBK"));
            System.out.println("Target Text : " + new String(bigIntegerGuestKey.xor(bigIntgerTargetText).toByteArray(), "GBK"));
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Main().calculateAndPrint();
    }
}