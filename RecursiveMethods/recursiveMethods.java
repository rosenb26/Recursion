 public class recursiveMethods {

     /*The following four methods are exercises from Koffman
       page 253.*/
     // ======================================================================  
     public int length(String s) {
         if (s == null || s.equals("")) {
             return 0;
         }
         return 1 + length(s.substring(1));
     }

     public int toNumber(String s) {
         if (this.length(s) == 1) {
             try {
                 return Integer.parseInt(s);
             } catch (NumberFormatException e) {
                 return 0;
             }
         }
         return this.toNumber(s.substring(0, 1)) + this.toNumber(s.substring(1));
     }

     public String stutter(String s) {
         if (this.length(s) == 1) {
             return s + s;
         }
         return this.stutter(s.substring(0, 1)) + this.stutter(s.substring(1));
     }

     public boolean searchString(String s, char c) {
         if (s == null || s.equals("")) {
             return false;
         }
         if (s.charAt(0) == c) {
             return true;
         }
         return searchString(s.substring(1), c);
     }
     // ======================================================================

     /*Codingbat recursion problems*/
     // ======================================================================


     public int factorial(int n) {
         if (n < 0) {
             throw new IllegalArgumentException();
         }
         if (n == 0) {
             return 1;
         }
         return n * this.factorial(n - 1);
     }

     public int bunnyEars(int bunnies) {
         if (bunnies <= 0) {
             return 0;
         }
         return 2 + this.bunnyEars(bunnies - 1);
     }

     public int fibonacci(int n) {
         if (n == 0) {
             return 0;
         }
         if (n == 1) {
             return 1;
         }
         return this.fibonacci(n - 1) + this.fibonacci(n - 2);
     }

     public int bunnyEars2(int bunnies) {
         if (bunnies <= 0) {
             return 0;
         }
         if (bunnies % 2 == 0) {
             return 3 + this.bunnyEars2(bunnies - 1);
         }
         return 2 + this.bunnyEars2(bunnies - 1);
     }

     public int triangle(int rows) {
         if (rows <= 0) {
             return 0;
         }
         return rows + this.triangle(rows - 1);
     }

     public int sumDigits(int n) {
         if (n <= 0) {
             return 0;
         }
         if (n < 10) {
             return n;
         }
         return this.sumDigits(n / 10) + this.sumDigits(n % 10);
     }

     public int count7(int n) {
         if (n <= 0) {
             return 0;
         }
         if (n < 10) {
             if (n == 7) {
                 return 1;
             }
             return 0;
         }
         return this.count7(n / 10) + this.count7(n % 10);
     }

     public int count8(int n) {
         if (n < 10) {
             if (n == 8) {
                 return 1;
             }
             return 0;
         }
         int head = n / 10;
         int tail = n % 10;

         if (head % 10 == 8 && tail == 8) {
             return count8(head) + 2;
         }
         return count8(head) + count8(tail);
     }

     public int powerN(int base, int n) {
         if (n == 1) {
             return base;
         }
         return base * this.powerN(base, n - 1);

     }

     public int countX(String s) {
         if (s == null || s.equals("")) {
             return 0;
         }
         if (this.length(s) == 1) {
             if (s.equals("x")) {
                 return 1;
             }
             return 0;
         }
         return this.countX(s.substring(0, 1)) + this.countX(s.substring(1));
     }

     public int countHi(String s) {
         if (s == null || this.length(s) < 2) {
             return 0;
         }
         if (this.length(s) == 2) {
             if (s.equals("hi")) {
                 return 1;
             }
             return 0;
         }
         String head = s.substring(0, this.length(s) - 2);
         String tail = s.substring(this.length(s) - 2);
         if (head.substring(this.length(head) - 1).equals("h") &&
             tail.substring(0, 1).equals("i")) {
             return 1 + this.countHi(head) + this.countHi(tail);
         }
         return this.countHi(head) + this.countHi(tail);
     }

     public String changeXY(String s) {
         if (s == null || s.equals("")) {
             return "";
         }
         if (this.length(s) == 1) {
             if (s.equals("x")) {
                 return "y";
             }
             return s;
         }

         return this.changeXY(s.substring(0, 1)) + this.changeXY(s.substring(1));
     }

     public String changePi(String s) {
         if (s == null || this.length(s) < 2) {
             return s;
         }
         if (this.length(s) == 2) {
             if (s.equals("pi")) {
                 return "3.14";
             }
             return s;
         }
         String head = s.substring(0, this.length(s) - 2);
         String tail = s.substring(this.length(s) - 2);
         if (head.substring(this.length(head) - 1).equals("p") &&
             tail.substring(0, 1).equals("i")) {
             return this.changePi(head.substring(0, this.length(head) - 1) +
                 "3.14" + this.changePi(tail.substring(1)));
         }
         return this.changePi(head) + this.changePi(tail);
     }

     public String noX(String s) {
         if (s == null || s.equals("")) {
             return "";
         }
         if (this.length(s) == 1) {
             if (s.equals("x")) {
                 return "";
             }
             return s;
         }
         return this.noX(s.substring(0, 1)) + this.noX(s.substring(1));
     }

     public boolean array6(int[] nums, int index) {

         if (index == nums.length) {
             return false;
         }
         if (nums[index] == 6) {
             return true;
         }
         return this.array6(nums, index + 1);
     }

     public int array11(int[] nums, int index) {
         if (index == nums.length) {
             return 0;
         }

         int count = 0;
         if (nums[index] == 11) {
             count++;
         }
         return count + this.array11(nums, index + 1);
     }

     public boolean array220(int[] nums, int index) {
         if (index >= nums.length - 1) {
             return false;
         }
         if (nums[index + 1] == nums[index] * 10) {
             return true;
         }
         return this.array220(nums, index + 1);
     }

     public String allStar(String s) {
         if (s == null || this.length(s) < 2) {
             return s;
         }

         return s.substring(0, 1) + "*" + this.allStar(s.substring(1));

     }

     public String pairStar(String s) {
         if (s == null || this.length(s) < 2) {
             return s;
         }
         if (s.substring(0, 1).equals(s.substring(1, 2))) {
             return s.substring(0, 1) + "*" + this.pairStar(s.substring(1));
         }
         return s.substring(0, 1) + this.pairStar(s.substring(1));

     }

     public String endX(String s) {
         if (s == null || s.equals("") || this.length(s) == 1) {
             return s;
         }

         if (s.equals(s.substring(1) + s.substring(0, 1))) {
             return s;
         }
         if (s.substring(0, 1).equals("x")) {
             return this.endX(s.substring(1)) + "x";
         }
         return s.substring(0, 1) + this.endX(s.substring(1));
     }

     public int countPairs(String s) {
         if (s == null || this.length(s) < 3) {
             return 0;
         }
         if (this.length(s) == 3) {
             if (s.substring(0, 1).equals(s.substring(2))) {
                 return 1;
             }
             return 0;
         }
         if (s.substring(0, 1).equals(s.substring(2, 3))) {
             return 1 + this.countPairs(s.substring(1));
         }
         return this.countPairs(s.substring(1));
     }

     public int countAbc(String s) {
         if (s == null || this.length(s) < 3) {
             return 0;
         }
         if (this.length(s) == 3) {
             if (s.equals("abc") || s.equals("aba")) {
                 return 1;
             }
             return 0;
         }
         if (s.substring(0, 1).equals("a") && (s.substring(1, 3).equals("bc") ||
                 s.substring(1, 3).equals("ba"))) {
             return 1 + this.countAbc(s.substring(1));
         }
         return this.countAbc(s.substring(1));
     }

     public int count11(String s) {
         if (s == null || this.length(s) < 2) {
             return 0;
         }
         if (this.length(s) == 2) {
             if (s.equals("11")) {
                 return 1;
             }
             return 0;
         }
         if (s.substring(0, 2).equals("11")) {

             return 1 + this.count11(s.substring(2));

         }
         return this.count11(s.substring(1));
     }

     public String stringClean(String s) {
         if (s == null || this.length(s) <= 1) {
             return s;
         }
         if (this.length(s) == 2) {
             if (s.substring(0, 1).equals(s.substring(1))) {
                 return s.substring(0, 1);
             }
             return s;
         }
         if (s.substring(0, 1).equals(s.substring(1, 2))) {
             return this.stringClean(s.substring(1));
         }
         return s.substring(0, 1) + this.stringClean(s.substring(1));
     }

     public int countHi2(String s) {
         if (s == null || this.length(s) < 2) {
             return 0;
         }
         if (this.length(s) == 2) {
             if (s.equals("hi")) {
                 return 1;
             }
             return 0;
         }
         if (s.substring(1, 3).equals("hi")) {
             if (s.substring(0, 1).equals("x")) {
                 return this.countHi2(s.substring(1)) - 1;
             }
             return this.countHi2(s.substring(3)) + 1;
         }
         if (s.substring(0, 2).equals("hi")) {
             return this.countHi2(s.substring(2)) + 1;
         }
         return this.countHi2(s.substring(1));
     }

     public String parenBit(String s) {
         if (s == null || this.length(s) < 2) {
             return null;
         }
         if (!s.substring(0, 1).equals("(")) {
             return this.parenBit(s.substring(1));
         }
         if (!s.substring(this.length(s) - 1).equals(")")) {
             return this.parenBit(s.substring(0, this.length(s) - 1));
         }
         return s;
     }

     public boolean nestParen(String s) {
         if (s == null || this.length(s) == 1) {
             return false;
         }
         if (s.equals("")) {
             return true;
         }
         if (!s.substring(0, 1).equals("(") ||
             !s.substring(this.length(s) - 1).equals(")")) {
             return false;
         }
         return this.nestParen(s.substring(1, this.length(s) - 1));
     }

     public int strCount(String s, String sub) {
         if (s == null || this.length(s) < this.length(sub)) {
             return 0;
         }
         if (s.substring(0, this.length(sub)).equals(sub)) {
             return 1 + this.strCount(s.substring(this.length(sub)), sub);
         }
         return this.strCount(s.substring(1), sub);
     }

     public boolean strCopies(String s, String sub, int n) {
         if (s == null || this.length(s) < this.length(sub)) {
             return false;
         }
         if (n <= 0) {
             return true;
         }
         if (n == 1) {
             if (s.substring(0, this.length(sub)).equals(sub)) {
                 return true;
             }
             return this.strCopies(s.substring(1), sub, 1);
         }
         if (s.substring(0, this.length(sub)).equals(sub)) {
             return this.strCopies(s.substring(1), sub, n - 1);
         }
         return this.strCopies(s.substring(1), sub, n);
     }

     public int strDist(String s, String sub) {
         if (s == null || this.length(s) < this.length(sub) ||
             s.equals("")) {
             return 0;
         }
         if (this.length(s) == 1) {
             if (!s.equals(sub)) {
                 return 0;
             }
         }

         if (s.equals(sub)) {
             return this.length(s);
         }

         if (s.substring(0, this.length(sub)).equals(sub)) {
             if (s.substring(this.length(s) - this.length(sub)).equals(sub)) {
                 return this.length(s);
             }
             return this.strDist(s.substring(0, this.length(s) - 1), sub);
         }
         if (s.substring(this.length(s) - this.length(sub)).equals(sub)) {
             return this.strDist(s.substring(1), sub);
         }
         return this.strDist(s.substring(1, this.length(s) - 1), sub);
     }
     // ======================================================================

     public static void main(String[] args) {
         recursiveMethods tester = new recursiveMethods();


         System.out.println(tester.count11("abc11x11x11"));
         System.out.println(tester.count11("1111"));
         System.out.println(tester.count11("11abc11"));

     }
 }