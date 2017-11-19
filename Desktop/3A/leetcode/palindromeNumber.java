import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class palindromeNumber {
    public static int palindromeNumbers(String s) {
          HashMap <Character,Integer> hashMap = new HashMap<>();
          int ans = 0;
          for (int i = 0,j = 0; i < s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                j = Math.max(j,hashMap.get(s.charAt(i)));
            }
            hashMap.put(s.charAt(i), i+1);
            ans = Math.max(ans,i-j+1);
            
          }
          return ans;
        }
        public static void main(String[] args) {
            int[] stringArray = {2,7,11,15};
            System.out.println(new palindromeNumber.palindromeNumbers(12223455432221));
        }
    };