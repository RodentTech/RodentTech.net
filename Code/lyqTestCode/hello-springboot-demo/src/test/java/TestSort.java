public class TestSort{
/*
    Test the sort method of the Sort class.
*/
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        if (input != expected){
            System.out.println("Something wrong with Sort.sort()!");
        }
    }

    public static void main(String[] args){
        testSort();
    }
}