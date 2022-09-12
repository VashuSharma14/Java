class Str{ 
public static void main(String args[]){
    String s="Java";
    System.out.println("String after concatenation="+s.concat("Welcome"));       //(i)
    System.out.println("Character at index 1="+s.charAt(1));                     //(ii)  
    System.out.println("Index of first a="+s.indexOf('a'));                      // (iii)
    System.out.println("Index of second a="+s.indexOf(('a'),s.indexOf('a')+1)); //(iv)
    System.out.println(s.compareTo("JAVA"));                                     //(v)
    System.out.println(s.equalsIgnoreCase("JAVA"));                              //(vi)
    System.out.println("last occurence index of a="+s.lastIndexOf('a'));           //(vii)
    }


